package com.rumaruka.cybercraft.recipes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.google.common.collect.Maps;
import com.rumaruka.cybercraft.items.register.ModItems;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFishFood;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.oredict.OreDictionary;

public class RecipeAlloyPresser {
private static final RecipeAlloyPresser smeltingBase = new RecipeAlloyPresser();
/** The list of smelting results. */
private Map smeltingList = new HashMap();
private Map experienceList = new HashMap();
private static final String __OBFID = "CL_00000085";

/**
 * Used to call methods addSmelting and getSmeltingResult.
 */
public static RecipeAlloyPresser smelting()
{
    return smeltingBase;
}

private RecipeAlloyPresser()
{
	 this.presser(ModItems.ShardmJI,Items.iron_ingot,  new ItemStack(ModItems.ingotmJI), 0.7F);
   
}



public void presser(Item iIn,Item ironIngot ,ItemStack out, float exp)
{
    this.func_151394_a(new ItemStack(iIn,1, 32767), ironIngot, out, exp);
}

public void func_151394_a(ItemStack isIN, Item ironIngot, ItemStack isOut, float exp)
{
    this.smeltingList.put(isIN,ironIngot);
    this.experienceList.put(isOut, Float.valueOf(exp));
}

/**
 * Returns the smelting result of an item.
 */
public ItemStack getSmeltingResult(ItemStack p_151395_1_)
{
    Iterator iterator = this.smeltingList.entrySet().iterator();
    Entry entry;

    do
    {
        if (!iterator.hasNext())
        {
            return null;
        }

        entry = (Entry)iterator.next();
    }
    while (!this.func_151397_a(p_151395_1_, (ItemStack)entry.getKey()));

    return (ItemStack)entry.getValue();
}

private boolean func_151397_a(ItemStack p_151397_1_, ItemStack p_151397_2_)
{
    return p_151397_2_.getItem() == p_151397_1_.getItem() && (p_151397_2_.getItemDamage() == 32767 || p_151397_2_.getItemDamage() == p_151397_1_.getItemDamage());
}

public Map getSmeltingList()
{
    return this.smeltingList;
}

public float func_151398_b(ItemStack p_151398_1_)
{
    float ret = p_151398_1_.getItem().getSmeltingExperience(p_151398_1_);
    if (ret != -1) return ret;

    Iterator iterator = this.experienceList.entrySet().iterator();
    Entry entry;

    do
    {
        if (!iterator.hasNext())
        {
            return 0.0F;
        }

        entry = (Entry)iterator.next();
    }
    while (!this.func_151397_a(p_151398_1_, (ItemStack)entry.getKey()));

    return ((Float)entry.getValue()).floatValue();
}
}