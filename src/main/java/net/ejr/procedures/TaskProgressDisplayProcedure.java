package net.ejr.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.ejr.network.EjrModVariables;

public class TaskProgressDisplayProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return Component.translatable("translation.key.task_progress").getString() + "" + (entity.getCapability(EjrModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EjrModVariables.PlayerVariables())).TaskProgress;
	}
}
