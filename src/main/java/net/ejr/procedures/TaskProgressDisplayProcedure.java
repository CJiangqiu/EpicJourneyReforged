package net.ejr.procedures;

import net.ejr.network.EjrModVariables;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;

public class TaskProgressDisplayProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return Component.translatable("translation.key.task_progress").getString() + (entity.getCapability(EjrModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EjrModVariables.PlayerVariables())).TaskProgress;
	}
}
