package sub_mod.techne_block;

import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;
import cpw.mods.fml.client.registry.ClientRegistry;

public class ProxyClient extends ProxyCommon {

	public void preInit() {
		super.preInit();
	}

	public void init() {
		super.init();

		//Blocks
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTechne.class, new RenderTileEntityTechne());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlockTechne.block_techne), new RenderItemBlockTechne());

	}

}
