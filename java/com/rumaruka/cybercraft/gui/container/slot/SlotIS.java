package com.rumaruka.cybercraft.gui.container.slot;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotIS extends Slot{
	
	public final ItemStack is;
	
	public SlotIS(ItemStack is,IInventory inv, int index, int x, int y) {
		super(inv, index, x, y);
		this.is = is;
	}

}
