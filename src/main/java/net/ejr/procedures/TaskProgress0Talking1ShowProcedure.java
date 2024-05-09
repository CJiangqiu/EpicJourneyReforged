package net.ejr.procedures;

import net.minecraft.world.entity.Entity;

import net.ejr.network.EjrModVariables;

public class TaskProgress0Talking1ShowProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity.getCapability(EjrModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EjrModVariables.PlayerVariables())).TaskProgress == 1.2) {
			return true;
		}
		return false;
	}
}
