package de.unbotheredstudios.moreutils.objects.items;

import de.unbotheredstudios.moreutils.MoreUtils;
import de.unbotheredstudios.moreutils.init.ItemInit;
import de.unbotheredstudios.moreutils.utils.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

    public ItemBase(String name) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MATERIALS);

        ItemInit.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        MoreUtils.clientProxy.registerItemRenderer(this, 0, "inventory");
    }
}
