package com.rumaruka.cybercraft.blocks.testing;

import static net.minecraftforge.common.util.ForgeDirection.EAST;
import static net.minecraftforge.common.util.ForgeDirection.UP;

import org.lwjgl.opengl.GL11;

import com.rumaruka.cybercraft.cybercraft;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.EntityFX;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class DebugBlock extends Block {

	public static int renderId;

	public DebugBlock() {
		super(Material.rock);
		setCreativeTab(cybercraft.tabCyberCraft);
		setBlockName("DebugingAndTesting");
	}




		
	
}
