package com.fosoterritory.minecraft.beekeepermod.block.entity;

import com.fosoterritory.minecraft.beekeepermod.BeekeeperMod;
import com.fosoterritory.minecraft.beekeepermod.block.ModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {
    public static final BlockEntityType<HoneyExtractorBlockEntity> HONEY_EXTRACTOR_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(BeekeeperMod.MOD_ID, "honey_extractor_block_entity"),
                    FabricBlockEntityTypeBuilder.create(HoneyExtractorBlockEntity::new,
                            ModBlocks.HONEY_EXTRACTOR_BLOCK).build());

    public static void registerBlockEntities() {
        BeekeeperMod.LOGGER.info("Registering Block Entities for " + BeekeeperMod.MOD_ID);
    }
}
