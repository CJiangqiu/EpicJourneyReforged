
package net.ejr.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;

public class BlackCopperShovelItem extends ShovelItem {
	public BlackCopperShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 450;
			}
			public float getSpeed() {
				return 6f;
			}
			public float getAttackDamageBonus() {
				return 3.5f;
			}
			public int getLevel() {
				return 2;
			}
			public int getEnchantmentValue() {
				return 15;
			}
			public Ingredient getRepairIngredient() {
				return Ingredient.of(ItemTags.create(new ResourceLocation("forge:ingots/black_copper")));
			}
		}, 1, -3f, new Item.Properties().rarity(Rarity.UNCOMMON));
	}
}
