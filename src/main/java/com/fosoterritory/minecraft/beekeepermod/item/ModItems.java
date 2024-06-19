package com.fosoterritory.minecraft.beekeepermod.item;

import com.fosoterritory.minecraft.beekeepermod.BeekeeperMod;
import com.fosoterritory.minecraft.beekeepermod.block.ModBlocks;
import com.fosoterritory.minecraft.beekeepermod.sound.ModSounds;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    private static void addItemsToFunctionalItemGroup(FabricItemGroupEntries entries) {
        entries.add(ModBlocks.HONEY_EXTRACTOR_BLOCK);
    }
    private static void addItemsToToolsItemGroup(FabricItemGroupEntries entries) {
        entries.add(ModItems.MULE_MUSIC_DISC);
    }

    public static final Item MULE_MUSIC_DISC = registerItem("mule_music_disc",
            new MusicDiscItem(7, ModSounds.MULE, new FabricItemSettings().maxCount(1), 142));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(BeekeeperMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        BeekeeperMod.LOGGER.info("Registering Mod Items for " + BeekeeperMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(ModItems::addItemsToFunctionalItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::addItemsToToolsItemGroup);
    }
}
