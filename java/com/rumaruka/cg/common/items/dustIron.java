package com.rumaruka.cg.common.items;

import com.rumaruka.cg.client.gui.creativetabs.CreativeTabsSG;
import com.rumaruka.cg.reference.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class dustIron extends Item {
	
	public dustIron()
	{
		super();
		setCreativeTab(CreativeTabsSG.SG_TAB);
		setUnlocalizedName("dustIron");
		setTextureName(Reference.MOD_ID+":"+"dustIron");
	}

}
