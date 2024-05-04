package net.ejr.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

import net.ejr.entity.TheAllKnowingSageEntity;

public class TheAllKnowingSageModel extends GeoModel<TheAllKnowingSageEntity> {
	@Override
	public ResourceLocation getAnimationResource(TheAllKnowingSageEntity entity) {
		return new ResourceLocation("ejr", "animations/biped.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TheAllKnowingSageEntity entity) {
		return new ResourceLocation("ejr", "geo/biped.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TheAllKnowingSageEntity entity) {
		return new ResourceLocation("ejr", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(TheAllKnowingSageEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
