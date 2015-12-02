package com.rumaruka.cybercraft.blocks;

import com.rumaruka.cybercraft.cybercraft;
import com.rumaruka.cybercraft.blocks.register.ModBlocks;
import com.rumaruka.cybercraft.reference.GUIs;
import com.rumaruka.cybercraft.reference.Reference;
import com.rumaruka.cybercraft.tileentity.TileEntityAlloyPresser;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class alloyPresser extends BlockContainer {

	private boolean field_149985_a;
	@SideOnly(Side.CLIENT)
	private IIcon field_149984_b;
	@SideOnly(Side.CLIENT)
	private IIcon field_149986_M;
	 private static boolean field_149934_M;

	public alloyPresser() {
		super(Material.rock);
		setCreativeTab(cybercraft.tabCyberCraft);
		setBlockName("alloyPresser");
		setHarvestLevel("pickaxe", 1);

	}

	@Override
	public TileEntity createNewTileEntity(World w, int par1) {

		return new TileEntityAlloyPresser();
	}

	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int meta, int side) {
		return meta == 1 ? this.field_149984_b
				: (meta == 0 ? this.field_149984_b
						: (side == 2 && meta == 2 ? this.field_149986_M
								: (side == 3 && meta == 5 ? this.field_149986_M
										: (side == 0 && meta == 3 ? this.field_149986_M
												: (side == 1 && meta == 4 ? this.field_149986_M
														: this.blockIcon)))));
	}

	
	

	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister r) {
		this.field_149986_M = r.registerIcon(Reference.MODID + ":"+"apFront");
		this.field_149984_b = r.registerIcon(Reference.MODID + ":"+"apTop");
		this.blockIcon = r.registerIcon(Reference.MODID +":"+"apSide");
	}

	private void setBlockRotation(World w, int x, int y, int z) {
		if (!w.isRemote) {
			Block block = w.getBlock(x, y, z - 1);
			Block block1 = w.getBlock(x, y, z + 1);
			Block block2 = w.getBlock(x - 1, y, z);
			Block block3 = w.getBlock(x + 1, y, z);
			int b0 = w.getBlockMetadata(x, y, z) / 4 * 4;

			if (block.func_149730_j() && !block1.func_149730_j()) {
				b0 += 1;
				w.setBlockMetadataWithNotify(x, y, z, b0, 3);
				return;
			}

			if (block1.func_149730_j() && !block.func_149730_j()) {
				b0 += 0;
				w.setBlockMetadataWithNotify(x, y, z, b0, 3);
				return;
			}

			if (block2.func_149730_j() && !block3.func_149730_j()) {
				b0 += 3;
				w.setBlockMetadataWithNotify(x, y, z, b0, 3);
				return;
			}

			if (block3.func_149730_j() && !block2.func_149730_j()) {
				b0 += 2;
				w.setBlockMetadataWithNotify(x, y, z, b0, 3);
				return;
			}
		}

	}
	 
    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par6, float par7, float par8, float par9)
    {
        if (player.isSneaking())
        {
            return false;
        }
        else
        {
            if (!world.isRemote)
            {
                if (world.getTileEntity(x, y, z) instanceof TileEntityAlloyPresser)
                {
                	
                    player.openGui(cybercraft.instance, GUIs.AlloyPresser.ordinal(), world, x, y, z);
                }
            }

            return true;
        }
    }
    @SideOnly(Side.CLIENT)
    public Item getItem(World p_149694_1_, int p_149694_2_, int p_149694_3_, int p_149694_4_)
    {
        return Item.getItemFromBlock(ModBlocks.alloy_presser);
    }

	public static void updateFurnaceBlockState(boolean p_149931_0_, World p_149931_1_, int p_149931_2_, int p_149931_3_, int p_149931_4_) {
		  int l = p_149931_1_.getBlockMetadata(p_149931_2_, p_149931_3_, p_149931_4_);
	        TileEntity tileentity = p_149931_1_.getTileEntity(p_149931_2_, p_149931_3_, p_149931_4_);
	        field_149934_M = true;

	        if (p_149931_0_)
	        {
	            p_149931_1_.setBlock(p_149931_2_, p_149931_3_, p_149931_4_, Blocks.lit_furnace);
	        }
	        else
	        {
	            p_149931_1_.setBlock(p_149931_2_, p_149931_3_, p_149931_4_, Blocks.furnace);
	        }

	        field_149934_M = false;
	        p_149931_1_.setBlockMetadataWithNotify(p_149931_2_, p_149931_3_, p_149931_4_, l, 2);

	        if (tileentity != null)
	        {
	            tileentity.validate();
	            p_149931_1_.setTileEntity(p_149931_2_, p_149931_3_, p_149931_4_, tileentity);
	        }
		
	}
}
