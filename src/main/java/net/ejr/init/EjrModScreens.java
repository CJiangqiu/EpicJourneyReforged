package net.ejr.init;

import net.ejr.client.gui.*;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class EjrModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(EjrModMenus.TALKING_GUI.get(), TalkingGuiScreen::new);
			MenuScreens.register(EjrModMenus.SCROLL_GUI.get(), ScrollGuiScreen::new);
			MenuScreens.register(EjrModMenus.SCROLL_GUI_1.get(), ScrollGui1Screen::new);
			MenuScreens.register(EjrModMenus.PURSE_GUI.get(), PurseGuiScreen::new);
			MenuScreens.register(EjrModMenus.FINAL_MESSAGE_GUI.get(), FinalMessageGuiScreen::new);
			MenuScreens.register(EjrModMenus.SCROLL_GUI_2.get(), ScrollGui2Screen::new);
			MenuScreens.register(EjrModMenus.FINAL_MESSAGE_2.get(), FinalMessageGui2Screen::new);
		});
	}
}
