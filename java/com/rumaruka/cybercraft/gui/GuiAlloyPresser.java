package com.rumaruka.cybercraft.gui;

import org.lwjgl.opengl.GL11;

import com.rumaruka.cybercraft.gui.container.ContainerAlloyPresser;
import com.rumaruka.cybercraft.reference.Reference;
import com.rumaruka.cybercraft.reference.Textures;
import com.rumaruka.cybercraft.tileentity.TileEntityAlloyPresser;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;

public class GuiAlloyPresser extends GuiContainer {



	private TileEntityAlloyPresser teAP;

	public GuiAlloyPresser(InventoryPlayer ip, TileEntityAlloyPresser teAP) {
		super(new ContainerAlloyPresser(ip, teAP));
		  this.teAP = teAP;
	        xSize = 176;
	        ySize = 187;
	}

	
	 @Override
	    protected void drawGuiContainerBackgroundLayer(float var1, int var2, int var3)
	    {
	        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);

	        this.mc.getTextureManager().bindTexture(Textures.Gui.ALUDEL);

	        int xStart = (width - xSize) / 2;
	        int yStart = (height - ySize) / 2;
	        this.drawTexturedModalRect(xStart, yStart, 0, 0, xSize, ySize);
	        int scaleAdjustment;

	        if (this.teAP.getState() == 1)
	        {
	            scaleAdjustment = this.teAP.getBurnTimeRemainingScaled(12);
	            this.drawTexturedModalRect(xStart + 45, yStart + 36 + 34 - scaleAdjustment, 176, 12 - scaleAdjustment, 14, scaleAdjustment + 2);
	        }

	        scaleAdjustment = this.teAP.getCookProgressScaled(24);
	        this.drawTexturedModalRect(xStart + 80, yStart + 40, 176, 14, scaleAdjustment + 1, 16);
	    }
	 
	/*@Override
	    protected void drawGuiContainerBackgroundLayer(float p_146976_1_, int p_146976_2_, int p_146976_3_)
	    {
	        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
	        Minecraft.getMinecraft().renderEngine.bindTexture(Textures.Gui.ALUDEL);
	        this.drawTexturedModalRect(this.guiLeft, this.guiTop, 0, 0, this.xSize, this.ySize);
	    }*/
}
