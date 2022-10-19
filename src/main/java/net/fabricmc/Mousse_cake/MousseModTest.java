package net.fabricmc.example;

import net.fabricmc.api.ModInitializer;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class MousseModTest implements ModInitializer {
	
	public static final Item PIECE_CAKE_ITEM = new Item(new Item.Settings().group(ItemGroup.FOOD).maxCount(8)
	.food((new FoodComponent.Builder())
		.hunger(3)
		.saturationModifier(0.6F)
		.statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST,200,0), 0.125F)
	    .build())
	);

	
	public static final Item MOUSSE_CAKE_ITEM = new Item(new Item.Settings().group(ItemGroup.FOOD).maxCount(1));
	public static final ToolItem KNIFE_ITEM = new SwordItem(knife.INSTANCE, 17, 13.5F, new Item.Settings().group(ItemGroup.TOOLS));

	@Override
	public void onInitialize() {

		Registry.register(Registry.ITEM, new Identifier("mousse", "knife"), KNIFE_ITEM);
		Registry.register(Registry.ITEM, new Identifier("mousse", "piece_cake"),PIECE_CAKE_ITEM);
        Registry.register(Registry.ITEM, new Identifier("mousse", "mousse_cake"), MOUSSE_CAKE_ITEM);
	}
}
