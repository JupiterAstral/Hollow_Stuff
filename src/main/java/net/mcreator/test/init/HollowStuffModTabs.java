
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.test.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class HollowStuffModTabs {
	public static CreativeModeTab TAB_HOLLOW_SWORDS;

	public static void load() {
		TAB_HOLLOW_SWORDS = new CreativeModeTab("tabhollow_swords") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Items.AMETHYST_SHARD);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
