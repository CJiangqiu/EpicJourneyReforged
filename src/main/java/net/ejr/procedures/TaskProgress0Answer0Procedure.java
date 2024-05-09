package net.ejr.procedures;

import net.minecraft.world.entity.Entity;

import net.ejr.network.EjrModVariables;

public class TaskProgress0Answer0Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = 1.1;
			entity.getCapability(EjrModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.TaskProgress = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
