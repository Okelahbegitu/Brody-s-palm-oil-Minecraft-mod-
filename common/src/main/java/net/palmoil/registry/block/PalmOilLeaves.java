package net.palmoil.registry.block;

import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

public class PalmOilLeaves extends LeavesBlock {
    public PalmOilLeaves() {
        super(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)
                .isSuffocating((state, world, pos) -> false)
                .isViewBlocking((state, world, pos) -> false));
    }
}