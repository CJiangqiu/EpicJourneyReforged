
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.ejr.init;

import net.ejr.client.model.Modelhuman_soldier_death;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class EjrModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelhuman_soldier_death.LAYER_LOCATION, Modelhuman_soldier_death::createBodyLayer);
	}
}
