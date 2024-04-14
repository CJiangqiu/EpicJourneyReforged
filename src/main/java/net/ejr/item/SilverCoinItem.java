
package net.ejr.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class SilverCoinItem extends Item {
	public SilverCoinItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON));
	}
}
