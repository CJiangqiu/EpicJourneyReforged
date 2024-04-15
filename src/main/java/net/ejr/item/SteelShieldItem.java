
package net.ejr.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ShieldItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;

public class SteelShieldItem extends ShieldItem {
	public SteelShieldItem() {
		super(new Item.Properties().durability(300));
	}

	@Override
	public boolean isValidRepairItem(ItemStack itemstack, ItemStack repairitem) {
		return Ingredient.of(ItemTags.create(new ResourceLocation("forge:ingots/steel"))).test(repairitem);
	}
}
