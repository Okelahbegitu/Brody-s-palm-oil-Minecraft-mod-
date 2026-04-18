package net.palmoil.registry.block;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.palmoil.PalmOil;
import net.palmoil.registry.ModBlock;

public class PalmOilStemLeaves extends LeavesBlock {
    public PalmOilStemLeaves() {
        super(Properties.copy(Blocks.OAK_LEAVES)
                .randomTicks()
                .noOcclusion()); // Tambahkan noOcclusion agar tidak tembus pandang aneh

        this.registerDefaultState(this.stateDefinition.any()
                .setValue(DISTANCE, 7) // Default harus 7 agar sistem menghitung jarak asli ke Log
                .setValue(PERSISTENT, false)
                .setValue(WATERLOGGED, false));
    }

    @Override
    public void tick(BlockState state, ServerLevel level,
                     BlockPos pos, RandomSource random) {

        BlockPos fruitPos = pos.below();
        if (level.isEmptyBlock(fruitPos)) {
            level.setBlock(fruitPos,
                    ModBlock.PALM_OIL_FRUITS_BLOCK.get().defaultBlockState(),
                    3);
        }

        int delay = random.nextInt(20, 50);
        level.scheduleTick(pos, this, delay);
    }

}