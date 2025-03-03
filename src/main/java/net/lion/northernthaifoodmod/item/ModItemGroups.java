package net.lion.northernthaifoodmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.lion.northernthaifoodmod.NorthernThaiFoodMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(NorthernThaiFoodMod.MOD_ID, "food1"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.food"))
                    .icon(() -> new ItemStack(ModItems.FOOD1)).entries((displayContext, entries) -> {
                        entries.add(ModItems.FOOD1);

                    }).build());


    public static void registerItemGroups() {
        NorthernThaiFoodMod.LOGGER.info("Registering Item Groups for " + NorthernThaiFoodMod.MOD_ID);
    }

}
