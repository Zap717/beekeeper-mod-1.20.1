package com.fosoterritory.minecraft.beekeepermod;

import com.fosoterritory.minecraft.beekeepermod.screen.HoneyExtractorScreen;
import com.fosoterritory.minecraft.beekeepermod.screen.ModScreenHandlers;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.gui.screen.ingame.HandledScreens;

public class BeekeeperModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        HandledScreens.register(ModScreenHandlers.HONEY_EXTRACTOR_SCREEN_HANDLER, HoneyExtractorScreen::new);
    }
}
