package com.aptech.messenger.model;

/**
 * Хэрэглэгч өөрийн нууц үгийг солиход уг моделийг ашиглана.
 * Хэрэглэгчийн хуучин нууц үг болон шинэ нууц үгийг агуулж
 * серверлүү илгээнэ.
 */
public class ChangePasswordInfo implements Model {

	private String username;
	private String oldPassword;
	private String newPassword;

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getOldPassword() {
		return this.oldPassword;
	}

	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}

	public String getNewPassword() {
		return this.newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

}