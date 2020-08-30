package de.unbotheredstudios.moreutils.init;

import de.unbotheredstudios.moreutils.objects.blocks.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class BlockInit {
    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block COMPANION_CUBE = new BlockBase("companion_cube", Material.ANVIL);
}
