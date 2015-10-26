package com.runescape.core.game.model.entity.character.player.update.impl;

import com.runescape.core.game.model.entity.UpdateFlags;
import com.runescape.core.game.model.entity.character.player.Player;
import com.runescape.core.game.model.entity.character.player.update.UpdateBlock;
import com.runescape.core.net.channel.message.PacketBuilder;

public final class PlayerMovementBlock extends UpdateBlock {

	@Override
	public void update(Player player, PacketBuilder buffer) {
		if (player.getUpdateFlags().contains(UpdateFlags.UPDATE_MAP_REGION)) {
			buffer.putBits(1, 1);
			buffer.putBits(2, 3);
			buffer.putBits(2, player.getLocation().getZ());
			buffer.putBits(1, 1);
			buffer.putBits(1, player.updateRequired() ? 1 : 0);
			buffer.putBits(7, player.getLocation().getLocalY(player.getLastLocation()));
			buffer.putBits(7, player.getLocation().getLocalX(player.getLastLocation()));

		} else {
			if (player.getWalkingDirection() == -1) {
				if (player.updateRequired()) {
					buffer.putBits(1, 1);
					buffer.putBits(2, 0);
				} else {
					buffer.putBits(1, 0);
				}
			} else {
				if (player.getRunningDirection() == -1) {
					buffer.putBits(1, 1);
					buffer.putBits(2, 1);
					buffer.putBits(3, player.getWalkingDirection());
					buffer.putBits(1, player.updateRequired() ? 1 : 0);

				} else {
					buffer.putBits(1, 1);
					buffer.putBits(2, 2);
					buffer.putBits(3, player.getWalkingDirection());
					buffer.putBits(3, player.getRunningDirection());
					buffer.putBits(1, player.updateRequired() ? 1 : 0);
				}
			}
		}
	}
}