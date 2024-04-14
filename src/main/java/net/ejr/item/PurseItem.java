
package net.ejr.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class PurseItem extends Item {
	public PurseItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}
}
