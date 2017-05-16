package net.budd.divblocks;
import java.util.Random;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = DivBlocks.MOD_ID, name = DivBlocks.MOD_NAME, version = DivBlocks.VERSION, dependencies = DivBlocks.DEPENDENCIES)
public class DivBlocks
{
	
	// Constants
	public static final String MOD_ID = "divblocks";
	public static final String MOD_NAME = "Diversity Blocks";
	public static final String VERSION = "@VERSION@";
	public static final String DEPENDENCIES = "required-after:forge@[13.20.0.2228,)"; // required-after:forge@[13.20.0.2228,);after:modid;after:another_modid (after means that not required)
	public static final String RESOURCE_PREFIX = MOD_ID.toLowerCase() + ":";
	
	//Variables
	public static Random random = new Random();
	
	@Instance(MOD_ID)
	public static DivBlocks instance;
	
	@SidedProxy(clientSide = "net.budd.divblocks.ClientProxy", serverSide = "net.budd.divblocks.ServerProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		
		proxy.preInit(event);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		
		proxy.init(event);
	}
	
	@EventHandler
	public void preInit(FMLPostInitializationEvent event)
	{
		
		proxy.postInit(event);
	}
}
