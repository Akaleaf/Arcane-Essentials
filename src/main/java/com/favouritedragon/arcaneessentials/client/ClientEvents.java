package com.favouritedragon.arcaneessentials.client;

import com.favouritedragon.arcaneessentials.ArcaneEssentials;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

import java.util.Objects;

import static com.favouritedragon.arcaneessentials.common.item.ArcaneItems.*;

@Mod.EventBusSubscriber(value = Side.CLIENT, modid = ArcaneEssentials.MODID)
public class ClientEvents {

	@SubscribeEvent
	public static void onModelRegistry(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(masterLightningSword, 0,
				new ModelResourceLocation(Objects.requireNonNull(masterLightningSword.getRegistryName()), "inventory"));
		ModelLoader.setCustomModelResourceLocation(masterSorcerySword, 0,
				new ModelResourceLocation(Objects.requireNonNull(masterSorcerySword.getRegistryName()), "inventory"));
		ModelLoader.setCustomModelResourceLocation(masterNatureSword, 0,
				new ModelResourceLocation(Objects.requireNonNull(masterNatureSword.getRegistryName()), "inventory"));
		ModelLoader.setCustomModelResourceLocation(masterFireSword, 0,
				new ModelResourceLocation(Objects.requireNonNull(masterFireSword.getRegistryName()), "inventory"));
		ModelLoader.setCustomModelResourceLocation(masterIceSword, 0,
				new ModelResourceLocation(Objects.requireNonNull(masterIceSword.getRegistryName()), "inventory"));
		ModelLoader.setCustomModelResourceLocation(masterHealingSword, 0,
				new ModelResourceLocation(Objects.requireNonNull(masterHealingSword.getRegistryName()), "inventory"));
		ModelLoader.setCustomModelResourceLocation(masterNecromancySword, 0,
				new ModelResourceLocation(Objects.requireNonNull(masterNecromancySword.getRegistryName()), "inventory"));
	}
}
