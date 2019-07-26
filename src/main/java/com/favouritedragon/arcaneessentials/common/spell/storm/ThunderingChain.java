package com.favouritedragon.arcaneessentials.common.spell.storm;

import electroblob.wizardry.constants.Element;
import electroblob.wizardry.constants.SpellType;
import electroblob.wizardry.constants.Tier;
import electroblob.wizardry.spell.Spell;
import electroblob.wizardry.util.SpellModifiers;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class ThunderingChain extends Spell {

	public ThunderingChain(Tier tier, int cost, Element element, String name, SpellType type, int cooldown, EnumAction action, boolean isContinuous) {
		super(Tier.ADVANCED, cost, element, name, type, cooldown, action, isContinuous);
	}

	@Override
	public boolean cast(World world, EntityPlayer caster, EnumHand hand, int ticksInUse, SpellModifiers modifiers) {
		return false;
	}
}
