
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.ejr.init;

import net.ejr.EjrMod;
import net.ejr.item.*;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

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
	public static final RegistryObject<Item> THE_LOST_SPAWN_EGG = REGISTRY.register("the_lost_spawn_egg", () -> new ForgeSpawnEggItem(EjrModEntities.THE_LOST, -13421569, -16711936, new Item.Properties()));
	public static final RegistryObject<Item> DEAD_IMPERIAL_SOLDIER_SPAWN_EGG = REGISTRY.register("dead_imperial_soldier_spawn_egg", () -> new ForgeSpawnEggItem(EjrModEntities.DEAD_IMPERIAL_SOLDIER, -6710887, -1, new Item.Properties()));
	public static final RegistryObject<Item> THE_ALL_KNOWING_SAGE_SPAWN_EGG = REGISTRY.register("the_all_knowing_sage_spawn_egg", () -> new ForgeSpawnEggItem(EjrModEntities.THE_ALL_KNOWING_SAGE, -3355444, -1, new Item.Properties()));
	public static final RegistryObject<Item> WOLF_KNIGHT_OF_THE_MOON_SPAWN_EGG = REGISTRY.register("wolf_knight_of_the_moon_spawn_egg", () -> new ForgeSpawnEggItem(EjrModEntities.WOLF_KNIGHT_OF_THE_MOON, -1, -16711936, new Item.Properties()));
	public static final RegistryObject<Item> STEEL_ARMOR_HELMET = REGISTRY.register("steel_armor_helmet", () -> new SteelArmorItem.Helmet());
	public static final RegistryObject<Item> STEEL_ARMOR_CHESTPLATE = REGISTRY.register("steel_armor_chestplate", () -> new SteelArmorItem.Chestplate());
	public static final RegistryObject<Item> STEEL_ARMOR_LEGGINGS = REGISTRY.register("steel_armor_leggings", () -> new SteelArmorItem.Leggings());
	public static final RegistryObject<Item> STEEL_ARMOR_BOOTS = REGISTRY.register("steel_armor_boots", () -> new SteelArmorItem.Boots());
	public static final RegistryObject<Item> WAKE_UP = REGISTRY.register("wake_up", () -> new WakeUpItem());
	public static final RegistryObject<Item> EPIC_JOURNEY = REGISTRY.register("epic_journey", () -> new EpicJourneyItem());
	public static final RegistryObject<Item> JOURNEYS_BEGIN_DISC = REGISTRY.register("journeys_begin_disc", () -> new JourneysBeginDiscItem());
	public static final RegistryObject<Item> IN_THE_JOURNEY = REGISTRY.register("in_the_journey", () -> new InTheJourneyItem());
	public static final RegistryObject<Item> BY_THE_CAMPIRE = REGISTRY.register("by_the_campire", () -> new ByTheCampireItem());
	public static final RegistryObject<Item> WOLF_KNIGHT_OF_THE_MOON_DISC = REGISTRY.register("wolf_knight_of_the_moon_disc", () -> new WolfKnightOfTheMoonDiscItem());
	public static final RegistryObject<Item> THE_GOD_OF_FAKE = REGISTRY.register("the_god_of_fake", () -> new TheGodOfFakeItem());
	public static final RegistryObject<Item> BLACK_COPPER_SWORD = REGISTRY.register("black_copper_sword", () -> new BlackCopperSwordItem());
	public static final RegistryObject<Item> BLACK_COPPER_AXE = REGISTRY.register("black_copper_axe", () -> new BlackCopperAxeItem());
	public static final RegistryObject<Item> BLACK_COPPER_PICKAXE = REGISTRY.register("black_copper_pickaxe", () -> new BlackCopperPickaxeItem());
	public static final RegistryObject<Item> BLACK_COPPER_SHOVEL = REGISTRY.register("black_copper_shovel", () -> new BlackCopperShovelItem());
	public static final RegistryObject<Item> BLACK_COPPER_HOE = REGISTRY.register("black_copper_hoe", () -> new BlackCopperHoeItem());
	public static final RegistryObject<Item> BLACK_COPPER_BOW = REGISTRY.register("black_copper_bow", () -> new BlackCopperBowItem());
	public static final RegistryObject<Item> BLACK_COPPER_SHIELD = REGISTRY.register("black_copper_shield", () -> new BlackCopperShieldItem());
	public static final RegistryObject<Item> BLACK_COPPER_ARMOR_HELMET = REGISTRY.register("black_copper_armor_helmet", () -> new BlackCopperArmorItem.Helmet());
	public static final RegistryObject<Item> BLACK_COPPER_ARMOR_CHESTPLATE = REGISTRY.register("black_copper_armor_chestplate", () -> new BlackCopperArmorItem.Chestplate());
	public static final RegistryObject<Item> BLACK_COPPER_ARMOR_LEGGINGS = REGISTRY.register("black_copper_armor_leggings", () -> new BlackCopperArmorItem.Leggings());
	public static final RegistryObject<Item> BLACK_COPPER_ARMOR_BOOTS = REGISTRY.register("black_copper_armor_boots", () -> new BlackCopperArmorItem.Boots());
	public static final RegistryObject<Item> SPORE_CLUSTER = REGISTRY.register("spore_cluster", () -> new SporeClusterItem());
	public static final RegistryObject<Item> SPORE_BALL=REGISTRY.register("spore_ball",() ->new SporeBallItem());
	public static final RegistryObject<Item> LIFE_CRYSTAL = REGISTRY.register("life_crystal", () -> new LifeCrystalItem());
	public static final RegistryObject<Item> MISTLETOE = REGISTRY.register("mistletoe", () -> new MistletoeItem());
	public static final RegistryObject<Item> DODDER = REGISTRY.register("dodder", () -> new DodderItem());

	public static final RegistryObject<Item> FINAL_MESSAGE = REGISTRY.register("final_message", () -> new FinalMessageItem());
	public static final RegistryObject<Item> BUILDING_SMALL_TOMB = REGISTRY.register("building_small_tomb", () -> new BuildingSmallTombItem());

	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			ItemProperties.register(STEEL_SHIELD.get(), new ResourceLocation("blocking"), ItemProperties.getProperty(Items.SHIELD, new ResourceLocation("blocking")));
			ItemProperties.register(BLACK_COPPER_SHIELD.get(), new ResourceLocation("blocking"), ItemProperties.getProperty(Items.SHIELD, new ResourceLocation("blocking")));
		});
	}
}
