/*package com.rumaruka.cybercraft.gui.container;

import com.rumaruka.cybercraft.reference.Textures;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;




public class GuiInventoryAP extends GuiContainer{

	
		private static final ResourceLocation alloyPresser = new ResourceLocation(Textures.class)
	
	public GuiInventoryAP(ItemStack is, EntityPlayer ep ) {
		super(new ContainerInventoryAP(is, ep));
		
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float parTick, int mouseX, int mouseY) {
		this.drawDefaultBackground();
		this.mc.getTextureManager().bindTexture(alloyPresser);
        int k = (this.width - this.xSize) / 2;
        int l = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);
		
	}

}
*/