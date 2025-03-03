package net.lion.northernthaifoodmod.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent FOOD1 = new FoodComponent.Builder().hunger(8).saturationModifier(0.25f)
            .build();
}
