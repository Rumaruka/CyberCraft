package com.rumaruka.cybercraft;

import com.rumaruka.cybercraft.blocks.register.mainblocks;


import com.rumaruka.cybercraft.creativetabs.CreativeCyberCraft;
import com.rumaruka.cybercraft.items.register.mainitems;
import com.rumaruka.cybercraft.recipes.RecipesVanilla;
import com.rumaruka.cybercraft.reference.Reference;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;


@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class cybercraft {
	
	public static final CreativeTabs tabCyberCraft = new CreativeCyberCraft(CreativeTabs.getNextID(), Reference.NAME);
	
	

	@Mod.Instance("cybercraft")
	public static cybercraft instance;
	
	

	@Mod.EventHandler
	public void preinit(FMLPreInitializationEvent e) {
		mainblocks.init();
		RecipesVanilla.loadRecipesVanilla();
		mainitems.init();
		//CrystalRegister
		
		
		
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent e) {

	}

	@Mod.EventHandler
	public void postinit(FMLPostInitializationEvent e) {

	}

	@Mod.EventHandler
	public void serverLoad(FMLServerStartingEvent e) {

	}

}
