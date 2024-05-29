package net.ejr.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.ejr.world.inventory.TalkingGuiMenu;
import net.ejr.world.inventory.ScrollGuiMenu;
import net.ejr.world.inventory.ScrollGui2Menu;
import net.ejr.world.inventory.ScrollGui1Menu;
import net.ejr.world.inventory.PurseGuiMenu;
import net.ejr.world.inventory.FinalMessageGuiMenu;
import net.ejr.world.inventory.FinalMessageGui2Menu;
import net.ejr.EjrMod;

public class EjrModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, EjrMod.MODID);
	public static final RegistryObject<MenuType<TalkingGuiMenu>> TALKING_GUI = REGISTRY.register("talking_gui", () -> IForgeMenuType.create(TalkingGuiMenu::new));
	public static final RegistryObject<MenuType<ScrollGuiMenu>> SCROLL_GUI = REGISTRY.register("scroll_gui", () -> IForgeMenuType.create(ScrollGuiMenu::new));
	public static final RegistryObject<MenuType<ScrollGui1Menu>> SCROLL_GUI_1 = REGISTRY.register("scroll_gui_1", () -> IForgeMenuType.create(ScrollGui1Menu::new));
	public static final RegistryObject<MenuType<PurseGuiMenu>> PURSE_GUI = REGISTRY.register("purse_gui", () -> IForgeMenuType.create(PurseGuiMenu::new));
	public static final RegistryObject<MenuType<FinalMessageGuiMenu>> FINAL_MESSAGE_GUI = REGISTRY.register("final_message_gui", () -> IForgeMenuType.create(FinalMessageGuiMenu::new));
	public static final RegistryObject<MenuType<ScrollGui2Menu>> SCROLL_GUI_2 = REGISTRY.register("scroll_gui_2", () -> IForgeMenuType.create(ScrollGui2Menu::new));
	public static final RegistryObject<MenuType<FinalMessageGui2Menu>> FINAL_MESSAGE_2 = REGISTRY.register("final_message_2", () -> IForgeMenuType.create(FinalMessageGui2Menu::new));
}
