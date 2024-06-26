package net.ejr.client.gui;

import com.mojang.blaze3d.systems.RenderSystem;
import net.ejr.EjrMod;
import net.ejr.network.ScrollGuiButtonMessage;
import net.ejr.procedures.TaskLocationFindProcedure;
import net.ejr.procedures.TaskProgressDisplayProcedure;
import net.ejr.world.inventory.ScrollGuiMenu;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

import java.util.HashMap;

public class ScrollGuiScreen extends AbstractContainerScreen<ScrollGuiMenu> {
	private final static HashMap<String, Object> guistate = ScrollGuiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_scroll_chapter_1;

	public ScrollGuiScreen(ScrollGuiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 420;
		this.imageHeight = 250;
	}

	@Override
	public boolean isPauseScreen() {
		return true;
	}

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (mouseX > leftPos + 54 && mouseX < leftPos + 78 && mouseY > topPos + 106 && mouseY < topPos + 130)
			guiGraphics.renderTooltip(font, Component.translatable("gui.ejr.scroll_gui.tooltip_chapter_one_the_palace_in_the_f"), mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		guiGraphics.blit(new ResourceLocation("ejr:textures/screens/scroll_gui.png"), this.leftPos + 2, this.topPos + 4, 0, 0, 425, 250, 425, 250);

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
		guiGraphics.drawString(this.font,

				TaskProgressDisplayProcedure.execute(entity), 92, 184, -12829636, false);
		guiGraphics.drawString(this.font,

				TaskLocationFindProcedure.execute(entity), 227, 184, -12829636, false);
	}


	@Override
	public void init() {
		super.init();
		imagebutton_scroll_chapter_1 = new ImageButton(this.leftPos + 51, this.topPos + 103, 32, 32, 0, 0, 32, new ResourceLocation("ejr:textures/screens/atlas/imagebutton_scroll_chapter_1.png"), 32, 64, e -> {
			if (true) {
				EjrMod.PACKET_HANDLER.sendToServer(new ScrollGuiButtonMessage(0, x, y, z));
				ScrollGuiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_scroll_chapter_1", imagebutton_scroll_chapter_1);
		this.addRenderableWidget(imagebutton_scroll_chapter_1);
	}
}
