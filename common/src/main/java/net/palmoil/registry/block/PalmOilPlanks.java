package net.palmoil.registry.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class PalmOilPlanks extends Block {
    public PalmOilPlanks() {
        super(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS));
    }
}
