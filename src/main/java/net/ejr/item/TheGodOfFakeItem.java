
package net.ejr.item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.RecordItem;
import net.minecraftforge.registries.ForgeRegistries;

public class TheGodOfFakeItem extends RecordItem {
	public TheGodOfFakeItem() {
		super(15, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ejr:the_god_of_fake")), new Item.Properties().stacksTo(1).rarity(Rarity.EPIC), 4440);
	}
}
