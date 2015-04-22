package sub_mod.techne_block;

import net.minecraft.block.Block;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod (modid = ModBlockTechne.MODID, name = ModBlockTechne.MODNAME, version = ModBlockTechne.VERSION)

public class ModBlockTechne {

	public static final String MODID = "sub_mod_techne_block";
	public static final String MODNAME = "SM_TB";
	public static final String VERSION = "0.1a";

	@Instance(ModBlockTechne.MODID) public static ModBlockTechne instance;
	@SidedProxy(modId = ModBlockTechne.MODID, clientSide = "sub_mod.techne_block.ProxyClient", serverSide = "sub_mod.techne_block.ProxyCommon")
	public static ProxyCommon proxy;

	public static Block block_techne;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {

		block_techne = new BlockTechne();
		GameRegistry.registerBlock(block_techne, "block_techne");

		GameRegistry.registerTileEntity(TileEntityTechne.class, "TileEntityTechne");

		proxy.preInit();

	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init();
	}

}