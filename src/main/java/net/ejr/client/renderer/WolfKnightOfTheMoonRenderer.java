package net.ejr.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;
import net.ejr.entity.WolfKnightOfTheMoonEntity;
import net.ejr.entity.model.WolfKnightOfTheMoonModel;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;
import software.bernie.geckolib.cache.object.BakedGeoModel;
import software.bernie.geckolib.cache.object.GeoBone;
import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.renderer.layer.BlockAndItemGeoLayer;
import software.bernie.geckolib.renderer.layer.ItemArmorGeoLayer;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class WolfKnightOfTheMoonRenderer extends GeoEntityRenderer<WolfKnightOfTheMoonEntity> {
	public WolfKnightOfTheMoonRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new WolfKnightOfTheMoonModel());
		this.shadowRadius = 0.5f;

		//add hand item layer,code from azurelib
		addRenderLayer(new BlockAndItemGeoLayer<>(this) {

			@Nullable
			@Override
			protected ItemStack getStackForBone(GeoBone bone, WolfKnightOfTheMoonEntity animatable) {
				return switch (bone.getName()) {
					case "right_arm_0" -> animatable.getMainHandItem();
					case "left_arm_0" -> animatable.getOffhandItem();
					default -> null;
				};
			}

			@Override
			protected ItemDisplayContext getTransformTypeForStack(GeoBone bone, ItemStack stack, WolfKnightOfTheMoonEntity animatable) {
				return switch (bone.getName()) {
					case "left_arm_0" -> ItemDisplayContext.THIRD_PERSON_LEFT_HAND;
					default -> ItemDisplayContext.THIRD_PERSON_RIGHT_HAND;
				};
			}
			@Override
			protected void renderStackForBone(PoseStack poseStack, GeoBone bone, ItemStack stack, WolfKnightOfTheMoonEntity animatable, MultiBufferSource bufferSource, float partialTick, int packedLight, int packedOverlay) {
				poseStack.mulPose(Axis.XP.rotationDegrees(25f));
				super.renderStackForBone(poseStack, bone, stack, animatable, bufferSource, partialTick, packedLight, packedOverlay);
			}
		});

		//add armor layer,code from azurelib
		addRenderLayer(new ItemArmorGeoLayer<>(this) {
			@Nullable
			@Override
			protected ItemStack getArmorItemForBone(GeoBone bone, WolfKnightOfTheMoonEntity animatable) {
				// Return the items relevant to the bones being rendered for additional rendering
				return switch (bone.getName()) {
					case "left_leg_0", "right_leg_0" -> this.bootsStack;
					case "torso" -> this.chestplateStack;
					case "Head" -> this.helmetStack;
					default -> null;
				};
			}

			@Nonnull
			@Override
			protected EquipmentSlot getEquipmentSlotForBone(GeoBone bone, ItemStack stack, WolfKnightOfTheMoonEntity animatable) {
				return switch (bone.getName()) {
					case "left_leg_0", "right_leg_0" -> EquipmentSlot.FEET;
					case "torso" -> EquipmentSlot.CHEST;
					case "right_arm_0" -> !animatable.isLeftHanded() ? EquipmentSlot.MAINHAND : EquipmentSlot.OFFHAND;
					case "left_arm_0" -> animatable.isLeftHanded() ? EquipmentSlot.OFFHAND : EquipmentSlot.MAINHAND;
					case "Head" -> EquipmentSlot.HEAD;
					default -> super.getEquipmentSlotForBone(bone, stack, animatable);
				};
			}

			@Nonnull
			@Override
			protected ModelPart getModelPartForBone(GeoBone bone, EquipmentSlot slot, ItemStack stack, WolfKnightOfTheMoonEntity animatable, HumanoidModel<?> baseModel) {
				return switch (bone.getName()) {
					case "left_leg" -> baseModel.leftLeg;
					case "right_leg" -> baseModel.rightLeg;
					case "right_arm" -> baseModel.rightArm;
					case "left_arm" -> baseModel.leftArm;
					case "torso" -> baseModel.body;
					case "Head"  -> baseModel.head;
					default -> super.getModelPartForBone(bone, slot, stack, animatable, baseModel);
				};
			}
		});
	}

	@Override
	public RenderType getRenderType(WolfKnightOfTheMoonEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, WolfKnightOfTheMoonEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green,
						  float blue, float alpha) {
		float scale = 1f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	protected float getDeathMaxRotation(WolfKnightOfTheMoonEntity entityLivingBaseIn) {
		return 0.0F;
	}
}
