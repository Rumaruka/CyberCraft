package com.rumaruka.cybercraft.tileentity;

import com.rumaruka.cybercraft.blocks.alloyPresser;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFurnace;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemTool;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;

public class TileEntityAlloyPresser extends TileEntity implements ISidedInventory {

	public static int slotTop[] = new int[] { 0 };
	public static int slotBottom[] = new int[] { 3, 2, 1 };
	public static int slotSides[] = new int[] { 1 };

	private ItemStack[] presserItemStacks = new ItemStack[2];

	public int presserBurnTime;
	public int currentItemBurnTime;
	public int presserCookTime;
	private String field_145958_o;
	private byte state;
	private static final String __OBFID = "CL_00000357";

	@Override
	public int getSizeInventory() {
		// TODO Auto-generated method stub
		return this.presserItemStacks.length;
	}

	@Override
	public ItemStack getStackInSlot(int i) {
		// TODO Auto-generated method stub
		return this.presserItemStacks[i];
	}

	@Override
	public ItemStack decrStackSize(int p_70298_1_, int p_70298_2_) {
		if (this.presserItemStacks[p_70298_1_] != null) {
			ItemStack itemstack;

			if (this.presserItemStacks[p_70298_1_].stackSize <= p_70298_2_) {
				itemstack = this.presserItemStacks[p_70298_1_];
				this.presserItemStacks[p_70298_1_] = null;
				return itemstack;
			} else {
				itemstack = this.presserItemStacks[p_70298_1_].splitStack(p_70298_2_);

				if (this.presserItemStacks[p_70298_1_].stackSize == 0) {
					this.presserItemStacks[p_70298_1_] = null;
				}

				return itemstack;
			}
		} else {
			return null;
		}
	}

	@Override
	public ItemStack getStackInSlotOnClosing(int p_70304_1_) {
		if (this.presserItemStacks[p_70304_1_] != null) {
			ItemStack itemstack = this.presserItemStacks[p_70304_1_];
			this.presserItemStacks[p_70304_1_] = null;
			return itemstack;
		} else {
			return null;
		}

	}

	@Override
	public void setInventorySlotContents(int p_70299_1_, ItemStack p_70299_2_) {
		this.presserItemStacks[p_70299_1_] = p_70299_2_;

		if (p_70299_2_ != null && p_70299_2_.stackSize > this.getInventoryStackLimit()) {
			p_70299_2_.stackSize = this.getInventoryStackLimit();
		}

	}

	@Override
	public String getInventoryName() {
		// TODO Auto-generated method stub
		return this.hasCustomInventoryName() ? this.field_145958_o : "container.AlloyPresser";
	}

	@Override
	public boolean hasCustomInventoryName() {
		// TODO Auto-generated method stub
		return this.field_145958_o != null && this.field_145958_o.length() > 0;
	}

	public void func_145951_a(String p_145951_1_) {
		this.field_145958_o = p_145951_1_;
	}

	@Override
	public void readFromNBT(NBTTagCompound p_145839_1_) {
		super.readFromNBT(p_145839_1_);
		NBTTagList nbttaglist = p_145839_1_.getTagList("Items", 10);
		this.presserItemStacks = new ItemStack[this.getSizeInventory()];

		for (int i = 0; i < nbttaglist.tagCount(); ++i) {
			NBTTagCompound nbttagcompound1 = nbttaglist.getCompoundTagAt(i);
			byte b0 = nbttagcompound1.getByte("Slot");

			if (b0 >= 0 && b0 < this.presserItemStacks.length) {
				this.presserItemStacks[b0] = ItemStack.loadItemStackFromNBT(nbttagcompound1);
			}
		}

		this.presserBurnTime = p_145839_1_.getShort("BurnTime");
		this.presserCookTime = p_145839_1_.getShort("CookTime");
		this.currentItemBurnTime = getItemBurnTime(this.presserItemStacks[1]);

		if (p_145839_1_.hasKey("CustomName", 8)) {
			this.field_145958_o = p_145839_1_.getString("CustomName");
		}
	}

