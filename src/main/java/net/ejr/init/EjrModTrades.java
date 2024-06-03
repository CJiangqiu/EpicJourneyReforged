
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.ejr.init;

import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.BasicItemListing;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.event.village.WandererTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class EjrModTrades {
	@SubscribeEvent
	public static void registerWanderingTrades(WandererTradesEvent event) {
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(EjrModItems.GOLD_COIN.get(), 4),

				new ItemStack(Blocks.DRAGON_EGG), 4, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(EjrModItems.GOLD_COIN.get(), 4),

				new ItemStack(Items.DRAGON_HEAD), 4, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(EjrModItems.GOLD_COIN.get()),

				new ItemStack(Items.WITHER_SKELETON_SKULL), 4, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(EjrModItems.GOLD_COIN.get(), 4),

				new ItemStack(Items.NETHER_STAR), 4, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(EjrModItems.GOLD_COIN.get()),

				new ItemStack(Items.ELYTRA), 4, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(EjrModItems.COPPER_COIN.get(), 2),

				new ItemStack(Items.LEAD), 16, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(EjrModItems.COPPER_COIN.get(), 4),

				new ItemStack(Items.NAME_TAG), 16, 5, 0.05f));
	}

	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == VillagerProfession.ARMORER) {
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(EjrModItems.SILVER_COIN.get(), 4),

					new ItemStack(Items.DIAMOND_HELMET), 8, 10, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(EjrModItems.SILVER_COIN.get(), 7),

					new ItemStack(Items.DIAMOND_CHESTPLATE), 8, 10, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(EjrModItems.SILVER_COIN.get(), 6),

					new ItemStack(Items.DIAMOND_LEGGINGS), 8, 10, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(EjrModItems.SILVER_COIN.get(), 3),

					new ItemStack(Items.DIAMOND_BOOTS), 8, 10, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(EjrModItems.SILVER_COIN.get(), 5),

					new ItemStack(EjrModItems.BLACK_COPPER_ARMOR_HELMET.get()), 4, 10, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(EjrModItems.SILVER_COIN.get(), 8),

					new ItemStack(EjrModItems.BLACK_COPPER_ARMOR_CHESTPLATE.get()), 4, 10, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(EjrModItems.SILVER_COIN.get(), 7),

					new ItemStack(EjrModItems.BLACK_COPPER_ARMOR_LEGGINGS.get()), 4, 10, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(EjrModItems.SILVER_COIN.get(), 4),

					new ItemStack(EjrModItems.BLACK_COPPER_ARMOR_BOOTS.get()), 4, 10, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(EjrModItems.GOLD_COIN.get()),

					new ItemStack(Items.NETHERITE_HELMET), 1, 5, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(EjrModItems.GOLD_COIN.get(), 2),

					new ItemStack(Items.NETHERITE_CHESTPLATE), 1, 5, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(EjrModItems.GOLD_COIN.get(), 2),

					new ItemStack(Items.NETHERITE_LEGGINGS), 1, 5, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(EjrModItems.GOLD_COIN.get()),

					new ItemStack(Items.NETHERITE_BOOTS), 1, 5, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(EjrModItems.SILVER_COIN.get(), 4),

					new ItemStack(EjrModItems.BLACK_COPPER_SHIELD.get()), 16, 10, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(EjrModItems.COPPER_COIN.get(), 4),

					new ItemStack(EjrModItems.STEEL_SHIELD.get()), 32, 20, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EjrModItems.COPPER_COIN.get(), 5),

					new ItemStack(EjrModItems.STEEL_ARMOR_HELMET.get()), 10, 20, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EjrModItems.COPPER_COIN.get(), 8),

					new ItemStack(EjrModItems.STEEL_ARMOR_CHESTPLATE.get()), 32, 20, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EjrModItems.COPPER_COIN.get(), 7),

					new ItemStack(EjrModItems.STEEL_ARMOR_LEGGINGS.get()), 32, 20, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EjrModItems.COPPER_COIN.get(), 4),

					new ItemStack(EjrModItems.STEEL_ARMOR_BOOTS.get()), 32, 20, 0.05f));
		}
		if (event.getType() == VillagerProfession.BUTCHER) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EjrModItems.COPPER_COIN.get(), 2),

					new ItemStack(Items.PORKCHOP, 16), 64, 5, 0.1f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EjrModItems.COPPER_COIN.get(), 3),

					new ItemStack(Items.BEEF, 16), 64, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EjrModItems.COPPER_COIN.get()),

					new ItemStack(Items.CHICKEN, 16), 64, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EjrModItems.COPPER_COIN.get()),

					new ItemStack(Items.RABBIT, 16), 64, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EjrModItems.COPPER_COIN.get(), 2),

					new ItemStack(Items.MUTTON, 16), 64, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(EjrModItems.COPPER_COIN.get()),

					new ItemStack(Items.RABBIT_FOOT, 2), 32, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.CARTOGRAPHER) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EjrModItems.COPPER_COIN.get(), 2),

					new ItemStack(Items.MAP), 64, 10, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(EjrModItems.COPPER_COIN.get(), 8),

					new ItemStack(Blocks.CARTOGRAPHY_TABLE), 16, 20, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EjrModItems.COPPER_COIN.get(), 8),

					new ItemStack(Items.COMPASS), 64, 10, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EjrModItems.COPPER_COIN.get(), 16),

					new ItemStack(Items.CLOCK), 64, 10, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(EjrModItems.COPPER_COIN.get(), 8),

					new ItemStack(Items.SPYGLASS), 32, 20, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(EjrModItems.SILVER_COIN.get()),

					new ItemStack(Items.RECOVERY_COMPASS), 16, 40, 0.05f));
		}
		if (event.getType() == VillagerProfession.CLERIC) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EjrModItems.COPPER_COIN.get(), 8),

					new ItemStack(Items.FERMENTED_SPIDER_EYE, 8), 64, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EjrModItems.COPPER_COIN.get(), 16),

					new ItemStack(Items.GHAST_TEAR, 8), 64, 5, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(EjrModItems.COPPER_COIN.get(), 32),

					new ItemStack(Items.ENDER_EYE, 8), 32, 10, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(EjrModItems.SILVER_COIN.get()),

					new ItemStack(Items.END_CRYSTAL), 64, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EjrModItems.COPPER_COIN.get(), 16),

					new ItemStack(Items.BLAZE_ROD, 8), 64, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EjrModItems.COPPER_COIN.get(), 16),

					new ItemStack(Items.MAGMA_CREAM, 8), 64, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EjrModItems.COPPER_COIN.get(), 20),

					new ItemStack(Items.BREWING_STAND), 32, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EjrModItems.COPPER_COIN.get(), 16),

					new ItemStack(Items.CAULDRON), 32, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EjrModItems.COPPER_COIN.get(), 16),

					new ItemStack(Items.GLISTERING_MELON_SLICE, 8), 64, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EjrModItems.COPPER_COIN.get(), 16),

					new ItemStack(Items.REDSTONE, 8), 64, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EjrModItems.COPPER_COIN.get(), 16),

					new ItemStack(Items.GUNPOWDER, 8), 64, 5, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(EjrModItems.SILVER_COIN.get()),

					new ItemStack(Items.GOLDEN_APPLE, 4), 16, 5, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(EjrModItems.GOLD_COIN.get()),

					new ItemStack(Items.ENCHANTED_GOLDEN_APPLE, 2), 8, 5, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(EjrModItems.GOLD_COIN.get()),

					new ItemStack(Items.TOTEM_OF_UNDYING, 2), 8, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.FARMER) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EjrModItems.COPPER_COIN.get(), 8),

					new ItemStack(Items.WHEAT, 64), 64, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EjrModItems.COPPER_COIN.get(), 8),

					new ItemStack(Items.CARROT, 64), 64, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EjrModItems.COPPER_COIN.get(), 8),

					new ItemStack(Items.POTATO, 64), 64, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EjrModItems.COPPER_COIN.get(), 32),

					new ItemStack(Items.SWEET_BERRIES, 64), 64, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EjrModItems.COPPER_COIN.get(), 32),

					new ItemStack(Items.GLOW_BERRIES, 64), 64, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EjrModItems.COPPER_COIN.get(), 16),

					new ItemStack(Items.SUGAR_CANE, 64), 64, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(EjrModItems.COPPER_COIN.get(), 16),

					new ItemStack(Items.BONE, 8), 64, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EjrModItems.COPPER_COIN.get(), 16),

					new ItemStack(Blocks.PUMPKIN, 8), 64, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EjrModItems.COPPER_COIN.get(), 16),

					new ItemStack(Items.MELON_SLICE, 64), 64, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(EjrModItems.COPPER_COIN.get(), 16),

					new ItemStack(Items.HONEYCOMB, 8), 64, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EjrModItems.COPPER_COIN.get(), 8),

					new ItemStack(Items.BEETROOT, 64), 64, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(EjrModItems.COPPER_COIN.get(), 16),

					new ItemStack(Items.COCOA_BEANS, 8), 64, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.FISHERMAN) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EjrModItems.COPPER_COIN.get(), 8),

					new ItemStack(Items.COD, 32), 64, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EjrModItems.COPPER_COIN.get(), 8),

					new ItemStack(Items.SALMON, 32), 64, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EjrModItems.COPPER_COIN.get(), 8),

					new ItemStack(Items.TROPICAL_FISH, 32), 64, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EjrModItems.COPPER_COIN.get(), 8),

					new ItemStack(Items.PUFFERFISH, 32), 64, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(EjrModItems.COPPER_COIN.get(), 2),

					new ItemStack(Items.FISHING_ROD), 16, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(EjrModItems.COPPER_COIN.get(), 32),

					new ItemStack(Items.PRISMARINE_CRYSTALS, 8), 64, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(EjrModItems.COPPER_COIN.get(), 32),

					new ItemStack(Items.PRISMARINE_SHARD, 8), 64, 5, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(EjrModItems.SILVER_COIN.get()),

					new ItemStack(Items.HEART_OF_THE_SEA), 8, 5, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(EjrModItems.SILVER_COIN.get()),

					new ItemStack(Items.NAUTILUS_SHELL), 8, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(EjrModItems.COPPER_COIN.get(), 8),

					new ItemStack(Items.SCUTE), 16, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EjrModItems.COPPER_COIN.get()),

					new ItemStack(Items.PUFFERFISH_BUCKET), 16, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EjrModItems.COPPER_COIN.get()),

					new ItemStack(Items.SALMON_BUCKET), 16, 5, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(EjrModItems.COPPER_COIN.get()),

					new ItemStack(Items.COD_BUCKET), 16, 5, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(EjrModItems.COPPER_COIN.get()),

					new ItemStack(Items.TROPICAL_FISH_BUCKET), 16, 5, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(EjrModItems.COPPER_COIN.get(), 2),

					new ItemStack(Items.AXOLOTL_BUCKET), 16, 5, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(EjrModItems.COPPER_COIN.get()),

					new ItemStack(Items.TADPOLE_BUCKET), 16, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.FLETCHER) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EjrModItems.COPPER_COIN.get(), 8),

					new ItemStack(Items.BOW), 32, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EjrModItems.COPPER_COIN.get(), 16),

					new ItemStack(Items.ARROW, 64), 64, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EjrModItems.COPPER_COIN.get(), 16),

					new ItemStack(Items.CROSSBOW), 32, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EjrModItems.COPPER_COIN.get(), 16),

					new ItemStack(Items.SPECTRAL_ARROW, 32), 64, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EjrModItems.COPPER_COIN.get(), 4),

					new ItemStack(EjrModItems.STEEL_BOW.get()), 16, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(EjrModItems.SILVER_COIN.get(), 4),

					new ItemStack(EjrModItems.BLACK_COPPER_BOW.get()), 8, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.LEATHERWORKER) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EjrModItems.COPPER_COIN.get(), 16),

					new ItemStack(Items.LEATHER, 32), 64, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EjrModItems.COPPER_COIN.get(), 16),

					new ItemStack(Items.SADDLE, 8), 8, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EjrModItems.COPPER_COIN.get(), 16),

					new ItemStack(Items.RABBIT_FOOT, 8), 16, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EjrModItems.COPPER_COIN.get(), 16),

					new ItemStack(Items.RABBIT_HIDE, 16), 32, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EjrModItems.COPPER_COIN.get(), 8),

					new ItemStack(Items.LEATHER_HORSE_ARMOR), 10, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.LIBRARIAN) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EjrModItems.COPPER_COIN.get(), 16),

					new ItemStack(Items.BOOK, 16), 64, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EjrModItems.COPPER_COIN.get(), 2),

					new ItemStack(Items.WRITABLE_BOOK), 16, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EjrModItems.COPPER_COIN.get(), 32),

					new ItemStack(Items.EXPERIENCE_BOTTLE, 64), 64, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(EjrModItems.COPPER_COIN.get(), 4),

					new ItemStack(Blocks.BOOKSHELF), 64, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(EjrModItems.COPPER_COIN.get(), 4),

					new ItemStack(Blocks.LECTERN), 16, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EjrModItems.COPPER_COIN.get(), 32),

					new ItemStack(Items.LAPIS_LAZULI, 16), 10, 5, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(EjrModItems.SILVER_COIN.get(), 4),

					new ItemStack(Blocks.ENCHANTING_TABLE), 10, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.MASON) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EjrModItems.COPPER_COIN.get(), 2),

					new ItemStack(Blocks.STONECUTTER), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EjrModItems.COPPER_COIN.get()),

					new ItemStack(Blocks.SMOOTH_STONE, 8), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EjrModItems.COPPER_COIN.get()),

					new ItemStack(Blocks.COBBLESTONE, 32), 10, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.SHEPHERD) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EjrModItems.COPPER_COIN.get(), 2),

					new ItemStack(Items.SHEARS), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EjrModItems.COPPER_COIN.get()),

					new ItemStack(Blocks.WHITE_CONCRETE_POWDER, 4), 10, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.TOOLSMITH) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EjrModItems.COPPER_COIN.get(), 3),

					new ItemStack(EjrModItems.STEEL_AXE.get()), 10, 10, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EjrModItems.COPPER_COIN.get(), 3),

					new ItemStack(EjrModItems.STEEL_PICKAXE.get()), 10, 10, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EjrModItems.COPPER_COIN.get()),

					new ItemStack(EjrModItems.STEEL_SHOVEL.get()), 10, 10, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EjrModItems.COPPER_COIN.get(), 2),

					new ItemStack(EjrModItems.STEEL_HOE.get()), 10, 10, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(EjrModItems.SILVER_COIN.get(), 3),

					new ItemStack(EjrModItems.BLACK_COPPER_AXE.get()), 10, 20, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(EjrModItems.SILVER_COIN.get(), 3),

					new ItemStack(EjrModItems.BLACK_COPPER_PICKAXE.get()), 10, 20, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(EjrModItems.SILVER_COIN.get()),

					new ItemStack(EjrModItems.BLACK_COPPER_SHOVEL.get()), 10, 20, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(EjrModItems.SILVER_COIN.get(), 2),

					new ItemStack(EjrModItems.BLACK_COPPER_HOE.get()), 10, 20, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(EjrModItems.SILVER_COIN.get(), 3),

					new ItemStack(Items.DIAMOND_AXE), 10, 20, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(EjrModItems.SILVER_COIN.get(), 3),

					new ItemStack(Items.DIAMOND_PICKAXE), 10, 20, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(EjrModItems.SILVER_COIN.get()),

					new ItemStack(Items.DIAMOND_SHOVEL), 10, 20, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(EjrModItems.SILVER_COIN.get(), 2),

					new ItemStack(Items.DIAMOND_HOE), 10, 20, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(EjrModItems.GOLD_COIN.get(), 2),

					new ItemStack(Items.NETHERITE_AXE), 10, 5, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(EjrModItems.GOLD_COIN.get(), 2),

					new ItemStack(Items.NETHERITE_PICKAXE), 10, 5, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(EjrModItems.GOLD_COIN.get()),

					new ItemStack(Items.NETHERITE_SHOVEL), 10, 5, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(EjrModItems.GOLD_COIN.get()),

					new ItemStack(Items.NETHERITE_HOE), 10, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.WEAPONSMITH) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EjrModItems.COPPER_COIN.get()),

					new ItemStack(EjrModItems.STEEL_SWORD.get()), 10, 10, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EjrModItems.SILVER_COIN.get(), 2),

					new ItemStack(EjrModItems.BLACK_COPPER_SWORD.get()), 10, 20, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EjrModItems.SILVER_COIN.get(), 2),

					new ItemStack(Items.DIAMOND_SWORD), 10, 20, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EjrModItems.GOLD_COIN.get(), 2),

					new ItemStack(Items.NETHERITE_SWORD), 10, 5, 0.05f));
		}
	}
}
