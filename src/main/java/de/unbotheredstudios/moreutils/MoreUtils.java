package de.unbotheredstudios.moreutils;

import de.unbotheredstudios.moreutils.proxy.CommonProxy;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = MoreUtils.MODID, name = MoreUtils.NAME, version = MoreUtils.VERSION)
public class MoreUtils
{
    public static final String MODID = "moreutils";
    public static final String NAME = "More Utils";
    public static final String VERSION = "v1";
    public static final String CLIENT = "de.unbotheredstudios.moreutils.proxy.CommonProxy";
    public static final String COMMON = "de.unbotheredstudios.moreutils.proxy.CommonProxy";

    private static Logger logger;

     @SidedProxy(clientSide = CLIENT, serverSide = COMMON)
     public static CommonProxy clientProxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

        logger = event.getModLog();
        logger.info("MoreUtils pre-initialized.");
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        logger.info("MoreUtils initialized.");
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        // some example code
        logger.info("MoreUtils post-initialized.");

    }
}
