package com.aptech.messenger.model;

/**
 * Групын хэрэглэгчид текстен мэдээллэл дамжуулхад хэрэглэгдэх
 * модель
 */
public class GroupChat implements Model {

	private String groupId;
	private String from;
	private String text;

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getFrom() {
		return this.from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}

}