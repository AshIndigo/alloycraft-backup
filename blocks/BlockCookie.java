package com.alloycraft.exxo.blocks;
 
import com.alloycraft.exxo.*;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
 
public class BlockCookie extends Block
{
	public BlockCookie()
	{
		super(Material.rock);
		setBlockName(Alloycraft.MODID + "_" + "BlockCookie");
		setCreativeTab(CreativeTabs.tabBlock);
		setBlockTextureName(Alloycraft.MODID + ":" + "BlockCookie");
	}
}