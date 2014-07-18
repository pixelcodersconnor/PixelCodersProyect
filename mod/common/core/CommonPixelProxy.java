package PixelCoders.mod.common.core;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class CommonPixelProxy implements IGuiHandler{
public void registerRenderInformation()
{
}
@Override
public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
return null;
}
@Override
public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
return null;
}
public void registerRenderThings()
{
	
}
}
