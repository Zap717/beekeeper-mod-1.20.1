package com.fosoterritory.minecraft.beekeepermod;

import com.fosoterritory.minecraft.beekeepermod.datagen.ModItemTagProvider;
import com.fosoterritory.minecraft.beekeepermod.datagen.ModModelProvider;
import com.fosoterritory.minecraft.beekeepermod.datagen.ModPoiTagProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class BeekeeperModDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModPoiTagProvider::new);
		pack.addProvider(ModItemTagProvider::new);
		pack.addProvider(ModModelProvider::new);
	}
}
