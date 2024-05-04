// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelhuman_soldier_death<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "human_soldier_death"), "main");
	private final ModelPart human_soldier;
	private final ModelPart Notice;

	public Modelhuman_soldier_death(ModelPart root) {
		this.human_soldier = root.getChild("human_soldier");
		this.Notice = root.getChild("Notice");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition human_soldier = partdefinition.addOrReplaceChild("human_soldier", CubeListBuilder.create(),
				PartPose.offset(0.0F, 17.0F, 0.0F));

		PartDefinition head = human_soldier.addOrReplaceChild("head", CubeListBuilder.create(),
				PartPose.offset(0.0F, -7.0F, 0.0F));

		PartDefinition head_r1 = head
				.addOrReplaceChild("head_r1",
						CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F,
								new CubeDeformation(0.25F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.4363F, 0.0F, 0.0F));

		PartDefinition left_leg = human_soldier.addOrReplaceChild("left_leg", CubeListBuilder.create(),
				PartPose.offset(2.0F, 5.0F, 0.0F));

		PartDefinition left_leg_r1 = left_leg.addOrReplaceChild("left_leg_r1",
				CubeListBuilder.create().texOffs(32, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F,
						new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5167F, -0.1886F, -0.1104F));

		PartDefinition left_arm = human_soldier.addOrReplaceChild("left_arm", CubeListBuilder.create(),
				PartPose.offset(4.0F, -7.0F, 0.0F));

		PartDefinition left_arm_r1 = left_arm.addOrReplaceChild("left_arm_r1",
				CubeListBuilder.create().texOffs(16, 48).addBox(-1.0F, -1.0F, -2.0F, 4.0F, 12.0F, 4.0F,
						new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(1.0F, 1.0F, 0.0F, -0.3712F, 0.1313F, 0.3244F));

		PartDefinition right_leg = human_soldier.addOrReplaceChild("right_leg", CubeListBuilder.create(),
				PartPose.offset(-2.0F, 5.0F, 0.0F));

		PartDefinition right_leg_r1 = right_leg.addOrReplaceChild("right_leg_r1",
				CubeListBuilder.create().texOffs(40, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F,
						new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5272F, 0.1309F, 0.0F));

		PartDefinition right_arm = human_soldier.addOrReplaceChild("right_arm", CubeListBuilder.create(),
				PartPose.offset(-5.0F, -5.0F, 0.0F));

		PartDefinition right_arm_r1 = right_arm.addOrReplaceChild("right_arm_r1",
				CubeListBuilder.create().texOffs(0, 16).addBox(-3.0F, -1.0F, -2.0F, 4.0F, 12.0F, 4.0F,
						new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, -0.6247F, -0.2097F, -0.2811F));

		PartDefinition torso = human_soldier.addOrReplaceChild("torso", CubeListBuilder.create().texOffs(16, 16).addBox(
				-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)), PartPose.offset(0.0F, -7.0F, 0.0F));

		PartDefinition Notice = partdefinition.addOrReplaceChild("Notice", CubeListBuilder.create().texOffs(2, 62)
				.addBox(-1.0F, -8.0F, -6.0F, 3.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		human_soldier.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Notice.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}