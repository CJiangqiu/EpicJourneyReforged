
package net.ejr.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ShieldItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;

public class BlackCopperShieldItem extends ShieldItem {
	public BlackCopperShieldItem() {
		super(new Item.Properties().durability(450).rarity(Rarity.UNCOMMON));
	}

	@Override
	public boolean isValidRepairItem(ItemStack itemstack, ItemStack repairitem) {
		return Ingredient.of(ItemTags.create(new ResourceLocation("forge:ingots/black_copper"))).test(repairitem);
	}
}
