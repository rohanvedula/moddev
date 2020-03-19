package com.example.examplemod.client;

import com.example.examplemod.item.ItemExSword;
import com.example.examplemod.materials.ExampleMaterials;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegistryHandler {
	
	@SubscribeEvent
	public static void registerItems(Register<Item> event) {
		final Item[] items = {
				new ItemExSword(ExampleMaterials.TUTORIAL_TOOL, "swordEx", "example_sword"),
				
		};

		
		event.getRegistry().registerAll(items);
	}
	
}