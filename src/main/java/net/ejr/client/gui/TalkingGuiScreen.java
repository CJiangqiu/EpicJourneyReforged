package net.ejr.client.gui;

import com.mojang.blaze3d.systems.RenderSystem;
import net.ejr.EjrMod;
import net.ejr.network.TalkingGuiButtonMessage;
import net.ejr.procedures.*;
import net.ejr.world.inventory.TalkingGuiMenu;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.screens.inventory.InventoryScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

import java.util.HashMap;

public class TalkingGuiScreen extends AbstractContainerScreen<TalkingGuiMenu> {
	private final static HashMap<String, Object> guistate = TalkingGuiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_where_am_i;
	Button button_who_are_you;
	Button button_why_am_i_here;

	public TalkingGuiScreen(TalkingGuiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 425;
		this.imageHeight = 240;
	}

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		if (GetTalkingNpcModelProcedure.execute(world, x, y, z) instanceof LivingEntity livingEntity) {
			InventoryScreen.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + 75, this.topPos + 236, 30, 0f + (float) Math.atan((this.leftPos + 75 - mouseX) / 40.0), (float) Math.atan((this.topPos + 187 - mouseY) / 40.0), livingEntity);
		}
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		guiGraphics.blit(new ResourceLocation("ejr:textures/screens/talking_gui.png"), this.leftPos + 0, this.topPos + 121, 0, 0, 425, 120, 425, 120);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		if (TaskProgress0Talking0ShowProcedure.execute(entity))
			guiGraphics.drawString(this.font,

					TaskProgress0Talking0Procedure.execute(), 58, 129, -12829636, false);
		if (TaskProgress0TalkingShowProcedure.execute(entity))
			guiGraphics.drawString(this.font,

					TaskProgress0TalkingProcedure.execute(), 57, 128, -12829636, false);
		if (TaskProgress0Talking1ShowProcedure.execute(entity))
			guiGraphics.drawString(this.font,

					TaskProgress0Talking1Procedure.execute(), 36, 129, -12829636, false);
		if (TaskProgress0Talking2ShowProcedure.execute(entity))
			guiGraphics.drawString(this.font,

					TaskProgress0Talking2Procedure.execute(), 36, 129, -12829636, false);
		if (TaskProgress0Talking1ShowProcedure.execute(entity))
			guiGraphics.drawString(this.font,

					TaskProgress0Talking10Procedure.execute(), 47, 138, -12829636, false);
		if (TaskProgress0Talking2ShowProcedure.execute(entity))
			guiGraphics.drawString(this.font,

					TaskProgress0Talking20Procedure.execute(), 46, 138, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_where_am_i = Button.builder(Component.translatable("gui.ejr.talking_gui.button_where_am_i"), e -> {
			if (TaskProgress0TalkingShowProcedure.execute(entity)) {
				EjrMod.PACKET_HANDLER.sendToServer(new TalkingGuiButtonMessage(0, x, y, z));
				TalkingGuiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 153, this.topPos + 161, 82, 20).build(builder -> new Button(builder) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (TaskProgress0TalkingShowProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		});
		guistate.put("button:button_where_am_i", button_where_am_i);
		this.addRenderableWidget(button_where_am_i);
		button_who_are_you = Button.builder(Component.translatable("gui.ejr.talking_gui.button_who_are_you"), e -> {
			if (TaskProgress0Talking0ShowProcedure.execute(entity)) {
				EjrMod.PACKET_HANDLER.sendToServer(new TalkingGuiButtonMessage(1, x, y, z));
				TalkingGuiButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 153, this.topPos + 187, 87, 20).build(builder -> new Button(builder) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (TaskProgress0Talking0ShowProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		});
		guistate.put("button:button_who_are_you", button_who_are_you);
		this.addRenderableWidget(button_who_are_you);
		button_why_am_i_here = Button.builder(Component.translatable("gui.ejr.talking_gui.button_why_am_i_here"), e -> {
			if (TaskProgress0Talking1ShowProcedure.execute(entity)) {
				EjrMod.PACKET_HANDLER.sendToServer(new TalkingGuiButtonMessage(2, x, y, z));
				TalkingGuiButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 153, this.topPos + 215, 97, 20).build(builder -> new Button(builder) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (TaskProgress0Talking1ShowProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		});
		guistate.put("button:button_why_am_i_here", button_why_am_i_here);
		this.addRenderableWidget(button_why_am_i_here);
	}
}
