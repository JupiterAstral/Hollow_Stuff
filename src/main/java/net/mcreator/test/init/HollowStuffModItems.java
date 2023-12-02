
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.test.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.test.item.ArmaduraDeSlimeReforcadaItem;
import net.mcreator.test.HollowStuffMod;

public class HollowStuffModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, HollowStuffMod.MODID);
	public static final RegistryObject<Item> ARMADURA_DE_SLIME_REFORCADA_HELMET = REGISTRY.register("armadura_de_slime_reforcada_helmet", () -> new ArmaduraDeSlimeReforcadaItem.Helmet());
	public static final RegistryObject<Item> ARMADURA_DE_SLIME_REFORCADA_CHESTPLATE = REGISTRY.register("armadura_de_slime_reforcada_chestplate", () -> new ArmaduraDeSlimeReforcadaItem.Chestplate());
	public static final RegistryObject<Item> ARMADURA_DE_SLIME_REFORCADA_LEGGINGS = REGISTRY.register("armadura_de_slime_reforcada_leggings", () -> new ArmaduraDeSlimeReforcadaItem.Leggings());
	public static final RegistryObject<Item> ARMADURA_DE_SLIME_REFORCADA_BOOTS = REGISTRY.register("armadura_de_slime_reforcada_boots", () -> new ArmaduraDeSlimeReforcadaItem.Boots());
}
