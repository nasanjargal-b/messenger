package com.aptech.messenger.model;

/**
 * Хэрэглэгчийн username болон password-ийг агуулж сервэрлүү
 * илгээгдэх зориулалт бүхий модель юм. Үүний үр дүнд тухайн
 * хэрэглэгчийн нэвтэрч чадсан эсэхийг илэрхийлэх AuthResult
 * гэсэн модель ирэх ёстой.
 */
public class AuthDetails implements Model {

	private String username;
	private String password;

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

}