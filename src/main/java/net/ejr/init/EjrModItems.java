
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.ejr.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.item.ItemProperties;

import net.ejr.procedures.SteelBowPullingProcedure;
import net.ejr.item.SteelSwordItem;
import net.ejr.item.SteelShovelItem;
import net.ejr.item.SteelShieldItem;
import net.ejr.item.SteelPickaxeItem;
import net.ejr.item.SteelHoeItem;
import net.ejr.item.SteelBowItem;
import net.ejr.item.SteelAxeItem;
import net.ejr.item.SilverCoinItem;
import net.ejr.item.ScrollItem;
import net.ejr.item.PurseItem;
import net.ejr.item.GoldCoinItem;
import net.ejr.item.CopperCoinItem;
import net.ejr.EjrMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class EjrModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, EjrMod.MODID);
	public static final RegistryObject<Item> SCROLL = REGISTRY.register("scroll", () -> new ScrollItem());
	public static final RegistryObject<Item> COPPER_COIN = REGISTRY.register("copper_coin", () -> new CopperCoinItem());
	public static final RegistryObject<Item> SILVER_COIN = REGISTRY.register("silver_coin", () -> new SilverCoinItem());
	public static final RegistryObject<Item> GOLD_COIN = REGISTRY.register("gold_coin", () -> new GoldCoinItem());
	public static final RegistryObject<Item> PURSE = REGISTRY.register("purse", () -> new PurseItem());
	public static final RegistryObject<Item> STEEL_SWORD = REGISTRY.register("steel_sword", () -> new SteelSwordItem());
	public static final RegistryObject<Item> STEEL_AXE = REGISTRY.register("steel_axe", () -> new SteelAxeItem());
	public static final RegistryObject<Item> STEEL_PICKAXE = REGISTRY.register("steel_pickaxe", () -> new SteelPickaxeItem());
	public static final RegistryObject<Item> STEEL_SHOVEL = REGISTRY.register("steel_shovel", () -> new SteelShovelItem());
	public static final RegistryObject<Item> STEEL_HOE = REGISTRY.register("steel_hoe", () -> new SteelHoeItem());
	public static final RegistryObject<Item> STEEL_BOW = REGISTRY.register("steel_bow", () -> new SteelBowItem());
	public static final RegistryObject<Item> STEEL_SHIELD = REGISTRY.register("steel_shield", () -> new SteelShieldItem());

	// Start of user code block custom items
	// End of user code block custom items
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			ItemProperties.register(STEEL_BOW.get(), new ResourceLocation("ejr:steel_bow_pulling"), (itemStackToRender, clientWorld, entity, itemEntityId) -> (float) SteelBowPullingProcedure.execute(entity));
			ItemProperties.register(STEEL_SHIELD.get(), new ResourceLocation("blocking"), ItemProperties.getProperty(Items.SHIELD, new ResourceLocation("blocking")));
		});
	}
}
