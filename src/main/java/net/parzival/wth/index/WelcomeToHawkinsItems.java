package net.parzival.wth.index;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.*;
import net.minecraft.util.Identifier;
import net.parzival.wth.WelcomeToHawkins;

public class WelcomeToHawkinsItems {


    public static final Item NAIL_BAT = create("nail_bat");
    public static final Item NAILS = create("nails");


    private static Item create(String name) {
        // Pre-set registry key (fixes the 1.21.10 null-ID crash)
        RegistryKey<Item> key = RegistryKey.of(
                RegistryKeys.ITEM,
                Identifier.of(WelcomeToHawkins.MOD_ID, name)
        );

        return new Item(new Item.Settings().registryKey(key));
    }

    private static void registerItem(String name, Item item) {
        Registry.register(
                Registries.ITEM,
                Identifier.of(WelcomeToHawkins.MOD_ID, name),
                item
        );
    }

    public static void registerWelcomeToHawkinsItems() {
        registerItem("nail_bat", NAIL_BAT);
        registerItem("nails", NAILS);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.add(NAIL_BAT);
            entries.add(NAILS);
        });
    }
}
