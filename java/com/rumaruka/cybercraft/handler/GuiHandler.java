package com.rumaruka.cybercraft.handler;

import com.rumaruka.cybercraft.gui.GuiAlloyPresser;
import com.rumaruka.cybercraft.gui.container.ContainerAlloyPresser;
import com.rumaruka.cybercraft.reference.GUIs;
import com.rumaruka.cybercraft.tileentity.TileEntityAlloyPresser;

import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class GuiHandler implements IGuiHandler {

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if (ID == GUIs.AlloyPresser.ordinal()) {
			TileEntityAlloyPresser TileEntityAlloyPresser = (TileEntityAlloyPresser) world.getTileEntity(x, y, z);
			return new ContainerAlloyPresser(player.inventory, TileEntityAlloyPresser);
		}
		return true;
	}
		
	

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if (ID == GUIs.AlloyPresser.ordinal()) {
			TileEntityAlloyPresser TileEntityAlloyPresser = (TileEntityAlloyPresser) world.getTileEntity(x, y, z);
			return new GuiAlloyPresser(player.inventory, TileEntityAlloyPresser);
		}
		return true;
	}

	

}
