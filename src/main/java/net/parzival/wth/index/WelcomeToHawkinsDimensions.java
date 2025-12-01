package net.parzival.wth.index;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.world.World;
import net.minecraft.util.Identifier;

public class WelcomeToHawkinsDimensions {
    public static final RegistryKey<World> UPSIDE_DOWN = RegistryKey.of(
            RegistryKeys.WORLD,
            Identifier.of("wth", "upside_down")
    );

    public static void registerWelcomeToHawkinsDimensions() {
    }
}
