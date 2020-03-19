package com.example.examplemod.item;

import com.example.examplemod.ExampleMod;

import net.minecraft.item.ItemSword;

public class ItemExSword extends ItemSword {
	
	public ItemExSword(ToolMaterial material, String unlocalizedName, String registryName) {
		super(material);
		
		setUnlocalizedName(ExampleMod.MODID + "." + unlocalizedName);
		setRegistryName(registryName);
			}

}