package com.aptech.messenger.model;

import java.util.Date;

/**
 * Хэрэглэгч шинээр өөрийгөө бүртгүүлэхэд бөгөлсөн мэдээллийг
 * агуулаж серверлүү илгээхэд хэрэглэх модель
 */
public class RegisterInfo implements Model {

	private String username;
	private String password;
	private String firstname;
	private String lastname;
	private Boolean gender;
	private Date dob;
	private String phone;
	private String address;
	private byte[] image;

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public Boolean getGender() {
		return this.gender;
	}

	public void setGender(Boolean gender) {
		this.gender = gender;
	}

	public Date getDob() {
		return this.dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public byte[] getImage() {
		return this.image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

}