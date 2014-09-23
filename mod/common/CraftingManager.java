package PixelCoders.mod;

public class CraftingManager {
	
	public static void MainClass(){
		addCraftingRecipes();
		
		
	}
	
	public static void addCraftingRecipes(){
		
		
		// Example
		GameRegistry.addShapedRecipe(new ItemStack(Mod.BLOCK), "BBB", "BBB", "BBB", 'B', Items.DIAMOND_BLOCK);
	}
	
}
