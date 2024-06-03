
package net.ejr.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class LifeCrystalItem extends Item {
    public LifeCrystalItem() {
        super(new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON));
    }
}
