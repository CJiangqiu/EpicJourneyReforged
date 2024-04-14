
package net.ejr.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class ScrollItem extends Item {
	public ScrollItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}
}
