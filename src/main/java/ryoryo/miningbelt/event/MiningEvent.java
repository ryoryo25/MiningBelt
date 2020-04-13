package ryoryo.miningbelt.event;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.entity.player.PlayerEvent.BreakSpeed;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import ryoryo.miningbelt.item.ItemMiningBelt;
import ryoryo.polishedlib.util.Utils;

public class MiningEvent
{
	@SubscribeEvent
	public void onMiningEvent(BlockEvent.BreakEvent event)
	{
		EntityPlayer player = event.getPlayer();

		if(ItemMiningBelt.isBeltEquipped(player))
		{
			Utils.addChat(player, "equipped!");
		}
	}

	@SubscribeEvent
	public void onMining(BreakSpeed event)
	{

	}

	@SubscribeEvent
	public void onMiningEmpty(PlayerEvent.HarvestCheck event)
	{

	}
}