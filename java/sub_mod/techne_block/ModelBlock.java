package sub_mod.techne_block;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelBlock extends ModelBase {

	ModelRenderer block;

	public ModelBlock() {
		textureWidth = 64;
		textureHeight = 32;

		block = new ModelRenderer(this, 0, 0);
		block.addBox(0F, 0F, 0F, 16, 16, 16);
		block.setRotationPoint(-8F, 8F, -8F);
		block.setTextureSize(64, 32);
		block.mirror = true;
		setRotation(block, 0F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		block.render(f5);
	}

	public void render() {
		block.render(0.0625F);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	}

}