	@Override
	public void writeToNBT(NBTTagCompound p_145841_1_) {
		super.writeToNBT(p_145841_1_);
		p_145841_1_.setShort("BurnTime", (short) this.presserBurnTime);
		p_145841_1_.setShort("CookTime", (short) this.presserCookTime);
		NBTTagList nbttaglist = new NBTTagList();

		for (int i = 0; i < this.presserItemStacks.length; ++i) {
			if (this.presserItemStacks[i] != null) {
				NBTTagCompound nbttagcompound1 = new NBTTagCompound();
				nbttagcompound1.setByte("Slot", (byte) i);
				this.presserItemStacks[i].writeToNBT(nbttagcompound1);
				nbttaglist.appendTag(nbttagcompound1);
			}
		}

		p_145841_1_.setTag("Items", nbttaglist);

		if (this.hasCustomInventoryName()) {
			p_145841_1_.setString("CustomName", this.field_145958_o);
		}
	}

	@SideOnly(Side.CLIENT)
	public int getCookProgressScaled(int p_145953_1_) {
		return this.presserCookTime * p_145953_1_ / 200;
	}

	private static int getItemBurnTime(ItemStack itemStack) {
		if (itemStack == null) {
			return 0;
		} else {
			Item item = itemStack.getItem();

			if (item instanceof ItemBlock && Block.getBlockFromItem(item) != Blocks.air) {
				Block block = Block.getBlockFromItem(item);

				if (block == Blocks.wooden_slab) {
					return 150;
				}

				if (block.getMaterial() == Material.wood) {
					return 300;
				}

				if (block == Blocks.coal_block) {
					return 16000;
				}
			}

			if (item instanceof ItemTool && ((ItemTool) item).getToolMaterialName().equals("WOOD"))
				return 200;
			if (item instanceof ItemSword && ((ItemSword) item).getToolMaterialName().equals("WOOD"))
				return 200;
			if (item instanceof ItemHoe && ((ItemHoe) item).getToolMaterialName().equals("WOOD"))
				return 200;
			if (item == Items.stick)
				return 100;
			if (item == Items.coal)
				return 1600;
			if (item == Items.lava_bucket)
				return 20000;
			if (item == Item.getItemFromBlock(Blocks.sapling))
				return 100;
			if (item == Items.blaze_rod)
				return 2400;
			return GameRegistry.getFuelValue(itemStack);
		}
	}

	public static boolean isItemFuel(ItemStack p_145954_0_) {
		/**
		 * Returns the number of ticks that the supplied fuel item will keep the
		 * furnace burning, or 0 if the item isn't fuel
		 */
		return getItemBurnTime(p_145954_0_) > 0;
	}

	@SideOnly(Side.CLIENT)
	public int getBurnTimeRemainingScaled(int p_145955_1_) {
		if (this.currentItemBurnTime == 0) {
			this.currentItemBurnTime = 200;
		}

		return this.presserBurnTime * p_145955_1_ / this.currentItemBurnTime;
	}

	@Override
	public int getInventoryStackLimit() {
		// TODO Auto-generated method stub
		return 64;
	}

	public boolean isBurning() {
		return this.presserBurnTime > 0;
	}

