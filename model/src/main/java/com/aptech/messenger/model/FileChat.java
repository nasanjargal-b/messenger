package com.aptech.messenger.model;

/**
 * Харилцаж буй хэрэглэгчдийн хооронд файл дамжуулхад
 * хэрэглэгдэх модель
 */
public class FileChat extends Chat {

	private byte[] file;
	private int byteSize;
	private long totalSize;

	public byte[] getFile() {
		return this.file;
	}

	public void setFile(byte[] file) {
		this.file = file;
	}

	public int getByteSize() {
		return this.byteSize;
	}

	public void setByteSize(int byteSize) {
		this.byteSize = byteSize;
	}

	public long getTotalSize() {
		return this.totalSize;
	}

	public void setTotalSize(long totalSize) {
		this.totalSize = totalSize;
	}

}