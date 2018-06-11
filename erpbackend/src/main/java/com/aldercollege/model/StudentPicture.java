package com.aldercollege.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
@Entity
public class StudentPicture {
	@Id
	String id;
	
	@Lob
	private byte[]image;
	String lastEditor;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public String getLastEditor() {
		return lastEditor;
	}

	public void setLastEditor(String lastEditor) {
		this.lastEditor = lastEditor;
	}
}
