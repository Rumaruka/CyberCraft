package com.rumaruka.cybercraft.blocks;

import java.util.Random;

import com.rumaruka.cybercraft.cybercraft;
import com.rumaruka.cybercraft.items.register.mainitems;
import com.rumaruka.cybercraft.reference.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class orePureShard extends Block {

	public orePureShard( ) {
		super(Material.rock);
		setBlockName("oreShard");
		setCreativeTab(cybercraft.tabCyberCraft);
		setBlockTextureName(Reference.MODID+":"+"stoneTest121");
		setHarvestLevel("ItemPickaxe", 2);
		setHardness((float)1.2);
		
	}
	@Override
	public Item getItemDropped(int i, Random r, int i2) {
		// TODO Auto-generated method stub
		return mainitems.ShardmJI;
	}
}
