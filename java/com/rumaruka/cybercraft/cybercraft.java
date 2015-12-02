package com.rumaruka.cybercraft;

import com.rumaruka.cybercraft.achievement.Achievements;
import com.rumaruka.cybercraft.blocks.register.ModBlocks;
import com.rumaruka.cybercraft.blocks.testing.DebugBlock;
import com.rumaruka.cybercraft.creativetabs.CreativeCyberCraft;
import com.rumaruka.cybercraft.handler.GuiHandler;
import com.rumaruka.cybercraft.items.register.ModItems;
import com.rumaruka.cybercraft.recipes.RecipesVanilla;
import com.rumaruka.cybercraft.reference.Reference;
import com.rumaruka.cybercraft.tileentity.register.RegisterTileEntites;
import com.rumaruka.cybercraft.world.generator.OreGenerator.OreGeneration;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.creativetab.CreativeTabs;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class cybercraft {

	public static final CreativeTabs tabCyberCraft = new CreativeCyberCraft(CreativeTabs.getNextID(), Reference.NAME);

	@Mod.Instance("cybercraft")
	public static cybercraft instance;
	
	/* @SidedProxy(clientSide = Reference.ClientProxy, serverSide = Reference.ServerProxy)
	public static IProxy proxy; */

	@Mod.EventHandler
	public void preinit(FMLPreInitializationEvent e) {
		RegisterTileEntites.init();
		ModItems.init();
		ModBlocks.init();
		GameRegistry.registerWorldGenerator(new OreGeneration(), 0 );
		
	}


	

	@Mod.EventHandler
	public void init(FMLInitializationEvent e) {
		RecipesVanilla.loadRecipesVanilla();
		NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GuiHandler());
		Achievements.init();
		
	}

	@Mod.EventHandler
	public void postinit(FMLPostInitializationEvent e) {

	}

	@Mod.EventHandler
	public void serverLoad(FMLServerStartingEvent e) {

	}

}
