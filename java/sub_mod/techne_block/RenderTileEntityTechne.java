package sub_mod.techne_block;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

public class RenderTileEntityTechne extends TileEntitySpecialRenderer {

	public static final ModelBlock model = new ModelBlock();
	public static final ResourceLocation texture = new ResourceLocation(ModBlockTechne.MODID, "textures/blocks/model_techne.png");

	@Override
	public void renderTileEntityAt(TileEntity tile, double x, double y, double z, float f) {
		render((TileEntityTechne)tile, x, y, z, f);
	}

	private void render(TileEntityTechne tile, double x, double y, double z, float f) {
		GL11.glPushMatrix();
		GL11.glTranslated(x, y, z);
		GL11.glTranslatef(0.5F, 1.5F, 0.5F);
		GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
		bindTexture(texture);
		model.render();
		GL11.glPopMatrix();
	}

}
