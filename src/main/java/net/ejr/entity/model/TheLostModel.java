package net.ejr.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

import net.ejr.entity.TheLostEntity;

public class TheLostModel extends GeoModel<TheLostEntity> {
	@Override
	public ResourceLocation getAnimationResource(TheLostEntity entity) {
		return new ResourceLocation("ejr", "animations/the_lost.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TheLostEntity entity) {
		return new ResourceLocation("ejr", "geo/the_lost.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TheLostEntity entity) {
		return new ResourceLocation("ejr", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(TheLostEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("Head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
