
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.test.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.test.potion.CasadosMobEffect;
import net.mcreator.test.HollowStuffMod;

public class HollowStuffModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, HollowStuffMod.MODID);
	public static final RegistryObject<MobEffect> CASADOS = REGISTRY.register("casados", () -> new CasadosMobEffect());
}
