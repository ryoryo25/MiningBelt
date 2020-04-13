package ryoryo.miningbelt.item;

import net.minecraft.item.Item;
import ryoryo.polishedlib.util.Utils;

public class ModItems
{
	public static final Item ITEM_MINING_BELT = new ItemMiningBelt();

	public static void init()
	{
		Utils.registerItem(ITEM_MINING_BELT, "mining_belt");
	}
}