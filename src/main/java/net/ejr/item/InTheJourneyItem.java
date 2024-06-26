
package net.ejr.item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.RecordItem;
import net.minecraftforge.registries.ForgeRegistries;

public class InTheJourneyItem extends RecordItem {
	public InTheJourneyItem() {
		super(1, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ejr:in_the_journey")), new Item.Properties().stacksTo(1).rarity(Rarity.COMMON), 3180);
	}
}
