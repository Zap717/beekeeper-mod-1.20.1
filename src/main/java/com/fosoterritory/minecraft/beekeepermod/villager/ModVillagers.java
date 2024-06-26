package com.fosoterritory.minecraft.beekeepermod.villager;

import com.fosoterritory.minecraft.beekeepermod.BeekeeperMod;
import com.fosoterritory.minecraft.beekeepermod.block.ModBlocks;
import com.google.common.collect.ImmutableSet;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterestType;

public class ModVillagers {
    public static final RegistryKey<PointOfInterestType> BEEKEEPER_POI_KEY = poiKey("beekeeperpoi");
    public static final PointOfInterestType BEEKEEPER_POI = registerPoi("beekeeperpoi", ModBlocks.HONEY_EXTRACTOR_BLOCK);

    public static final VillagerProfession BEEKEEPER = registerProfession("beekeeper", BEEKEEPER_POI_KEY);



    private static VillagerProfession registerProfession(String name, RegistryKey<PointOfInterestType> type) {
        return Registry.register(Registries.VILLAGER_PROFESSION, new Identifier(BeekeeperMod.MOD_ID, name),
                new VillagerProfession(name, entry -> entry.matchesKey(type), entry -> entry.matchesKey(type),
                        ImmutableSet.of(), ImmutableSet.of(), SoundEvents.ENTITY_VILLAGER_WORK_WEAPONSMITH));
    }

    private static PointOfInterestType registerPoi(String name, Block block) {
        return PointOfInterestHelper.register(new Identifier(BeekeeperMod.MOD_ID, name), 1, 1, block);
    }

    private static RegistryKey<PointOfInterestType> poiKey(String name) {
        return RegistryKey.of(RegistryKeys.POINT_OF_INTEREST_TYPE, new Identifier(BeekeeperMod.MOD_ID, name));
    }

    public static void registerVillagers() {
        BeekeeperMod.LOGGER.info("Registering Villagers " + BeekeeperMod.MOD_ID);
    }
}
