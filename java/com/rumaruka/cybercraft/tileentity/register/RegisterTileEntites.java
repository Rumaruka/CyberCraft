package com.rumaruka.cybercraft.tileentity.register;

import com.rumaruka.cybercraft.tileentity.TileEntityAlloyPresser;

import cpw.mods.fml.common.registry.GameRegistry;

public class RegisterTileEntites {

	public static final void init() {
		GameRegistry.registerTileEntity(TileEntityAlloyPresser.class, "TileEntityAlloyPresser");
	}

}
