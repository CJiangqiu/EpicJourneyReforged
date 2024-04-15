package net.ejr.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEntityUseItemEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;

import net.ejr.init.EjrModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SteelBowUsingProcedure {
	@SubscribeEvent
	public static void onUseItemTick(LivingEntityUseItemEvent.Tick event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getDuration(), event.getItem());
		}
	}

	@SubscribeEvent
	public static void onUseItemStop(LivingEntityUseItemEvent.Stop event) {
		if (event != null && event.getEntity() != null) {
			resetPulling(event, event.getItem());
		}
	}

	@SubscribeEvent
	public static void onUseItemFinish(LivingEntityUseItemEvent.Finish event) {
		if (event != null && event.getEntity() != null) {
			resetPulling(event, event.getItem());
		}
	}

	public static void execute(@Nullable Event event, int duration, ItemStack itemstack) {
		if (itemstack.getItem() == EjrModItems.STEEL_BOW.get()) {
			if (itemstack.getOrCreateTag().getDouble("pulling") < 3 && duration % (itemstack.getUseDuration() / 4) == 0) {
				itemstack.getOrCreateTag().putDouble("pulling", (itemstack.getOrCreateTag().getDouble("pulling") + 1));
			}
		}
	}

	private static void resetPulling(@Nullable Event event, ItemStack itemstack) {
		if (itemstack.getItem() == EjrModItems.STEEL_BOW.get()) {
			itemstack.getOrCreateTag().putDouble("pulling", 0);
		}
	}
}
