
package net.ejr.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class CopperCoinItem extends Item {
	public CopperCoinItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
