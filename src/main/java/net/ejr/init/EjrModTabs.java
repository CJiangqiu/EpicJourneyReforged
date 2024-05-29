
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.ejr.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.ejr.EjrMod;

public class EjrModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EjrMod.MODID);
	public static final RegistryObject<CreativeModeTab> EPIC_JOURNEY_REFORGED = REGISTRY.register("epic_journey_reforged",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.ejr.epic_journey_reforged")).icon(() -> new ItemStack(EjrModItems.SCROLL.get())).displayItems((parameters, tabData) -> {
				tabData.accept(EjrModItems.SCROLL.get());
				tabData.accept(EjrModItems.COPPER_COIN.get());
				tabData.accept(EjrModItems.SILVER_COIN.get());
				tabData.accept(EjrModItems.GOLD_COIN.get());
				tabData.accept(EjrModItems.PURSE.get());
				tabData.accept(EjrModItems.STEEL_SWORD.get());
				tabData.accept(EjrModItems.STEEL_AXE.get());
				tabData.accept(EjrModItems.STEEL_PICKAXE.get());
				tabData.accept(EjrModItems.STEEL_SHOVEL.get());
				tabData.accept(EjrModItems.STEEL_HOE.get());
				tabData.accept(EjrModItems.STEEL_BOW.get());
				tabData.accept(EjrModItems.STEEL_SHIELD.get());
				tabData.accept(EjrModItems.STEEL_ARMOR_HELMET.get());
				tabData.accept(EjrModItems.STEEL_ARMOR_CHESTPLATE.get());
				tabData.accept(EjrModItems.STEEL_ARMOR_LEGGINGS.get());
				tabData.accept(EjrModItems.STEEL_ARMOR_BOOTS.get());
				tabData.accept(EjrModItems.BLACK_COPPER_SWORD.get());
				tabData.accept(EjrModItems.BLACK_COPPER_AXE.get());
				tabData.accept(EjrModItems.BLACK_COPPER_PICKAXE.get());
				tabData.accept(EjrModItems.BLACK_COPPER_SHOVEL.get());
				tabData.accept(EjrModItems.BLACK_COPPER_HOE.get());
				tabData.accept(EjrModItems.BLACK_COPPER_BOW.get());
				tabData.accept(EjrModItems.BLACK_COPPER_SHIELD.get());
				tabData.accept(EjrModItems.BLACK_COPPER_ARMOR_HELMET.get());
				tabData.accept(EjrModItems.BLACK_COPPER_ARMOR_CHESTPLATE.get());
				tabData.accept(EjrModItems.BLACK_COPPER_ARMOR_LEGGINGS.get());
				tabData.accept(EjrModItems.BLACK_COPPER_ARMOR_BOOTS.get());
				tabData.accept(EjrModItems.FINAL_MESSAGE.get());
				tabData.accept(EjrModItems.THE_ALL_KNOWING_SAGE_SPAWN_EGG.get());
				tabData.accept(EjrModItems.DEAD_IMPERIAL_SOLDIER_SPAWN_EGG.get());
				tabData.accept(EjrModItems.THE_LOST_SPAWN_EGG.get());
				tabData.accept(EjrModItems.WOLF_KNIGHT_OF_THE_MOON_SPAWN_EGG.get());
				tabData.accept(EjrModItems.EPIC_JOURNEY.get());
				tabData.accept(EjrModItems.WAKE_UP.get());
				tabData.accept(EjrModItems.JOURNEYS_BEGIN_DISC.get());
				tabData.accept(EjrModItems.IN_THE_JOURNEY.get());
				tabData.accept(EjrModItems.BY_THE_CAMPIRE.get());
				tabData.accept(EjrModItems.WOLF_KNIGHT_OF_THE_MOON_DISC.get());
				tabData.accept(EjrModItems.THE_GOD_OF_FAKE.get());
				tabData.accept(EjrModItems.BUILDING_SMALL_TOMB.get());
			}).withSearchBar().build());
}
