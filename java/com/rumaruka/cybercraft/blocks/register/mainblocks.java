package com.rumaruka.cybercraft.blocks.register;

import com.rumaruka.cybercraft.blocks.alloyPresser;
import com.rumaruka.cybercraft.blocks.puremJI;
import com.rumaruka.cybercraft.blocks.testing.DebugBlock;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;


public class mainblocks {
	//testBlock
	public static Block DebugBlock;
	
	//Crystal
	public static Block puremJI;
	
	
	//Mechinism
	
	public static Block alloy_presser;
	
	

	public static final void init() {
		
		
		puremJI = new puremJI();
		alloy_presser = new alloyPresser();
		DebugBlock = new DebugBlock();
		GameRegistry.registerBlock(DebugBlock, "DebugAndTesting");
		GameRegistry.registerBlock(alloy_presser, "alloy_presser");
		GameRegistry.registerBlock(puremJI, "Pure_mJI");
	}
}
