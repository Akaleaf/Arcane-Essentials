package com.favouritedragon.arcaneessentials.client.render;

import com.favouritedragon.arcaneessentials.common.entity.EntitySolarBeam;
import com.favouritedragon.arcaneessentials.common.util.ArcaneUtils;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.Vec3d;

import javax.annotation.Nullable;

public class RenderSolarBeam extends Render<EntitySolarBeam> {

	public RenderSolarBeam(RenderManager renderManager) {
		super(renderManager);
	}

	@Override
	public void doRender(EntitySolarBeam entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);
		if (entity.ticksExisted == 2 || entity.ticksExisted % 20 == 0) {
			ArcaneUtils.spawnSpinningDirectionalHelix(entity.world, entity, Vec3d.ZERO, Vec3d.ZERO, 270, entity.getRange(), entity.getRadius(), WizardryParticleType.SPARKLE, entity.getPositionVector(),
					new Vec3d(0.04, 0, 0.04), 100, 0.1F, 1.0F, 0.4F);
		}
	}

	@Nullable
	@Override
	protected ResourceLocation getEntityTexture(EntitySolarBeam entity) {
		return null;
	}
}
