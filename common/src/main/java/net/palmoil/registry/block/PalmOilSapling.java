package net.palmoil.registry.block;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.BushBlock;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.palmoil.registry.worldgen.PalmTreeGrower;

public class PalmOilSapling extends SaplingBlock {
    public PalmOilSapling() {
        super(
                new PalmTreeGrower(),
                BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)
                        .isSuffocating((state, world, pos) -> false)
                        .isViewBlocking((state, world, pos) -> false));
    }
}


