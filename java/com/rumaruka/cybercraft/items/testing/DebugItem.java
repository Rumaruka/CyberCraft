package com.rumaruka.cybercraft.items.testing;

import com.rumaruka.cybercraft.cybercraft;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class DebugItem extends Item {
	
	public DebugItem()
	{
		super();
		setCreativeTab(cybercraft.tabCyberCraft);
		setUnlocalizedName("Debuging");
		
	}

}
