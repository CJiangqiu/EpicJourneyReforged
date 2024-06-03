package net.ejr.entity.model;

import net.ejr.entity.WolfKnightOfTheMoonEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class WolfKnightOfTheMoonModel extends GeoModel<WolfKnightOfTheMoonEntity> {
	@Override
	public ResourceLocation getAnimationResource(WolfKnightOfTheMoonEntity entity) {
		return new ResourceLocation("ejr", "animations/wolf_knight_of_the_moon.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WolfKnightOfTheMoonEntity entity) {
		return new ResourceLocation("ejr", "geo/wolf_knight_of_the_moon.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WolfKnightOfTheMoonEntity entity) {
		return new ResourceLocation("ejr", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(WolfKnightOfTheMoonEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
