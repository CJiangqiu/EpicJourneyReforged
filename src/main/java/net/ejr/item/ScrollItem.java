
package net.ejr.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class ScrollItem extends Item {
	public ScrollItem() {
		super(new Item.Properties().stacksTo(1).fireResistant().rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.CROSSBOW;
	}

	@Override
	public int getEnchantmentValue() {
		return 1026;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 20;
	}
}
