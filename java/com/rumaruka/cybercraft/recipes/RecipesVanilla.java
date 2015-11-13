package com.rumaruka.cybercraft.recipes;

import com.rumaruka.cybercraft.cybercraft;
import com.rumaruka.cybercraft.blocks.register.mainblocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class RecipesVanilla {
	
	public static final void loadRecipesVanilla()
	{
		GameRegistry.addRecipe(new ItemStack(mainblocks.DebugBlock), new Object[]{
				"XEX",
				"EXE",
				"XEX", 
				'X', Items.iron_ingot
		});
	}

}
