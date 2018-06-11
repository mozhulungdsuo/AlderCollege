package com.aldercollege.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class AddOnCourses {
	@Id
String id;
boolean baking;
boolean music;
boolean violin;
boolean computer;
String lastEditor;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public boolean isBaking() {
	return baking;
}
public void setBaking(boolean baking) {
	this.baking = baking;
}
public boolean isMusic() {
	return music;
}
public void setMusic(boolean music) {
	this.music = music;
}
public boolean isViolin() {
	return violin;
}
public void setViolin(boolean violin) {
	this.violin = violin;
}
public boolean isComputer() {
	return computer;
}
public void setComputer(boolean computer) {
	this.computer = computer;
}
public String getLastEditor() {
	return lastEditor;
}
public void setLastEditor(String lastEditor) {
	this.lastEditor = lastEditor;
}

}
