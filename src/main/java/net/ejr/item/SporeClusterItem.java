
package net.ejr.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class SporeClusterItem extends Item {
    public SporeClusterItem() {
        super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
    }
}
