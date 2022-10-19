package net.fabricmc.example;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class piece_cake implements ModInitializer{
    public static final Item MOUSSE = new Item(new FabricItemSettings().group(ItemGroup.FOOD));

    @Override
    public void onInitialize() {
         
    }
}