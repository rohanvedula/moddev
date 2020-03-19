package com.example.examplemod.init;

import com.example.examplemod.ExampleMod;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;


@ObjectHolder(ExampleMod.MODID)
public class ModItems {

	public static final Item FIRST_ITEM = null;
	public static final Item EXAMPLE_SWORD = null;
	
	@EventBusSubscriber(modid = ExampleMod.MODID)
	public static class RegistrationHandler {
		
		@SubscribeEvent
		public static void registerItems(Register<Item> event) {
			final Item[] items = {
					new Item().setRegistryName(ExampleMod.MODID, "first_item").setUnlocalizedName(ExampleMod.MODID + "." + "first_item")
			};

			event.getRegistry().registerAll(items);
		}
		
	}

}