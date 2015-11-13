package com.rumaruka.cybercraft.blocks;

import java.util.Random;

import org.lwjgl.opengl.Drawable;

import com.rumaruka.cybercraft.cybercraft;
import com.rumaruka.cybercraft.items.register.mainitems;
import com.rumaruka.cybercraft.reference.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.RenderBlocks;



public class puremJI extends Block  {

	
	public puremJI( ) {
		super(Material.glass);
		setCreativeTab(cybercraft.tabCyberCraft);
		setStepSound(soundTypeGlass);
		setBlockName("Pure_mJI");	
		setBlockTextureName(Reference.MODID+":"+"crystalpuremJI.mtl.png");
	}
	
	
	 
	   
	
	


	
}
