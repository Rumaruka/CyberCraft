/*package com.rumaruka.cybercraft.handler;


import com.rumaruka.cybercraft.reference.GUIs;
import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class GuiHandler implements IGuiHandler{

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if(ID == GUIs.AlloyPresser){
			ItemStack is = player.getHeldItem();
			   if (is != null && is.getItem() instanceof )
                   return new ContainerInventoryAP(itemStack, player);
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		// TODO Auto-generated method stub
		return null;
	}

}
*/
