
package net.ejr.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class GoldCoinItem extends Item {
	public GoldCoinItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.RARE));
	}
}
