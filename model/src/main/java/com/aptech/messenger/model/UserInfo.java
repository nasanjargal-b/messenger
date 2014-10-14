package com.aptech.messenger.model;

/**
 * Нэвтэрсэн болон нэвтрээгүй хэрэглэгчийн мэдээллийг агуулж
 * хэрэглэгчрүү илгээгдэх модель.
 */
public class UserInfo implements Model {

	private String username;
	private String firstname;
	private String lastname;
	private byte[] image;
	private boolean online;

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public byte[] getImage() {
		return this.image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public boolean isOnline() {
		return this.online;
	}

	public void setOnline(boolean online) {
		this.online = online;
	}

}