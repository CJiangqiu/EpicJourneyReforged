package net.ejr;

import net.ejr.init.EjrModItems;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientProxy {
	public ClientProxy() {
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		new ClientProxy();
	}

	@Mod.EventBusSubscriber
	private static class ForgeBusEvents {
		@SubscribeEvent
		public static void serverLoad(ServerStartingEvent event) {
		}

		@OnlyIn(Dist.CLIENT)
		@SubscribeEvent
		public static void clientLoad(FMLClientSetupEvent event) {
			event.enqueueWork(() -> {
				ItemProperties.register(EjrModItems.STEEL_BOW.get(), new ResourceLocation("pulling"),
						(itemStack, clientLevel, livingEntity, i) ->
								livingEntity != null && livingEntity.isUsingItem() && livingEntity.getUseItem() == itemStack ? 1.0F : 0.0F);
				ItemProperties.register(EjrModItems.STEEL_BOW.get(), new ResourceLocation("pull"),
						(itemStack, clientLevel, livingEntity, i) ->
								livingEntity != null && livingEntity.isUsingItem() && livingEntity.getUseItem() == itemStack ?
										(float) (itemStack.getUseDuration() - livingEntity.getUseItemRemainingTicks()) / 20.0F : 0.0F);
			});
		}
	}
}
