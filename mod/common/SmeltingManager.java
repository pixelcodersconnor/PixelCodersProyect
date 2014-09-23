package PixelCoders.mod;

public class SmeltingManager {
	
	public static void MainClass(){
		addSmeltingRecipes();
	}

	private static void addSmeltingRecipes() {
	
	    // Examples
			GameRegistry.addSmelting(Mod.BLOCK, new ItemStack(Mod.INGOT, 1), 10.0F);
			GameRegistry.addSmelting(Mod.BLOCK, new ItemStack(Mod.INGOT, 1), 10.0F);
			GameRegistry.addSmelting(Mod.BLOCK, new ItemStack(Mod.INGOT, 1), 10.0F);
			GameRegistry.addSmelting(Mod.BLOCK, new ItemStack(Mod.INGOT, 1), 5.0F);
		}

		
	}

