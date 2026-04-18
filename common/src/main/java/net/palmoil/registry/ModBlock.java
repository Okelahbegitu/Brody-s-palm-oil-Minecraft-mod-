package net.palmoil.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;
import net.palmoil.PalmOil;
import net.palmoil.registry.block.*;

public class ModBlock {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(PalmOil.MOD_ID, Registries.BLOCK);

    public static final RegistrySupplier<Block> PALM_OIL_LOG =
            BLOCKS.register("palm_oil_log", PalmOilLog::new);

    public static final RegistrySupplier<Block> PALM_OIL_LEAVES =
            BLOCKS.register("palm_oil_leaves", PalmOilLeaves::new);

    public static final RegistrySupplier<Block> PALM_OIL_STEM_LEAVES =
            BLOCKS.register("palm_oil_stem_leaves", PalmOilStemLeaves::new);

    public static final RegistrySupplier<Block> PALM_OIL_FRUITS_BLOCK =
            BLOCKS.register("palm_oil_fruit_block", PalmOilFruitBlock::new);

    public static final RegistrySupplier<Block> PALM_OIL_SAPLING =
            BLOCKS.register("palm_oil_sapling", PalmOilSapling::new);

    public static void register() {
        BLOCKS.register();
    }
}

