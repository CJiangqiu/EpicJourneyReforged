
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.ejr.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.ejr.world.inventory.TalkingGuiMenu;
import net.ejr.EjrMod;

public class EjrModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, EjrMod.MODID);
	public static final RegistryObject<MenuType<TalkingGuiMenu>> TALKING_GUI = REGISTRY.register("talking_gui", () -> IForgeMenuType.create(TalkingGuiMenu::new));
}
