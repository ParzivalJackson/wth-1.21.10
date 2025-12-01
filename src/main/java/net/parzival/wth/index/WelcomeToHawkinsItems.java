package net.parzival.wth.index;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.parzival.wth.WelcomeToHawkins;

public class WelcomeToHawkinsItems {



   public static final Item NAIL_BAT = registerItem("nail_bat",
            new Item(new Item.Settings()
                    .maxCount(1)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM,
                            Identifier.of(WelcomeToHawkins.MOD_ID, "nail_bat")))
            ));

    public static final Item NAILS = registerItem("nails",
            new Item(new Item.Settings()
                    .maxCount(64)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM,
                            Identifier.of(WelcomeToHawkins.MOD_ID, "nails")))
            ));

    private static Item registerItem(String name, Item item) {
        return Registry.register(
                Registries.ITEM,
                Identifier.of(WelcomeToHawkins.MOD_ID, name),
                item
        );
    }

    public static void registerWelcomeToHawkinsItems() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.add(NAIL_BAT);
            entries.add(NAILS);
        });
    }
}