package com.rumaruka.cybercraft.items.register;

import com.rumaruka.cybercraft.blocks.testing.DebugBlock;
import com.rumaruka.cybercraft.items.ShardmJI;
import com.rumaruka.cybercraft.items.ingotmJI;
import com.rumaruka.cybercraft.items.testing.DebugItem;

import cpw.mods.fml.common.registry.GameData;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;




public class mainitems {
	
	//testItem
	public static Item DebugItem ;
	
	
	//mJI
	public static Item ShardmJI;
	public static Item ingotmJI;
	
	public static final void init() {
		DebugItem = new DebugItem();
		ShardmJI = new ShardmJI();
		ingotmJI = new ingotmJI();
		GameRegistry.registerItem(ingotmJI, "ingotMJI");
		GameRegistry.registerItem(ShardmJI, "SJI");
		GameRegistry.registerItem(DebugItem,"Debuging");
	}

	  
}



