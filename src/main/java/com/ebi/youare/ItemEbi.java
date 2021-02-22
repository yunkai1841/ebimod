package com.ebi.youare;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class ItemEbi extends ItemFood {

    public ItemEbi() {
        super(5,5,false);
        this.setRegistryName("ebimod", "ebi");
        this.setCreativeTab(CreativeTabs.FOOD);
        this.setUnlocalizedName("ebi");
        this.setAlwaysEdible();
    }
}
