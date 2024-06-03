
package net.ejr.item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.RecordItem;
import net.minecraftforge.registries.ForgeRegistries;

public class WolfKnightOfTheMoonDiscItem extends RecordItem {
	public WolfKnightOfTheMoonDiscItem() {
		super(5, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ejr:wolf_knight_of_the_moon")), new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON), 2400);
	}
}
