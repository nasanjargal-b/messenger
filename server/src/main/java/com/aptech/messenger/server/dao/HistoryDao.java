package com.aptech.messenger.server.dao;

import com.aptech.messenger.model.*;

import java.util.ArrayList;

/**
 * Нийт хэрэглэгчидийн харьцсан мэдээллийг хадгалах зориулалт бүхий
 * chat_history table-тэй харьцан зориулалт бүхий DataAccessObject юм.
 */
public class HistoryDao extends DaoSupport {

	/**
	 * ShowHistory модельд тодорхойлогдсон мэдээллийн дагуу баазаас шүүж
	 * TextChat модель үүсгэж илгээнэ. Хэрэв ямар нэгэн түүх олдоогүй бол
	 * хоосон List буцах ёстой. /Жич: Хоосон гэдэг нь null гэсэн үг биш/
     *
	 * @param showHistory
	 */
	public ArrayList<TextChat> find(ShowHistory showHistory) {
		// TODO - implement HistoryDao.find
		throw new UnsupportedOperationException();
	}

	/**
	 * Хоорондоо харьцсан text chat-ийн мэдээллийг өгөгдлийн баазруу нэмнэ.
     *
	 * @param textChat
	 */
	public void save(TextChat textChat) {
		// TODO - implement HistoryDao.save
		throw new UnsupportedOperationException();
	}

}