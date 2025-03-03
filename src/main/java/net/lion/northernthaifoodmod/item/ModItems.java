package net.lion.northernthaifoodmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.lion.northernthaifoodmod.NorthernThaiFoodMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item FOOD1 = registerItem("food1", new Item(new FabricItemSettings().food(ModFoodComponents.FOOD1)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(NorthernThaiFoodMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        NorthernThaiFoodMod.LOGGER.info("Registering Mod Items for " + NorthernThaiFoodMod.MOD_ID);

    }
}
