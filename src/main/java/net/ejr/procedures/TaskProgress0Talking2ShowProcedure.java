package net.ejr.procedures;

import net.ejr.network.EjrModVariables;
import net.minecraft.world.entity.Entity;

public class TaskProgress0Talking2ShowProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity.getCapability(EjrModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EjrModVariables.PlayerVariables())).TaskProgress == 1.3) {
			return true;
		}
		return false;
	}
}
