package net.ejr.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.ejr.client.gui.TalkingGuiScreen;
import net.ejr.client.gui.ScrollGuiScreen;
import net.ejr.client.gui.ScrollGui2Screen;
import net.ejr.client.gui.ScrollGui1Screen;
import net.ejr.client.gui.PurseGuiScreen;
import net.ejr.client.gui.FinalMessageGui2Screen;
import net.ejr.client.gui.FinalMessageGuiScreen;
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
