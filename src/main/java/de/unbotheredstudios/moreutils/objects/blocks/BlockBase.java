package de.unbotheredstudios.moreutils.objects.blocks;

import de.unbotheredstudios.moreutils.MoreUtils;
import de.unbotheredstudios.moreutils.init.BlockInit;
import de.unbotheredstudios.moreutils.init.ItemInit;
import de.unbotheredstudios.moreutils.utils.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel {

    public BlockBase(String name, Material material) {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MATERIALS);

        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public void registerModels() {
        MoreUtils.clientProxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }

}
