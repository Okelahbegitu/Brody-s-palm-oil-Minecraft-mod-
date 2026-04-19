package net.palmoil.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.block.Block;
import net.palmoil.PalmOil;
import net.palmoil.registry.block.PalmOilStemLeaves;

public class ModItem {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(PalmOil.MOD_ID, Registries.ITEM);

    public static final RegistrySupplier<Item> PALM_OIL_LOG =
            ITEMS.register("palm_oil_log",
                    () -> new BlockItem(
                            ModBlock.PALM_OIL_LOG.get(),
                            new Item.Properties()
                                    .arch$tab(ModCreativeTabs.PALMOIL_TAB)
                    ));

    public static final RegistrySupplier<Item> PALM_OIL_PLANKS =
            ITEMS.register("palm_oil_planks",
                    () -> new BlockItem(
                            ModBlock.PALM_OIL_PLANKS.get(),
                            new Item.Properties()
                                    .arch$tab(ModCreativeTabs.PALMOIL_TAB)
                    ));

    public static final RegistrySupplier<Item> PALM_OIL_LEAVES =
            ITEMS.register("palm_oil_leaves",
                    () -> new BlockItem(
                            ModBlock.PALM_OIL_LEAVES.get(),
                            new Item.Properties()
                                    .arch$tab(ModCreativeTabs.PALMOIL_TAB)
                    ));

    public static final RegistrySupplier<Item> PALM_OIL_STEM_LEAVES =
            ITEMS.register("palm_oil_stem_leaves",
                    () -> new BlockItem(
                            ModBlock.PALM_OIL_STEM_LEAVES.get(),
                            new Item.Properties()
                                    .arch$tab(ModCreativeTabs.PALMOIL_TAB)
                    ));

    public static final RegistrySupplier<Item> PALM_OIL_FRUIT_BLOCK =
            ITEMS.register("palm_oil_fruit_block",
                    () -> new BlockItem(
                            ModBlock.PALM_OIL_FRUITS_BLOCK.get(),
                            new Item.Properties()
                                    .arch$tab(ModCreativeTabs.PALMOIL_TAB)
                    ));

    public static final RegistrySupplier<Item> PALM_OIL_SAPLING =
            ITEMS.register("palm_oil_sapling",
                    () -> new BlockItem(
                            ModBlock.PALM_OIL_SAPLING.get(),
                            new Item.Properties()
                                    .arch$tab(ModCreativeTabs.PALMOIL_TAB)
                    ));
    public static final RegistrySupplier<Item> PALM_OIL_FRUIT =
            ITEMS.register("palm_oil_fruit", () ->
                    new Item(new Item.Properties()
                            .stacksTo(64)
                            .rarity(Rarity.UNCOMMON)
                            .arch$tab(ModCreativeTabs.PALMOIL_TAB)
                    ));
    public static final RegistrySupplier<Item> PALM_OIL =
            ITEMS.register("palm_oil", () ->
                    new Item(new Item.Properties()
                            .stacksTo(16)
                            .rarity(Rarity.UNCOMMON)
                            .arch$tab(ModCreativeTabs.PALMOIL_TAB)
                    ));


    public static void register() {
        ITEMS.register();
    }
}

