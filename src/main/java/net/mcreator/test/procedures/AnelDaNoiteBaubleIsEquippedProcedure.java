package net.mcreator.test.procedures;

import top.theillusivec4.curios.api.CuriosApi;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.test.init.HollowStuffModMobEffects;
import net.mcreator.test.init.HollowStuffModItems;

public class AnelDaNoiteBaubleIsEquippedProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity lv) {
			CuriosApi.getCuriosHelper().findCurios(lv, HollowStuffModItems.ANEL_DA_NOITE.get()).forEach(item -> {
				ItemStack itemstackiterator = item.stack();
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(HollowStuffModMobEffects.CASADOS.get(), 20, 0, (true), (false)));
			});
		}
	}
}
