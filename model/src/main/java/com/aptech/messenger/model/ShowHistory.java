package com.aptech.messenger.model;

/**
 * Хэрэглэгчтэй харилцсан түүхийг харуулхыг хүсэх зорилготой
 * серверлүү мэдээлэл дамжуулах модель
 */
public class ShowHistory implements Model {

	private String username;
	private String historyUsername;
	private long windowId;

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getHistoryUsername() {
		return this.historyUsername;
	}

	public void setHistoryUsername(String historyUsername) {
		this.historyUsername = historyUsername;
	}

	public long getWindowId() {
		return this.windowId;
	}

	public void setWindowId(long windowId) {
		this.windowId = windowId;
	}

}