package com.rumaruka.cybercraft.blocks.register;

import com.rumaruka.cybercraft.blocks.alloyPresser;
import com.rumaruka.cybercraft.blocks.orePureShard;
import com.rumaruka.cybercraft.blocks.testing.DebugBlock;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;


public class mainblocks {
	//testBlock
	public static Block DebugBlock;
	
	//Crystal
	public static Block orePureShard;
	
	
	//Mechinism
	
	public static Block alloy_presser;
	
	

	public static final void init() {
		
		
<<<<<<< HEAD
		orePureShard = new orePureShard();
=======
		puremJI = new puremJI();
>>>>>>> origin/CyberCraft1.7.10
		alloy_presser = new alloyPresser();
		DebugBlock = new DebugBlock();
		GameRegistry.registerBlock(orePureShard, "CT");
		GameRegistry.registerBlock(DebugBlock, "DebugAndTesting");
		GameRegistry.registerBlock(alloy_presser, "alloy_presser");
		
	}
}
