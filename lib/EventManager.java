package com.alloycraft.exxo.lib;

import java.util.Random;

import com.alloycraft.exxo.Alloycraft;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;

public class EventManager implements IWorldGenerator {

	@Override
public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
	    switch (world.provider.dimensionId) {
	    case 0: //Overworld
	    	private WorldGenerator gen_tutorial_ore; //Generates Tutorial Ore (used in Overworld)

	    	public Alloycraft() {
	    	    this.cookieblock = new WorldGenMinable(Alloycraft.tutorial_ore, 8);
	    	}

	        break;
	    case -1: //Nether

	        break;
	    case 1: //End

	        break;
	    }
	}
}
