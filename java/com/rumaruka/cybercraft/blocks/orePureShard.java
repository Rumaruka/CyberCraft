package com.rumaruka.cybercraft.blocks;

import java.util.Random;

import com.rumaruka.cybercraft.cybercraft;
import com.rumaruka.cybercraft.items.register.ModItems;
import com.rumaruka.cybercraft.reference.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class orePureShard extends Block {

	public orePureShard( ) {
		super(Material.rock);
		setBlockName("oreShard");
		setCreativeTab(cybercraft.tabCyberCraft);
		setBlockTextureName(Reference.MODID+":"+"stoneTest121");
		setHarvestLevel("pickaxe", 2);
		setHardness((float)3.2);
		
		
	}
	@Override
	public Item getItemDropped(int i, Random r, int i2) {
		
		return ModItems.ShardmJI;
	}
	
	
	// Breake pickaxe with enchanting "Fortune"
	 public int quantityDroppedWithBonus(int p_149679_1_, Random p_149679_2_)
	    {
	        if (p_149679_1_ > 0 && Item.getItemFromBlock(this) != this.getItemDropped(0, p_149679_2_, p_149679_1_))
	        {
	            int j = p_149679_2_.nextInt(p_149679_1_ + 2) - 1;

	            if (j < 0)
	            {
	                j = 0;
	            }

	            return this.quantityDropped(p_149679_2_) * (j + 1);
	        }
	        else
	        {
	            return this.quantityDropped(p_149679_2_);
	        }
	    }

	
	
    private Random rand = new Random();
      @Override
    public int getExpDrop(IBlockAccess p_149690_1_, int p_149690_5_, int p_149690_7_)
    {
        if (this.getItemDropped(p_149690_5_, rand, p_149690_7_) != Item.getItemFromBlock(this))
        {
            return 1 + rand.nextInt(10);
        }
        return 0;
    }

}
