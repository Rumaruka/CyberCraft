package com.rumaruka.cybercraft.items;

import com.rumaruka.cybercraft.cybercraft;
import com.rumaruka.cybercraft.blocks.register.mainblocks;
import com.rumaruka.cybercraft.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ShardmJI extends Item {
	
	public ShardmJI(){
		super();
		setCreativeTab(cybercraft.tabCyberCraft);
		setTextureName(Reference.MODID+":"+"shardmJITAnT1");
		setUnlocalizedName("shard_mJI");
	}
	


}
