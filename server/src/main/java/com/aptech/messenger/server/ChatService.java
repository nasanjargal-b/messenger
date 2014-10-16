package com.aptech.messenger.server;

import com.aptech.messenger.model.*;
import com.aptech.messenger.server.exception.*;
import com.aptech.messenger.server.dao.*;

import java.util.ArrayList;

/**
 * Хэрэглэгчидын хооронд чатын мэдээллийг удирдаж класс
 */
public class ChatService {

	/**
	 * Тухайн хэрэглэгчид ирсэн чатын моделийг хүлээн авч харгалзах
	 * хэрэглэгчрүү илгээнэ.
	 * @param chatModel
	 */
	public void receive(Chat chatModel) {
		// TODO - implement ChatService.receive
		throw new UnsupportedOperationException();
	}

	/**
	 * Явуулах хэрэглэгчийн username-ийн дагуу ServerClientSocket.ONLINE_USERS-ээс
	 * явуулах хэрэглэгчийн ServerClientSocket-ийг гаргаж өгнө.
	 * Хэрэв тухайн хэрэглэгч онлайн хэрэглэгч биш бол OnlineUserNotFoundException үүсгэнэ.
	 * @param username
	 */
	private ServerClientSocket findUser(String username) throws OnlineUserNotFoundException {
		// TODO - implement ChatService.findUser
		throw new UnsupportedOperationException();
	}

	/**
	 * Харьцаж буй хэрэглэгчтэй харьцсан түүхийг харуулан хүсэлт болох
	 * ShowHistory model-ийг хүлээн авч боловсруулан түүхийг буцаан
	 * илгээнэ.
	 * @param showHistory
	 */
	public ArrayList<TextChat> getHistory(ShowHistory showHistory) {
		// TODO - implement ChatService.getHistory
		throw new UnsupportedOperationException();
	}

	HistoryDao historyDao;

}