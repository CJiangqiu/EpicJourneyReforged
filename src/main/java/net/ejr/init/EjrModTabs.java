
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.ejr.init;

import com.google.common.collect.ImmutableMap;
import net.eca.init.EpicCoreApiModBlocks;
import net.eca.init.EpicCoreApiModEnchantments;
import net.eca.init.EpicCoreApiModItems;
import net.ejr.EjrMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
public class EjrModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EjrMod.MODID);
	public static final RegistryObject<CreativeModeTab> EPIC_JOURNEY_REFORGED = REGISTRY.register("epic_journey_reforged",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.ejr.epic_journey_reforged")).icon(() -> new ItemStack(EjrModItems.SCROLL.get())).displayItems((parameters, tabData) -> {
				tabData.accept(EpicCoreApiModBlocks.SILVER_ORE.get().asItem());
				tabData.accept(EpicCoreApiModItems.RAW_SILVER.get());
				tabData.accept(EpicCoreApiModItems.SILVER_INGOT.get());
				tabData.accept(EpicCoreApiModItems.SILVER_DUST.get());
				tabData.accept(EpicCoreApiModBlocks.SILVER_BLOCK.get().asItem());
				tabData.accept(EpicCoreApiModItems.STEEL_INGOT.get());
				tabData.accept(EpicCoreApiModBlocks.STEEL_BLOCK.get().asItem());
				tabData.accept(EpicCoreApiModItems.STEEL_HAMMER.get());
				tabData.accept(EpicCoreApiModItems.GOLD_DUST.get());
				tabData.accept(EpicCoreApiModItems.GOLD_SILVER_MIXED_DUST.get());
				tabData.accept(EpicCoreApiModItems.BLACK_COPPER_INGOT_UPGRADE_SMITHING_TEMPLATE.get());
				tabData.accept(EpicCoreApiModItems.BLACK_COPPER_INGOT.get());
				tabData.accept(EpicCoreApiModBlocks.BLACK_COPPER_BLOCK.get().asItem());
				tabData.accept(EpicCoreApiModBlocks.MITHRIL_ORE.get().asItem());
				tabData.accept(EpicCoreApiModItems.MITHRIL_INGOT.get());
				tabData.accept(EpicCoreApiModBlocks.MITHRIL_BLOCK.get().asItem());
				tabData.accept(EpicCoreApiModBlocks.MITHRIL_BLAST_FURNACE.get().asItem());
				tabData.accept(EpicCoreApiModBlocks.ELDER_METAL_WRECKAGE.get().asItem());
				tabData.accept(EpicCoreApiModItems.ORICHALCUM_INGOT.get());
				tabData.accept(EpicCoreApiModBlocks.ORICHALCUM_BLOCK.get().asItem());

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
				tabData.accept(EjrModItems.SPORE_CLUSTER.get());
				tabData.accept(EjrModItems.SPORE_BALL.get());
				tabData.accept(EjrModItems.LIFE_CRYSTAL.get());
				tabData.accept(EjrModItems.MISTLETOE.get());
				tabData.accept(EjrModItems.DODDER.get());
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

				ItemStack sacrificeBook = new ItemStack(Items.ENCHANTED_BOOK);
				EnchantmentHelper.setEnchantments(ImmutableMap.of(EpicCoreApiModEnchantments.SACRIFICE.get(), EpicCoreApiModEnchantments.SACRIFICE.get().getMaxLevel()), sacrificeBook);
				tabData.accept(sacrificeBook);

				ItemStack poisoningBook = new ItemStack(Items.ENCHANTED_BOOK);
				EnchantmentHelper.setEnchantments(ImmutableMap.of(EpicCoreApiModEnchantments.POISONING.get(), EpicCoreApiModEnchantments.POISONING.get().getMaxLevel()), poisoningBook);
				tabData.accept(poisoningBook);

				ItemStack divineWrathBook = new ItemStack(Items.ENCHANTED_BOOK);
				EnchantmentHelper.setEnchantments(ImmutableMap.of(EpicCoreApiModEnchantments.DIVINE_WRATH.get(), EpicCoreApiModEnchantments.DIVINE_WRATH.get().getMaxLevel()), divineWrathBook);
				tabData.accept(divineWrathBook);

				ItemStack sunderArmorBook = new ItemStack(Items.ENCHANTED_BOOK);
				EnchantmentHelper.setEnchantments(ImmutableMap.of(EpicCoreApiModEnchantments.SUNDER_ARMOR.get(), EpicCoreApiModEnchantments.SUNDER_ARMOR.get().getMaxLevel()), sunderArmorBook);
				tabData.accept(sunderArmorBook);

				ItemStack soulProtectionBook = new ItemStack(Items.ENCHANTED_BOOK);
				EnchantmentHelper.setEnchantments(ImmutableMap.of(EpicCoreApiModEnchantments.SOUL_PROTECTION.get(), EpicCoreApiModEnchantments.SOUL_PROTECTION.get().getMaxLevel()), soulProtectionBook);
				tabData.accept(soulProtectionBook);

				ItemStack phantomBook = new ItemStack(Items.ENCHANTED_BOOK);
				EnchantmentHelper.setEnchantments(ImmutableMap.of(EpicCoreApiModEnchantments.PHANTOM.get(), EpicCoreApiModEnchantments.PHANTOM.get().getMaxLevel()), phantomBook);
				tabData.accept(phantomBook);

				ItemStack divineBlessingBook = new ItemStack(Items.ENCHANTED_BOOK);
				EnchantmentHelper.setEnchantments(ImmutableMap.of(EpicCoreApiModEnchantments.DIVINE_BLESSING.get(), EpicCoreApiModEnchantments.DIVINE_BLESSING.get().getMaxLevel()), divineBlessingBook);
				tabData.accept(divineBlessingBook);

				ItemStack reflectionBook = new ItemStack(Items.ENCHANTED_BOOK);
				EnchantmentHelper.setEnchantments(ImmutableMap.of(EpicCoreApiModEnchantments.REFLECTION.get(), EpicCoreApiModEnchantments.REFLECTION.get().getMaxLevel()), reflectionBook);
				tabData.accept(reflectionBook);

				ItemStack explosionBook = new ItemStack(Items.ENCHANTED_BOOK);
				EnchantmentHelper.setEnchantments(ImmutableMap.of(EpicCoreApiModEnchantments.EXPLOSION.get(), EpicCoreApiModEnchantments.EXPLOSION.get().getMaxLevel()), explosionBook);
				tabData.accept(explosionBook);
			}).withSearchBar().build());
}
