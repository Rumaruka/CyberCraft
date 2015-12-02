package com.rumaruka.cybercraft.world.generator.OreGenerator;

import java.util.Random;

import com.rumaruka.cybercraft.blocks.register.ModBlocks;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class OreGeneration implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator,
			IChunkProvider chunkProvider) {
		switch(world.provider.dimensionId){
		case -1:
			generateNether(world, random , chunkX*16, chunkZ*16);
			break;
		case 0:
			generateSurface(world, random , chunkX*16, chunkZ*16);
			break;
		case 1:
			generatorEnd(world, random , chunkX*16, chunkZ*16);
			break;
				
		}

	}

	private void generatorEnd(World world, Random random, int i, int j) {
		// NOOP
		
	}

	private void generateSurface(World world, Random rand, int chunkX, int chunkZ) {
		for(int k = 0; k < 10; k++){
        	int firstBlockXCoord = chunkX + rand.nextInt(16);
        	int firstBlockYCoord = rand.nextInt(35);
        	int firstBlockZCoord = chunkZ + rand.nextInt(16);
        	
        	(new WorldGenMinable(ModBlocks.orePureShard, 13)).generate(world, rand, firstBlockXCoord, firstBlockYCoord, firstBlockZCoord);
        }
		}
		
	

	private void generateNether(World world, Random random, int i, int j) {
		// noop
		
	}

}
