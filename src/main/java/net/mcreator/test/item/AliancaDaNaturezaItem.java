
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

import net.mcreator.test.procedures.UnequipNaturezaProcedure;
import net.mcreator.test.procedures.NaturezaEffectProcedure;
import net.mcreator.test.procedures.EquipNaturezaProcedure;

import java.util.List;

public class AliancaDaNaturezaItem extends Item implements ICurioItem {
	public AliancaDaNaturezaItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("\u00A7a\u00A7l\u00C9 envolto por vinhas e possui um leve aroma de \u00A7R\u00A7f\u00A7lFlores \u00A7r\u00A7a\u00A7lpare\u00E7e soltar pequenas part\u00EDculas em volta de si."));
	}

	@Override
	public void curioTick(SlotContext slotContext, ItemStack stack) {
		NaturezaEffectProcedure.execute(slotContext.entity().level, slotContext.entity());
	}

	@Override
	public void onEquip(SlotContext slotContext, ItemStack prevStack, ItemStack stack) {
		EquipNaturezaProcedure.execute(slotContext.entity());
	}

	@Override
	public void onUnequip(SlotContext slotContext, ItemStack newStack, ItemStack stack) {
		UnequipNaturezaProcedure.execute(slotContext.entity());
	}
}
