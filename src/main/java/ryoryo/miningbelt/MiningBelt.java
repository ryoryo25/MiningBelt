package ryoryo.miningbelt;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLLoadCompleteEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import ryoryo.miningbelt.proxy.CommonProxy;
import ryoryo.miningbelt.util.References;

@Mod(modid = References.MOD_ID, name = References.MOD_NAME, version = References.MOD_VERSION, dependencies = References.MOD_DEPENDENCIES, acceptedMinecraftVersions = References.MOD_ACCEPTED_MC_VERSIONS, useMetadata = true)
public class MiningBelt {
	@Instance(References.MOD_ID)
	public static MiningBelt INSTANCE;

	@SidedProxy(clientSide = References.PROXY_CLIENT, serverSide = References.PROXY_COMMON)
	public static CommonProxy proxy;

	public static final Logger LOGGER = LogManager.getLogger(References.MOD_ID);

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		INSTANCE = this;
		proxy.preInit(event);
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init(event);
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
	}

	@EventHandler
	public void loadComplete(FMLLoadCompleteEvent event) {
		proxy.loadComplete(event);
	}
}