package net.ejr.procedures;

import net.ejr.network.EjrModVariables;
import net.minecraft.world.entity.Entity;

public class TaskProgress0TalkingShowProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
        return (entity.getCapability(EjrModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EjrModVariables.PlayerVariables())).TaskProgress == 1;
    }
}
