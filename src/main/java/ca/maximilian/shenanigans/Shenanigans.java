package ca.maximilian.shenanigans;

import ca.maximilian.shenanigans.item.ModItem;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Shenanigans implements ModInitializer {
    public static String MOD_ID = "cursed_craft";
    public static Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing {}!", MOD_ID);
        ModItem.init();
    }
}