	public void updateEntity() {
		boolean flag = this.presserBurnTime > 0;
		boolean flag1 = false;

		if (this.presserBurnTime > 0) {
			--this.presserBurnTime;
		}

		if (!this.worldObj.isRemote) {
			if (this.presserBurnTime != 0 || this.presserItemStacks[1] != null && this.presserItemStacks[0] != null) {
				if (this.presserBurnTime == 0 && this.canSmelt()) {
					this.currentItemBurnTime = this.presserBurnTime = getItemBurnTime(this.presserItemStacks[1]);

					if (this.presserBurnTime > 0) {
						flag1 = true;

						if (this.presserItemStacks[1] != null) {
							--this.presserItemStacks[1].stackSize;

							if (this.presserItemStacks[1].stackSize == 0) {
								this.presserItemStacks[1] = presserItemStacks[1].getItem()
										.getContainerItem(presserItemStacks[1]);
							}
						}
					}
				}

				if (this.isBurning() && this.canSmelt()) {
					++this.presserCookTime;

					if (this.presserCookTime == 200) {
						this.presserCookTime = 0;
						this.smeltItem();
						flag1 = true;
					}
				} else {
					this.presserCookTime = 0;
				}
			}

			if (flag != this.presserBurnTime > 0) {
				flag1 = true;
				alloyPresser.updateFurnaceBlockState(this.presserBurnTime > 0, this.worldObj, this.xCoord, this.yCoord,
						this.zCoord);
			}
		}

		if (flag1) {
			this.markDirty();
		}
	}

	private void smeltItem() {
		if (this.canSmelt()) {
			ItemStack itemstack = FurnaceRecipes.smelting().getSmeltingResult(this.presserItemStacks[0]);

			if (this.presserItemStacks[2] == null) {
				this.presserItemStacks[2] = itemstack.copy();
			} else if (this.presserItemStacks[2].getItem() == itemstack.getItem()) {
				this.presserItemStacks[2].stackSize += itemstack.stackSize; // Forge
																			// BugFix:
																			// Results
																			// may
																			// have
																			// multiple
																			// items
			}

			--this.presserItemStacks[0].stackSize;

			if (this.presserItemStacks[0].stackSize <= 0) {
				this.presserItemStacks[0] = null;
			}
		}

	}

	private boolean canSmelt() {
		if (this.presserItemStacks[0] == null) {
			return false;
		} else {
			ItemStack itemstack = FurnaceRecipes.smelting().getSmeltingResult(this.presserItemStacks[0]);
			if (itemstack == null)
				return false;
			if (this.presserItemStacks[2] == null)
				return true;
			if (!this.presserItemStacks[2].isItemEqual(itemstack))
				return false;
			int result = presserItemStacks[2].stackSize + itemstack.stackSize;
			return result <= getInventoryStackLimit() && result <= this.presserItemStacks[2].getMaxStackSize(); // Forge
																												// BugFix:
																												// Make
																												// it
																												// respect
																												// stack
																												// sizes
																												// properly.
		}
	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer p_70300_1_) {
		return this.worldObj.getTileEntity(this.xCoord, this.yCoord, this.zCoord) != this ? false
				: p_70300_1_.getDistanceSq((double) this.xCoord + 0.5D, (double) this.yCoord + 0.5D,
						(double) this.zCoord + 0.5D) <= 64.0D;
	}

	@Override
	public void openInventory() {
	}

	@Override
	public void closeInventory() {
	}

	@Override
	public boolean isItemValidForSlot(int p_94041_1_, ItemStack p_94041_2_) {
		return p_94041_1_ == 2 ? false : (p_94041_1_ == 1 ? isItemFuel(p_94041_2_) : true);
	}

	@Override
	public int[] getAccessibleSlotsFromSide(int p_94128_1_) {
		return p_94128_1_ == 0 ? slotBottom : (p_94128_1_ == 1 ? slotTop : slotSides);
	}

	@Override
	public boolean canInsertItem(int p_102007_1_, ItemStack p_102007_2_, int p_102007_3_) {
		return this.isItemValidForSlot(p_102007_1_, p_102007_2_);
	}

	@Override
	public boolean canExtractItem(int p_102008_1_, ItemStack p_102008_2_, int p_102008_3_) {
		return p_102008_3_ != 0 || p_102008_1_ != 1 || p_102008_2_.getItem() == Items.bucket;
	}

	public int getState() {
		// TODO Auto-generated method stub
		return state;
	}

}
