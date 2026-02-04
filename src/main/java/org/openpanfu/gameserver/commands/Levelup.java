package org.openpanfu.gameserver.commands;

import org.openpanfu.gameserver.PanfuPacket;
import org.openpanfu.gameserver.User;
import org.openpanfu.gameserver.constants.Packets;

public class Levelup implements ICommand {

    @Override
    public void onExecution(User invoker, String[] parameters) {

        // 🔒 Admin-only check (Sheriff)
        if (invoker.getSheriff() == 0) {
            invoker.sendAlert("❌ You do not have permission to use this command.");
            return;
        }

        // 📦 Send LEVELBOOST action
        PanfuPacket packet = new PanfuPacket(Packets.CMD_PLAYER_TO_PLAYER);
        packet.writeInt(invoker.getUserId());

        // 📡 Broadcast to room
        invoker.sendRoom(packet);
    }

    @Override
    public String getDescription() {
        return "!levelup - (Sheriff only) Triggers the level up animation.";
    }
}
