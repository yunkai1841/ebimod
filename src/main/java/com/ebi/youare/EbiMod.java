package com.ebi.youare;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLConstructionEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod(modid = "ebimod", version = "beta", name = "EbiMod", acceptedMinecraftVersions = "1.12.2")
public class EbiMod {
    public static final Item EBI = new ItemEbi();
    public static final Block OMAEBI = new BlockOmaebi();

    @Mod.EventHandler
    public void construct(FMLConstructionEvent event)
    {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(EBI);
        event.getRegistry().register(new ItemBlock(OMAEBI).setRegistryName("ebimod", "omaebi"));
    }

    @SubscribeEvent
    public void registerBlocks(RegistryEvent.Register<Block> event){
        event.getRegistry().register(OMAEBI);
    }

    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(EBI, 0,
                new ModelResourceLocation(new ResourceLocation("ebimod", "ebi"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(OMAEBI), 0,
                new ModelResourceLocation(new ResourceLocation("ebimod", "omaebi"),"inventory"));
    }

}
