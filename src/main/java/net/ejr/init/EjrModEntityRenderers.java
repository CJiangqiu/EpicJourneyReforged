
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.ejr.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.ejr.client.renderer.WolfKnightOfTheMoonRenderer;
import net.ejr.client.renderer.TheLostRenderer;
import net.ejr.client.renderer.TheAllKnowingSageRenderer;
import net.ejr.client.renderer.DeadImperialSoldierRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class EjrModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(EjrModEntities.THE_LOST.get(), TheLostRenderer::new);
		event.registerEntityRenderer(EjrModEntities.DEAD_IMPERIAL_SOLDIER.get(), DeadImperialSoldierRenderer::new);
		event.registerEntityRenderer(EjrModEntities.THE_ALL_KNOWING_SAGE.get(), TheAllKnowingSageRenderer::new);
		event.registerEntityRenderer(EjrModEntities.WOLF_KNIGHT_OF_THE_MOON.get(), WolfKnightOfTheMoonRenderer::new);
	}
}
