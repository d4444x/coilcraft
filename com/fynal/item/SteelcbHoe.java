package com.fynal.item;

import net.minecraft.item.ItemHoe;
import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

public class SteelcbHoe extends ItemHoe{

 protected SteelcbHoe(ToolMaterial material) {
  super(material);
 }

public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4){
par3List.add("Cobalt-Carbon Alloy");
}
}