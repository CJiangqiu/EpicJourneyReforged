package net.ejr.client.gui;

import com.mojang.blaze3d.systems.RenderSystem;
import net.ejr.EjrMod;
import net.ejr.network.FinalMessageGuiButtonMessage;
import net.ejr.world.inventory.FinalMessageGuiMenu;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.FormattedText;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.FormattedCharSequence;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

import java.util.HashMap;
import java.util.List;

public class FinalMessageGuiScreen extends AbstractContainerScreen<FinalMessageGuiMenu> {
    private final static HashMap<String, Object> guistate = FinalMessageGuiMenu.guistate;
    private final Level world;
    private final int x, y, z;
    private final Player entity;
    ImageButton imagebutton_scroll_chapter_1;

    public FinalMessageGuiScreen(FinalMessageGuiMenu container, Inventory inventory, Component text) {
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
    }

    @Override
    protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
        RenderSystem.setShaderColor(1, 1, 1, 1);
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();

        guiGraphics.blit(new ResourceLocation("ejr:textures/screens/notes.png"), this.leftPos + 56, this.topPos + 4, 0, 0, 317, 403, 317, 403);

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
        FormattedText text = Component.translatable("task_progress.1.1");
        int maxLineWidth = 300;
        List<FormattedCharSequence> lines = font.split(text, maxLineWidth);
        int y = 25;
        for (FormattedCharSequence line : lines) {
            guiGraphics.drawString(this.font, line, 70, y, -12829636, false);
            y += 10;
        }
    }

    @Override
    public void init() {
        super.init();
        imagebutton_scroll_chapter_1 = new ImageButton(this.leftPos + 200, this.topPos + 211, 32, 32, 0, 0, 32, new ResourceLocation("ejr:textures/screens/atlas/imagebutton_scroll_chapter_1.png"), 32, 64, e -> {
            if (true) {
                EjrMod.PACKET_HANDLER.sendToServer(new FinalMessageGuiButtonMessage(0, x, y, z));
                FinalMessageGuiButtonMessage.handleButtonAction(entity, 0, x, y, z);
            }
        });
        guistate.put("button:imagebutton_scroll_chapter_1", imagebutton_scroll_chapter_1);
        this.addRenderableWidget(imagebutton_scroll_chapter_1);
    }
}
