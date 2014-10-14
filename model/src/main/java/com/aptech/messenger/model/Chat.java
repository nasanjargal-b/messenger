package com.aptech.messenger.model;

/**
 * Нэг хэрэглэгчээс харьцаж буй хэрэглэгчрүү мэдээллийг дамжуулах зориулалт бүхий модель.
 */
public class Chat implements Model {

	/**
	 * Мэдээлэл хүлээн авах хэрэглэгчийн username
	 */
	private String to;
	/**
	 * Мэдээллийг явуулж буй хэрэглэгчийн username
	 */
	private String from;
	/**
	 * харьцаж буй цонхны дугаар. Тухайн хэрэглэгч цонх нээхэд
	 * тухайн компьютерийн огноог timestamp-ийн time мэдээллээр
	 * үүгэж хадгалана.
	 */
	private long windowId;

	public String getTo() {
		return this.to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getFrom() {
		return this.from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public long getWindowId() {
		return this.windowId;
	}

	public void setWindowId(long windowId) {
		this.windowId = windowId;
	}

}