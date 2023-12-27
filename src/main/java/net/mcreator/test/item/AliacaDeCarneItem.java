
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

import net.mcreator.test.procedures.UnequipProcedure;
import net.mcreator.test.procedures.EquipCarneProcedure;
import net.mcreator.test.procedures.AnelDeCarneProcedure;

import java.util.List;

public class AliacaDeCarneItem extends Item implements ICurioItem {
	public AliacaDeCarneItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("\u00A7c\u00A7lCoberto por vinhas vermelhas de carne"));
		list.add(new TextComponent("\u00A7c\u00A7l possuindo uma linda j\u00F3ia de \u00A7r\u00A74\u00A7lRubi \u00A7r\u00A7c\u00A7lvermelho sangue"));
		list.add(new TextComponent("\u00A7c\u00A7lparece at\u00E9 estar vivo"));
	}

	@Override
	public void curioTick(SlotContext slotContext, ItemStack stack) {
		AnelDeCarneProcedure.execute(slotContext.entity().level, slotContext.entity());
	}

	@Override
	public void onEquip(SlotContext slotContext, ItemStack prevStack, ItemStack stack) {
		EquipCarneProcedure.execute(slotContext.entity());
	}

	@Override
	public void onUnequip(SlotContext slotContext, ItemStack newStack, ItemStack stack) {
		UnequipProcedure.execute(slotContext.entity());
	}
}
