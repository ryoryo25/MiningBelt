package ryoryo.miningbelt.proxy;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLLoadCompleteEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import ryoryo.miningbelt.event.MiningEvent;
import ryoryo.miningbelt.item.ModItems;

public class CommonProxy
{
	public void preInit(FMLPreInitializationEvent event)
	{
		ModItems.init();
	}

	public void init(FMLInitializationEvent event)
	{
		MinecraftForge.EVENT_BUS.register(new MiningEvent());
	}

	public void postInit(FMLPostInitializationEvent event)
	{
	}

	public void loadComplete(FMLLoadCompleteEvent event)
	{
	}
}