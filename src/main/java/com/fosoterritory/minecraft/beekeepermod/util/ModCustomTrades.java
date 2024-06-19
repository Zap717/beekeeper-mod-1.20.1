package com.fosoterritory.minecraft.beekeepermod.util;

import com.fosoterritory.minecraft.beekeepermod.villager.ModVillagers;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;

public class ModCustomTrades {
    public static void registerCustomTrades() {
        TradeOfferHelper.registerVillagerOffers(ModVillagers.BEEKEEPER, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.ALLIUM, 10),
                            new ItemStack(Items.EMERALD, 1),
                            16, 2, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.AZURE_BLUET, 10),
                            new ItemStack(Items.EMERALD, 1),
                            16, 2, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.BLUE_ORCHID, 10),
                            new ItemStack(Items.EMERALD, 1),
                            16, 2, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.CORNFLOWER, 10),
                            new ItemStack(Items.EMERALD, 1),
                            16, 2, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.DANDELION, 10),
                            new ItemStack(Items.EMERALD, 1),
                            16, 2, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.LILY_OF_THE_VALLEY, 10),
                            new ItemStack(Items.EMERALD, 1),
                            16, 2, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.OXEYE_DAISY, 10),
                            new ItemStack(Items.EMERALD, 1),
                            16, 2, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.POPPY, 10),
                            new ItemStack(Items.EMERALD, 1),
                            16, 2, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.ORANGE_TULIP, 10),
                            new ItemStack(Items.EMERALD, 1),
                            16, 2, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.PINK_TULIP, 10),
                            new ItemStack(Items.EMERALD, 1),
                            16, 2, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.RED_TULIP, 10),
                            new ItemStack(Items.EMERALD, 1),
                            16, 2, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.WHITE_TULIP, 10),
                            new ItemStack(Items.EMERALD, 1),
                            16, 2, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.LILAC, 10),
                            new ItemStack(Items.EMERALD, 1),
                            16, 2, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.PEONY, 10),
                            new ItemStack(Items.EMERALD, 1),
                            16, 2, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.ROSE_BUSH, 10),
                            new ItemStack(Items.EMERALD, 1),
                            16, 2, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.SUNFLOWER, 10),
                            new ItemStack(Items.EMERALD, 1),
                            16, 2, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Items.WHITE_CANDLE, 3),
                            12, 1, 0.2f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Items.ORANGE_CANDLE, 3),
                            12, 1, 0.2f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Items.MAGENTA_CANDLE, 3),
                            12, 1, 0.2f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Items.LIGHT_BLUE_CANDLE, 3),
                            12, 1, 0.2f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Items.YELLOW_CANDLE, 3),
                            12, 1, 0.2f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Items.LIME_CANDLE, 3),
                            12, 1, 0.2f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Items.PINK_CANDLE, 3),
                            12, 1, 0.2f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Items.GRAY_CANDLE, 3),
                            12, 1, 0.2f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Items.LIGHT_GRAY_CANDLE, 3),
                            12, 1, 0.2f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Items.CYAN_CANDLE, 3),
                            12, 1, 0.2f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Items.PURPLE_CANDLE, 3),
                            12, 1, 0.2f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Items.BLUE_CANDLE, 3),
                            12, 1, 0.2f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Items.BROWN_CANDLE, 3),
                            12, 1, 0.2f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Items.GREEN_CANDLE, 3),
                            12, 1, 0.2f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Items.RED_CANDLE, 3),
                            12, 1, 0.2f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Items.BLACK_CANDLE, 3),
                            12, 1, 0.2f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.BEEKEEPER, 2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.CAMPFIRE, 1),
                            new ItemStack(Items.EMERALD, 1),
                            12, 10, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Items.GLASS_BOTTLE, 1),
                            new ItemStack(Items.HONEY_BOTTLE, 1),
                            12, 5, 0.2f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Items.HONEYCOMB, 3),
                            12, 5, 0.2f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.BEEKEEPER, 3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.BEE_NEST, 1),
                            new ItemStack(Items.EMERALD, 1),
                            16, 20, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.SHEARS, 1),
                            new ItemStack(Items.SHEARS, 1),
                            new ItemStack(Items.EMERALD, 1),
                            12, 20, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.SWEET_BERRIES, 5),
                            new ItemStack(Items.WHEAT, 15),
                            new ItemStack(Items.EMERALD, 1),
                            12, 20, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.BEEKEEPER, 4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Items.HONEYCOMB_BLOCK, 1),
                            12, 15, 0.2f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(Items.HONEY_BLOCK, 1),
                            12, 15, 0.2f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.GLASS_BOTTLE, 12),
                            new ItemStack(Items.EMERALD, 1),
                            12, 30, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.BEEKEEPER, 5,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Items.CANDLE, 3),
                            12, 30, 0.2f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 12),
                            new ItemStack(Items.BEE_SPAWN_EGG, 1),
                            12, 30, 0.2f));
                });
    }
}
