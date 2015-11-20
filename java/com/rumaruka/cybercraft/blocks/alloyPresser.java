package com.rumaruka.cybercraft.blocks;

import com.rumaruka.cybercraft.cybercraft;
import com.rumaruka.cybercraft.blocks.tileentites.TileEntityAlloyPresser;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class alloyPresser extends BlockContainer {

	public alloyPresser( ) {
		super(Material.rock);
		setCreativeTab(cybercraft.tabCyberCraft);
		setBlockName("alloyPresser");
		
	}

	@Override
	public TileEntity createNewTileEntity(World w, int par1) {
		
		return new TileEntityAlloyPresser();
	}

}
