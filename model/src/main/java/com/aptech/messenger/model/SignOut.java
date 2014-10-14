package com.aptech.messenger.model;

/**
 * Хэрэглэгч сервертэй хийсэн холболтыг салгахад хэрэглэгдэх
 * модель.
 */
public class SignOut implements Model {

	private String username;

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}