package com.fosoterritory.minecraft.beekeepermod.item;

import com.fosoterritory.minecraft.beekeepermod.BeekeeperMod;
import com.fosoterritory.minecraft.beekeepermod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    private static void addItemsToFunctionalItemGroup(FabricItemGroupEntries entries) {
        entries.add(ModBlocks.HONEY_EXTRACTOR_BLOCK);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(BeekeeperMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        BeekeeperMod.LOGGER.info("Registering Mod Items for " + BeekeeperMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(ModItems::addItemsToFunctionalItemGroup);
    }
}
