package com.fosoterritory.minecraft.beekeepermod.block;

import com.fosoterritory.minecraft.beekeepermod.BeekeeperMod;
import com.fosoterritory.minecraft.beekeepermod.block.custom.HoneyExtractorBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block HONEY_EXTRACTOR_BLOCK = registerBlock("honey_extractor_block",
            new HoneyExtractorBlock(FabricBlockSettings.copyOf(Blocks.FURNACE).sounds(BlockSoundGroup.WOOD).luminance(0)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(BeekeeperMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(BeekeeperMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        BeekeeperMod.LOGGER.info("Registering ModBlocks for " + BeekeeperMod.MOD_ID);
    }
}
