package com.aptech.messenger.model;

import java.util.Date;

/**
 * Харьлцаж буй хэрэглэгчидийн хооронд текстэн мэдээллэл
 * дамжуулах зориулалт бүхий модель
 */
public class TextChat extends Chat {

	private String text;
	private Date date;
	private boolean history;

	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public boolean isHistory() {
		return this.history;
	}

	public void setHistory(boolean history) {
		this.history = history;
	}

}