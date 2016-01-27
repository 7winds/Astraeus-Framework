package main.astraeus.game.model.entity.mobile.npc.update.impl;

import main.astraeus.game.model.entity.mobile.npc.Npc;
import main.astraeus.game.model.entity.mobile.npc.update.NpcUpdateBlock;
import main.astraeus.game.model.entity.mobile.update.UpdateFlags.UpdateFlag;
import main.astraeus.net.packet.PacketWriter;

public class NpcDoubleHitUpdateBlock extends NpcUpdateBlock {

	public NpcDoubleHitUpdateBlock() {
		super(0x200, UpdateFlag.DOUBLE_HIT);
	}

	@Override
	public void encode(Npc entity, PacketWriter buffer) {
		
	}

}
