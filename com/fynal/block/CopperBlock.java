package com.fynal.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class CopperBlock extends Block{

	protected CopperBlock(Material iron) {
		super(Material.iron);
		this.setHardness(5.0f);
		this.setResistance(30.0f);
	}

}
