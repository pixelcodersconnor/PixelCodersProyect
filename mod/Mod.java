package PixelCoders.mod;

@Mod(modid = Mod.MODID, version = Mod.VERSION)
public class Mod {

public static final String MODID = "mod";
public static final String VERSION = "alpha";
public static Mod modInstance

@Metadata
public static ModMetadata meta;


// ...


@EventHandler
	public void PreLoad(FMLInitializationEvent PreEvent) {

    // add crafting and smelting
    CraftingManager.MainClass();
    SmeltingManager.MainClass();
		

	}

@EventHandler
	public void init(FMLPreInitializationEvent event) {
	
	}

	
}
