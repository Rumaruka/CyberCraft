package com.rumaruka.cybercraft.recipes;

import com.rumaruka.cybercraft.cybercraft;
import com.rumaruka.cybercraft.blocks.register.ModBlocks;
import com.rumaruka.cybercraft.items.register.ModItems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import scala.annotation.meta.companionClass;

public class RecipesVanilla {
	
	public static final void loadRecipesVanilla()
	{
		
		ItemStack output;
		
		output = new ItemStack(ModBlocks.alloy_presser);
		 GameRegistry.addRecipe(new ShapedOreRecipe(output, "iri", "aSa", "iri",
                'i', "ingotIron", 'r', Items.redstone, 'a', ModItems.ShardmJI, 'S', Blocks.stone)); 
		
		
		
		
	}

}
