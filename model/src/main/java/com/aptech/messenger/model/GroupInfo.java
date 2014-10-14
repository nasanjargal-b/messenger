package com.aptech.messenger.model;

import java.util.ArrayList;

/**
 * Груп үүсгэх болон хэрэглэгч шинээр нэмэх эсвэл хасах үеийн
 * мэдээллийг дамжуулах модель
 */
public class GroupInfo implements Model {

	private String groupId;
	private ArrayList<UserInfo> userList;

}