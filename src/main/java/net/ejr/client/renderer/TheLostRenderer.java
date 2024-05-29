package net.ejr.client.renderer;

import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.cache.object.BakedGeoModel;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.ejr.entity.model.TheLostModel;
import net.ejr.entity.TheLostEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

import com.mojang.math.Axis;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;
import software.bernie.geckolib.cache.object.GeoBone;
import software.bernie.geckolib.renderer.layer.BlockAndItemGeoLayer;
import software.bernie.geckolib.renderer.layer.ItemArmorGeoLayer;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class TheLostRenderer extends GeoEntityRenderer<TheLostEntity> {
	public TheLostRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new TheLostModel());
		this.shadowRadius = 0.5f;

		// Add hand item layer
		addRenderLayer(new BlockAndItemGeoLayer<>(this) {
			@Nullable
			@Override
			protected ItemStack getStackForBone(GeoBone bone, TheLostEntity animatable) {
				return switch (bone.getName()) {
					case "RightArm" -> animatable.getMainHandItem();
					case "LeftArm" -> animatable.getOffhandItem();
					default -> null;
				};
			}

			@Override
			protected ItemDisplayContext getTransformTypeForStack(GeoBone bone, ItemStack stack, TheLostEntity animatable) {
				return switch (bone.getName()) {
					case "LeftArm" -> ItemDisplayContext.THIRD_PERSON_LEFT_HAND;
					default -> ItemDisplayContext.THIRD_PERSON_RIGHT_HAND;
				};
			}
		});

		// Add armor layer
		addRenderLayer(new ItemArmorGeoLayer<>(this) {
			@Nullable
			@Override
			protected ItemStack getArmorItemForBone(GeoBone bone, TheLostEntity animatable) {
				return switch (bone.getName()) {
					case "LeftLeg", "RightLeg" -> animatable.getItemBySlot(EquipmentSlot.FEET);
					case "Body" -> animatable.getItemBySlot(EquipmentSlot.CHEST);
					case "Head" -> animatable.getItemBySlot(EquipmentSlot.HEAD);
					default -> null;
				};
			}

			@Nonnull
			@Override
			protected EquipmentSlot getEquipmentSlotForBone(GeoBone bone, ItemStack stack, TheLostEntity animatable) {
				return switch (bone.getName()) {
					case "LeftLeg", "RightLeg" -> EquipmentSlot.FEET;
					case "Body" -> EquipmentSlot.CHEST;
					case "RightArm" -> !animatable.isLeftHanded() ? EquipmentSlot.MAINHAND : EquipmentSlot.OFFHAND;
					case "LeftArm" -> animatable.isLeftHanded() ? EquipmentSlot.OFFHAND : EquipmentSlot.MAINHAND;
					case "Head" -> EquipmentSlot.HEAD;
					default -> super.getEquipmentSlotForBone(bone, stack, animatable);
				};
			}

			@Nonnull
			@Override
			protected ModelPart getModelPartForBone(GeoBone bone, EquipmentSlot slot, ItemStack stack, TheLostEntity animatable, HumanoidModel<?> baseModel) {
				return switch (bone.getName()) {
					case "LeftLeg" -> baseModel.leftLeg;
					case "RightLeg" -> baseModel.rightLeg;
					case "RightArm" -> baseModel.rightArm;
					case "LeftArm" -> baseModel.leftArm;
					case "Body" -> baseModel.body;
					case "Head"  -> baseModel.head;
					default -> super.getModelPartForBone(bone, slot, stack, animatable, baseModel);
				};
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(TheLostEntity entity) {
		String textureName = entity.getEntityData().get(TheLostEntity.DATA_texture) == 0 ? "the_lost" : "the_lost_2";
		return new ResourceLocation("ejr", "textures/entities/" + textureName + ".png");
	}

	@Override
	public RenderType getRenderType(TheLostEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, TheLostEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green,
						  float blue, float alpha) {
		float scale = 1f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	protected float getDeathMaxRotation(TheLostEntity entityLivingBaseIn) {
		return 0.0F;
	}
}
