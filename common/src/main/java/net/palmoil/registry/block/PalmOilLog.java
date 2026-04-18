package net.palmoil.registry.block;

import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor; // Menggantikan Material untuk warna map

public class PalmOilLog extends RotatedPillarBlock {
    public PalmOilLog() {
        super(BlockBehaviour.Properties.of()
                .mapColor(MapColor.WOOD)
                .ignitedByLava()
                .strength(2.0f)
                .sound(SoundType.WOOD));
    }
}