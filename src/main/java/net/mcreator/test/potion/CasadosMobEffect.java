
package net.mcreator.test.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class CasadosMobEffect extends MobEffect {
	public CasadosMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -65485);
	}

	@Override
	public String getDescriptionId() {
		return "effect.hollow_stuff.casados";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
