package com.alloycraft.exxo;

import com.alloycraft.exxo.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Alloycraft.MODID, version = Alloycraft.VERSION)
public class Alloycraft
{
    public static final String MODID = "alloycraft";
    public static final String VERSION = "1.0";
    public static Block cookieblock;
    
    @EventHandler
    public void preinit(FMLPreInitializationEvent event)
    {
    	GameRegistry.addRecipe(new ItemStack(cookieblock), new Object[]{
        	"AAA",
        	"AAA",
        	"AAA",
        	'A', Items.cookie
    });
    	cookieblock = new BlockCookie();
    	GameRegistry.registerBlock(cookieblock, "BlockCookie");
    }
}
