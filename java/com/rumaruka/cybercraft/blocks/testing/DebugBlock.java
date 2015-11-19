package com.rumaruka.cybercraft.blocks.testing;


import static net.minecraftforge.common.util.ForgeDirection.EAST;
import static net.minecraftforge.common.util.ForgeDirection.UP;
import com.rumaruka.cybercraft.cybercraft;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.EntityFX;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;

public class DebugBlock extends Block {

	public DebugBlock() {
		super(Material.rock);
		setCreativeTab(cybercraft.tabCyberCraft);
		setBlockName("DebugingAndTesting");
	}
	
	
	  
}
	           
	       


