package com.aptech.messenger.model;

/**
 * Нэвтэрсэн хэрэглэгчийн мэдээллийг серверээс илгээх
 * зориулалт бүхий модель юм. Уг моделийн мэдээллийг
 * хэрэглэгчийн жагсаалтын цонхонд харуулана.
 */
public class OwnInfo implements Model {

	private String username;
	private String firstname;
	private String lastname;
	private byte[] image;

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

}