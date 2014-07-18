package PixelCoders.mod.common.core;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import PixelCoders.mod.common.tabs.PixelTab;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;

	
	@Mod(modid = "PixelCodersMod", version = "0.0.1")
	
	public class PixelCodersMod {
		
		
		@SidedProxy(clientSide= "PixelCoders.mod.common.core.PixelClientProxy", serverSide= "PixelCoders.mod.common.core.CommonPixelProxy")
		
		public static CommonPixelProxy proxy;
		
		@Instance("PixelCodersMod")


		public static PixelCodersMod instance = new PixelCodersMod();
		
		//Tool Materials
		
		public static ToolMaterial toolGemaDeOricalco = EnumHelper.addToolMaterial("GEMADEORICALCO", 4, 2077, 10.64F, 4.0F, 18);
		
		//Armor Materials
		
		public static ArmorMaterial armorGemaDeOricalco = EnumHelper.addArmorMaterial("GemaDeOricalco", 44, new int[]{4, 10, 7, 4}, 35);
		
		//Tabs
		
		public static CreativeTabs PixelTab = new PixelTab(CreativeTabs.getNextID(), "Pixel Tab");
		
		//Blocks
		
		//Items

		
		
				//Ores Worldgen

		@EventHandler

		 
	    public void init(FMLInitializationEvent event){
			
					
					//Config
					
					//Blocks Init
					
					//Items Init

					//Blocks Registry

					
					//Misc Worldgen
					
					
					//Treasure Worldgen
					
				    
				    //Misc
				    		    
				    //Minecraft Forge Properties
				    				
				    //Treecapitator Support
				    	
				    			        
				    //Ore Dictionary

				    //New Items
				    
				    
				    
				    //Crafting
				    
				    //Smelting Recipies
				    
				    //Ore Dictionary "Armor"
				    
				    //Tools
					
					
						    
				    //Crafting (Ore Dictionary)
					
					
				    			   
	}
	}