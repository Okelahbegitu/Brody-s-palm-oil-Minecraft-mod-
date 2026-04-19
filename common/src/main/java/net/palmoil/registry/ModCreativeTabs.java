package net.palmoil.registry;

import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.palmoil.PalmOil;

public class ModCreativeTabs {

    public static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create(PalmOil.MOD_ID, Registries.CREATIVE_MODE_TAB);

    public static final RegistrySupplier<CreativeModeTab> PALMOIL_TAB =
            TABS.register("palmoil_tab", () ->
                    CreativeTabRegistry.create(
                            Component.translatable("itemGroup.palmoil.palmoil_tab"),
                            () -> new ItemStack(ModItem.PALM_OIL_LOG.get())
                    )
            );

    public static void register() {
        TABS.register();
    }
}
