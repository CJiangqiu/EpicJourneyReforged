
package net.ejr.item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public class BlackCopperHoeItem extends HoeItem {
	public BlackCopperHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 900;
			}
			public float getSpeed() {
				return 6f;
			}
			public float getAttackDamageBonus() {
				return 0f;
			}
			public int getLevel() {
				return 3;
			}
			public int getEnchantmentValue() {
				return 15;
			}
			public Ingredient getRepairIngredient() {
				return Ingredient.of(ItemTags.create(new ResourceLocation("forge:ingots/black_copper")));
			}
		}, 0, -0.5f, new Item.Properties().rarity(Rarity.UNCOMMON));
	}
}
