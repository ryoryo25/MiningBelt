package ryoryo.miningbelt.util;

public class References
{
	public static final String MOD_ID = "miningbelt";
	public static final String MOD_NAME = "MiningBelt";

	public static final String MOD_VERSION_MAJOR = "GRADLE.VERSION_MAJOR";
	public static final String MOD_VERSION_MINOR = "GRADLE.VERSION_MINOR";
	public static final String MOD_VERSION_PATCH = "GRADLE.VERSION_PATCH";
	public static final String MOD_VERSION = MOD_VERSION_MAJOR + "." + MOD_VERSION_MINOR + "." + MOD_VERSION_PATCH;

	public static final String MOD_DEPENDENCIES = "required-after:forge@[14.23.4.2705,);"
//												+ "required-after:polishedlib@[1.0.1,);"
												+ "required-after:polishedlib;"
												+ "required-after:baubles@[1.5.2,);";

	public static final String MOD_ACCEPTED_MC_VERSIONS = "[1.12.2]";

	public static final String PROXY_CLIENT = "ryoryo.miningbelt.proxy.ClientProxy";
	public static final String PROXY_COMMON = "ryoryo.miningbelt.proxy.CommonProxy";
}