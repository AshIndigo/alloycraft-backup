package com.alloycraft.exxo;

import com.alloycraft.exxo.blocks.*;
import com.alloycraft.exxo.lib.*;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Refrences.MODID, version = Refrences.VERSION)
public class Alloycraft
{
    public static Block cookieblock;
    
    @EventHandler
    public void preinit(FMLPreInitializationEvent event)
    {
    	cookieblock = new BlockCookie();
    	GameRegistry.registerBlock(cookieblock, "BlockCookie");
    	
    	//Recipes
    	GameRegistry.addRecipe(new ItemStack(Alloycraft.cookieblock, 1), new Object[]{
        	"AAA",
        	"AAA",
        	"AAA",
        	'A', Items.cookie
    });
    
    }
}
