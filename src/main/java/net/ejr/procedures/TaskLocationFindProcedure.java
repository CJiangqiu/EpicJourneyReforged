package net.ejr.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.ejr.network.EjrModVariables;

public class TaskLocationFindProcedure {
    public static String execute(Entity entity) {
        if (entity == null)
            return "";
        EjrModVariables.PlayerVariables variables = entity.getCapability(EjrModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EjrModVariables.PlayerVariables());
        double taskLocationX = variables.TaskProgressLocationX;
        double taskLocationY = variables.TaskProgressLocationY;
        double taskLocationZ = variables.TaskProgressLocationZ;
        return Component.translatable("translation.key.task_progress_location").getString() + "(" + taskLocationX + ", " + taskLocationY + ", " + taskLocationZ + ")";
    }
}
