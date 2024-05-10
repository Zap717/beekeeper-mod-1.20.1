package com.fosoterritory.minecraft.beekeepermod.screen;

import com.fosoterritory.minecraft.beekeepermod.BeekeeperMod;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class ModScreenHandlers {
    public static final ScreenHandlerType<HoneyExtractorScreenHandler> HONEY_EXTRACTOR_SCREEN_HANDLER =
        Registry.register(Registries.SCREEN_HANDLER, new Identifier(BeekeeperMod.MOD_ID, "honey_extractor_block"),
                new ExtendedScreenHandlerType<>(HoneyExtractorScreenHandler::new));

    public static void registerScreenHandlers() {
        BeekeeperMod.LOGGER.info("Registering Screen Handlers for " + BeekeeperMod.MOD_ID);
    }
}
