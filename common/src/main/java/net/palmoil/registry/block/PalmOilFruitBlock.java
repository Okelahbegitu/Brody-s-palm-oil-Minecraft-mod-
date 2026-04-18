package net.palmoil.registry.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.MelonBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class PalmOilFruitBlock extends Block {
    public PalmOilFruitBlock() {
        super(BlockBehaviour.Properties.copy(Blocks.MELON));
    }
}
