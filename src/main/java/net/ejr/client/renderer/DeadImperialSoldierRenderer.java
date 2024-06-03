
package net.ejr.client.renderer;

import net.ejr.client.model.Modelhuman_soldier_death;
import net.ejr.entity.DeadImperialSoldierEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class DeadImperialSoldierRenderer extends MobRenderer<DeadImperialSoldierEntity, Modelhuman_soldier_death<DeadImperialSoldierEntity>> {
	public DeadImperialSoldierRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelhuman_soldier_death(context.bakeLayer(Modelhuman_soldier_death.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(DeadImperialSoldierEntity entity) {
		return new ResourceLocation("ejr:textures/entities/soldier_death.png");
	}
}
