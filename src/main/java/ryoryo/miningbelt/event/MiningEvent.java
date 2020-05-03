package ryoryo.miningbelt.event;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import ryoryo.miningbelt.item.ItemMiningBelt;

public class MiningEvent {
	@SubscribeEvent
	public void onMiningEvent(BlockEvent.BreakEvent event) {
	}

	@SubscribeEvent
	public void adjustMiningSpeed(PlayerEvent.BreakSpeed event) {
		EntityPlayer player = event.getEntityPlayer();
		IBlockState target = event.getState();

		if(ItemMiningBelt.isBeltEquipped(player)) {
			// event.setNewSpeed(Items.DIAMOND_PICKAXE.getDestroySpeed(new
			// ItemStack(Items.DIAMOND_PICKAXE), target));
			event.setNewSpeed(12f);
		}
	}

	@SubscribeEvent
	public void allowMining(PlayerEvent.HarvestCheck event) {
		EntityPlayer player = event.getEntityPlayer();
		IBlockState target = event.getTargetBlock();
		Block targetBlock = target.getBlock();

		if(ItemMiningBelt.isBeltEquipped(player)) {
			event.setCanHarvest(true);
		}
	}
}