
package net.ejr.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.ejr.entity.TheAllKnowingSageEntity;
import net.ejr.entity.model.TheAllKnowingSageModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.cache.object.BakedGeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class TheAllKnowingSageRenderer extends GeoEntityRenderer<TheAllKnowingSageEntity> {
	public TheAllKnowingSageRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new TheAllKnowingSageModel());
		this.shadowRadius = 0.5f;
	}

	@Override
	public RenderType getRenderType(TheAllKnowingSageEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, TheAllKnowingSageEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		float scale = 1f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	protected float getDeathMaxRotation(TheAllKnowingSageEntity entityLivingBaseIn) {
		return 0.0F;
	}
}
