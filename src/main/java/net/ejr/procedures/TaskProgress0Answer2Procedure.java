package net.ejr.procedures;

import net.minecraft.world.entity.Entity;

import net.ejr.network.EjrModVariables;

public class TaskProgress0Answer2Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(EjrModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EjrModVariables.PlayerVariables())).TaskProgress == 1.2) {
			{
				double _setval = 1.3;
				entity.getCapability(EjrModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.TaskProgress = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
