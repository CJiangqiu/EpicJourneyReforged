package net.ejr.procedures;

import net.minecraft.network.chat.Component;

public class FinalMessageGuiTextProcedure {
	public static String execute() {
		return Component.translatable("task_progress.1.1").getString();
	}
}
