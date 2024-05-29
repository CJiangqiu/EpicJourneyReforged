
package net.ejr.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class WakeUpItem extends RecordItem {
	public WakeUpItem() {
		super(1, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ejr:wake_up")), new Item.Properties().stacksTo(1).rarity(Rarity.COMMON), 2400);
	}
}
