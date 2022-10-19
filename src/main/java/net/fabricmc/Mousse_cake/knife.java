package net.fabricmc.example;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class knife implements ToolMaterial{
    public static final knife INSTANCE = new knife();

    @Override
    public int getDurability() {
        return 1000;
    }
    public float getMiningSpeedMultiplier() {
        return 1.0F;
    }
    public float getAttackDamage() {
        return 20.0F;
    }
    public int getMiningLevel() {
        return 0;
    }
    public int getEnchantability() {
        return 15;
    }
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.IRON_INGOT);
    }
}