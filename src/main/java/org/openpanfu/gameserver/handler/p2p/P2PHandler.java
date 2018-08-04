package org.openpanfu.gameserver.handler.p2p;

import org.openpanfu.gameserver.constants.PlayerToPlayerCommands;
import org.openpanfu.gameserver.util.Logger;

import java.util.HashMap;

public class P2PHandler {
    public static HashMap<Integer, IP2PHandler> handlers = new HashMap<Integer, IP2PHandler>();

    public static void initialize()
    {
        Logger.info("Initializing P2P Handlers...");
        handlers.put(PlayerToPlayerCommands.CMD_CREATE_AVATAR, new CMD_CREATE_AVATAR());
        handlers.put(PlayerToPlayerCommands.CMD_UPDATE_AVATAR, new CMD_UPDATE_AVATAR());
        handlers.put(PlayerToPlayerCommands.CMD_SHOW_STATUS, new CMD_SHOW_STATUS());
        handlers.put(PlayerToPlayerCommands.CMD_HIDE_STATUS, new CMD_HIDE_STATUS());
        Logger.info("Registered " + handlers.size() + " Packet handlers.");
    }
}
