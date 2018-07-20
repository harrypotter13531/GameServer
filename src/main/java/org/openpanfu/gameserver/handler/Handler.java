/**
 * This file is part of openPanfu, a project that imitates the Flex remoting
 * and gameservers of Panfu.
 *
 * @author Altro50 <altro50@msn.com>
 */

package org.openpanfu.gameserver.handler;

import org.openpanfu.gameserver.constants.Packets;
import org.openpanfu.gameserver.util.Logger;

import java.util.HashMap;

public class Handler
{
    public static HashMap<Integer, IHandler> handlers = new HashMap<Integer, IHandler>();

    public static void Initialize()
    {
        Logger.info("Initializing Handlers...");
        handlers.put(Packets.CMD_LOGIN, new CMD_LOGIN());
        handlers.put(Packets.CMD_GET_SALT, new CMD_GET_SALT());
        handlers.put(Packets.CMD_GET_ROOM_ATTENDEES, new CMD_GET_ROOM_ATTENDEES());
        handlers.put(Packets.CMD_GET_PLAYER_IDS_BY_CLOTHES, new CMD_GET_PLAYER_IDS_BY_CLOTHES());
        handlers.put(Packets.CMD_PLAYER_TO_PLAYER, new CMD_PLAYER_TO_PLAYER());
        handlers.put(Packets.CMD_MOVE, new CMD_MOVE());
        handlers.put(140, new CMD_QUERY_SHARED_ITEMS());
        Logger.info("Registered " + handlers.size() + " Packet handlers.");
    }
}