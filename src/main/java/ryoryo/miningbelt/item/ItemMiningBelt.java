package ryoryo.miningbelt.item;

import baubles.api.BaubleType;
import baubles.api.BaublesApi;
import baubles.api.IBauble;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import ryoryo.polishedlib.item.ItemBase;

public class ItemMiningBelt extends ItemBase implements IBauble {
	public ItemMiningBelt() {
		super("mining_belt", CreativeTabs.TOOLS);
	}

	@Override
	public BaubleType getBaubleType(ItemStack itemstack) {
		return BaubleType.BELT;
	}

	@Override
	public boolean isEnchantable(ItemStack stack) {
		return true;
	}

	@Override
	public boolean canApplyAtEnchantingTable(ItemStack stack, Enchantment enchantment) {
		if(enchantment == Enchantment.getEnchantmentByID(32) || enchantment == Enchantment.getEnchantmentByID(33))
			return true;

		return false;
	}

	public static boolean isBeltEquipped(EntityPlayer player) {
		return BaublesApi.isBaubleEquipped(player, ModItems.ITEM_MINING_BELT) == BaubleType.BELT.getValidSlots()[0];
	}
}