package net.ejr.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class SteelBowPullingProcedure {
	public static double execute(Entity entity) {
		if (entity == null)
			return 0;
		if ((entity instanceof LivingEntity _entUseItem0 ? _entUseItem0.getUseItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("pulling") == 1) {
			return 1;
		}
		if ((entity instanceof LivingEntity _entUseItem2 ? _entUseItem2.getUseItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("pulling") == 2) {
			return 2;
		}
		if ((entity instanceof LivingEntity _entUseItem4 ? _entUseItem4.getUseItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("pulling") == 3) {
			return 3;
		}
		return 0;
	}
}
