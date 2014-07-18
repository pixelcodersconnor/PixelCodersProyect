package PixelCoders.mod.common.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class PixelTab extends CreativeTabs {

	public PixelTab(int par1, String par2Str) {
		super("tabPixel"); }
		
	@Override
	public Item getTabIconItem() {
		
		return Items.book;
	}
	
	}