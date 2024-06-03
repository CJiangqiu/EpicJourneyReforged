
package net.ejr.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class SporeBallItem extends Item {
    public SporeBallItem() {
        super(new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON));
    }
}
