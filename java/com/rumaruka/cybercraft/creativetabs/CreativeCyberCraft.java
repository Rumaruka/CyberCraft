package com.rumaruka.cybercraft.creativetabs;

import com.rumaruka.cybercraft.items.register.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class CreativeCyberCraft extends CreativeTabs {
	
	

	public CreativeCyberCraft(int p1, String p2) {
		super(p1, p2);
		
	}

	@Override
	public Item getTabIconItem() {
		// TODO Auto-generated method stub
		return ModItems.ShardmJI;
	}

}
