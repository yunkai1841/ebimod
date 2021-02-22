package com.ebi.youare;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;


public class BlockOmaebi extends Block {
    public BlockOmaebi(){
        super(new Material(MapColor.CLOTH));
        this.setRegistryName("ebimod", "omaebi");
        this.setCreativeTab(CreativeTabs.TOOLS);
        this.setUnlocalizedName("omaebi");
//        this.setHardness(0.5f);
//        ResourceLocation location = new ResourceLocation("ebimod", "put_omaebi");
//        SoundEvent place = new SoundEvent(location);
//        SoundType st = new SoundType(1.0f,1.0f, SoundEvents.BLOCK_WOOD_BREAK,
//                SoundEvents.BLOCK_WOOD_STEP, place, SoundEvents.BLOCK_WOOD_HIT, SoundEvents.BLOCK_WOOD_FALL;
    }
}
