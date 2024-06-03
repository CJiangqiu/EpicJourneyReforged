package net.ejr.init;


import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.item.ItemStack;

import net.ejr.item.*;
import net.eca.init.EpicCoreApiModEnchantments;

import javax.annotation.Nullable;


@Mod.EventBusSubscriber
public class EjrModEnchantedItems {
    @SubscribeEvent
    public static void onItemCrafted(PlayerEvent.ItemCraftedEvent event) {
        execute(event, event.getCrafting());
    }

    public static void execute(ItemStack itemstack) {
        execute(null, itemstack);
    }

    private static void execute(@Nullable Event event, ItemStack itemstack) {
        if (itemstack.getItem() == EjrModItems.MISTLETOE.get()) {
            itemstack.enchant(EpicCoreApiModEnchantments.POISONING.get(), 3);
        }
    }
}
