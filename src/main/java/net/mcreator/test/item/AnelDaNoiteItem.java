
package net.mcreator.test.item;

import top.theillusivec4.curios.api.type.capability.ICurioItem;
import top.theillusivec4.curios.api.SlotContext;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.test.procedures.AnelDaNoiteBaubleIsUnequippedProcedure;
import net.mcreator.test.procedures.AnelDaNoiteBaubleIsEquippeddProcedure;
import net.mcreator.test.procedures.AnelDaNoiteBaubleIsEquippedProcedure;

import java.util.List;

public class AnelDaNoiteItem extends Item implements ICurioItem {
	public AnelDaNoiteItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("\u00A76\u00A7lEmana um brilho semelhante a luz do \u00A7r\u00A7f\u00A7lLuar.."));
	}

	@Override
	public void curioTick(SlotContext slotContext, ItemStack stack) {
		AnelDaNoiteBaubleIsEquippedProcedure.execute(slotContext.entity().level, slotContext.entity());
	}

	@Override
	public void onEquip(SlotContext slotContext, ItemStack prevStack, ItemStack stack) {
		AnelDaNoiteBaubleIsEquippeddProcedure.execute(slotContext.entity());
	}

	@Override
	public void onUnequip(SlotContext slotContext, ItemStack newStack, ItemStack stack) {
		AnelDaNoiteBaubleIsUnequippedProcedure.execute(slotContext.entity());
	}
}
