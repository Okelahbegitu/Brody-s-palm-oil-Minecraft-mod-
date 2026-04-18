package net.palmoil;

import com.google.common.base.Suppliers;
import dev.architectury.registry.client.rendering.RenderTypeRegistry;
import dev.architectury.registry.registries.RegistrarManager;
import net.minecraft.client.renderer.RenderType;
import net.palmoil.registry.ModBlock;
import net.palmoil.registry.ModFuel;
import net.palmoil.registry.ModItem;

import java.util.function.Supplier;

public class PalmOil {
    public static final String MOD_ID = "palmoil";

    public static final Supplier<RegistrarManager> REGISTRIES = Suppliers.memoize(() -> RegistrarManager.get(MOD_ID));

    public static void init() {
        ModBlock.register();
        ModItem.register();
        ModFuel.register();
        //System.out.println(ExampleExpectPlatform.getConfigDirectory().toAbsolutePath().normalize().toString());
    }
}
