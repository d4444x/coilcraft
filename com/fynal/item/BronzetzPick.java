package com.fynal.item;

import net.minecraft.item.ItemPickaxe;
import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

public class BronzetzPick extends ItemPickaxe{

 protected BronzetzPick(ToolMaterial material) {
  super(material);
 }

public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4){
par3List.add("Tin-Zinc Alloy");
}
}