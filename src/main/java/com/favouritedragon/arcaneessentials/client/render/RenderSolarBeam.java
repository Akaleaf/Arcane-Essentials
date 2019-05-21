package com.favouritedragon.arcaneessentials.client.render;

import com.favouritedragon.arcaneessentials.common.entity.EntitySolarBeam;
import com.favouritedragon.arcaneessentials.common.util.ArcaneUtils;
import electroblob.wizardry.util.WizardryParticleType;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.EnumParticleTypes;
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
		ArcaneUtils.spawnDirectionalHelix(entity.world, entity, Vec3d.ZERO, 240, entity.getRange(), entity.getRadius(), WizardryParticleType.SPARKLE, entity.getPositionVector(),
				new Vec3d(0.3, 0.05, 0.3), 40, 0.1F, 1.0F, 0.4F);
	}

	@Nullable
	@Override
	protected ResourceLocation getEntityTexture(EntitySolarBeam entity) {
		return null;
	}
}
