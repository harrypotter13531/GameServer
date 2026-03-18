/**
 * This file is part of openPanfu, a project that imitates the Flex remoting
 * and gameservers of Panfu.
 * thanks to Timotai the levelup function works he also has implemented rotation.
 * @author Altro50 <altro50@msn.com>
 */

package org.openpanfu.gameserver.handler;

import org.openpanfu.gameserver.PanfuPacket;
import org.openpanfu.gameserver.User;

public class CMD_JOIN_ROOM implements IHandler {

	@Override
	public void handlePacket(PanfuPacket packet, User sender) {
		int roomId = packet.readInt();
		int x = packet.readInt();
		int y = packet.readInt();
		int status = packet.readInt();
		int rot = packet.readInt();
		
		sender.setX(x);
		sender.setY(y);
		sender.setRot(rot);
		sender.joinRoom(roomId);
	}
}
