package net.palmoil.registry.worldgen;

import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;

public class PalmTreeGrower extends AbstractTreeGrower {

    @Nullable
    @Override
    protected ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource random, boolean flowers) {
        return null;
    }

    // TAMBAHKAN INI: Memaksa bypass pengecekan ConfiguredFeature
    @Override
    public boolean growTree(ServerLevel level, net.minecraft.world.level.chunk.ChunkGenerator chunkGen, BlockPos pos, BlockState state, RandomSource random) {
        // Panggil logika NBT kita (buatkan method terpisah agar rapi)
        return this.spawnNbtStructure(level, pos, random);
    }

    private boolean spawnNbtStructure(ServerLevel level, BlockPos pos, RandomSource random) {
        var manager = level.getServer().getStructureManager();
        // CEK NAMA: Di kode kamu "palm_oil_tree", pastikan file NBT-nya juga "palm_oil_tree.nbt"
        Optional<StructureTemplate> templateOpt = manager.get(new ResourceLocation("palmoil", "palm_oil_tree"));

        if (templateOpt.isPresent()) {
            StructureTemplate template = templateOpt.get();

            // Hapus sapling
            level.setBlock(pos, Blocks.AIR.defaultBlockState(), 3);

            // Offset: Sesuaikan agar batang pohon muncul di koordinat sapling
            BlockPos spawnPos = pos.offset(-6, 0, -6);

            StructurePlaceSettings settings = new StructurePlaceSettings()
                    .setIgnoreEntities(false)
                    .addProcessor(net.minecraft.world.level.levelgen.structure.templatesystem.BlockIgnoreProcessor.STRUCTURE_AND_AIR);

            template.placeInWorld(level, spawnPos, spawnPos, settings, random, 3);

            // Logika Decay Daun
            BlockPos.betweenClosed(spawnPos, spawnPos.offset(template.getSize())).forEach(p -> {
                BlockState s = level.getBlockState(p);
                if (s.getBlock() instanceof LeavesBlock) {
                    // Set ke distance 1 agar sistem trigger pengecekan ulang ke log terdekat
                    level.setBlock(p, s.setValue(LeavesBlock.PERSISTENT, false).setValue(LeavesBlock.DISTANCE, 1), 3);
                }
            });
            return true;
        } else {
            // Ini akan muncul di log jika file NBT tidak ditemukan
            System.out.println("LOG: File NBT palmoil:palm_oil_tree tidak ditemukan!");
        }
        return false;
    }
}