package ca.maximilian.shenanigans.item;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

import static ca.maximilian.shenanigans.Shenanigans.LOGGER;
import static ca.maximilian.shenanigans.Shenanigans.MOD_ID;

public class ModItem {
    public static final Item TNT_WAND = new Item(new Item.Properties());
    public static void init() {
        LOGGER.info("Registering items...");


        Registry.register(BuiltInRegistries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, "tnt_wand"), TNT_WAND);


        LOGGER.info("Done registering items!");
    }
}
