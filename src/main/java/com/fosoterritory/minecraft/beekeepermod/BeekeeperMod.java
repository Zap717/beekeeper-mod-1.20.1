package com.fosoterritory.minecraft.beekeepermod;

import com.fosoterritory.minecraft.beekeepermod.block.ModBlocks;
import com.fosoterritory.minecraft.beekeepermod.block.entity.ModBlockEntities;
import com.fosoterritory.minecraft.beekeepermod.item.ModItems;
import com.fosoterritory.minecraft.beekeepermod.screen.ModScreenHandlers;
import com.fosoterritory.minecraft.beekeepermod.util.ModCustomTrades;
import com.fosoterritory.minecraft.beekeepermod.villager.ModVillagers;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BeekeeperMod implements ModInitializer {
	public static final String MOD_ID = "beekeepermod";
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModBlockEntities.registerBlockEntities();
		ModScreenHandlers.registerScreenHandlers();
		ModVillagers.registerVillagers();
		ModCustomTrades.registerCustomTrades();
	}
}