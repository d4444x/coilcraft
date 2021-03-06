package com.fynal.item;

import java.util.List;

import com.fynal.lib.Ref;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class steel_cc_armor extends ItemArmor{

	public steel_cc_armor(ArmorMaterial par1, int par2, int par3) {
		super(par1, par2, par3);
	}

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if(stack.getItem() == ModTools.steel_cc_helmet || stack.getItem() == ModTools.steel_cc_chestplate || stack.getItem() == ModTools.steel_cc_boots){
        	return (Ref.MODID + ":textures/models/armor/steel_cc_layer_1.png");
        }else if(stack.getItem() == ModTools.steel_cc_leggings){
        	return (Ref.MODID + ":textures/models/armor/steel_cc_layer_2.png");
        }else{
        	return null;
        }
    }

public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4){
par3List.add("High-Carbon Alloy");
}
}