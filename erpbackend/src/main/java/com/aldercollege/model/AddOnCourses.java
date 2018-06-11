package com.aldercollege.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class AddOnCourses {
String id;
boolean baking;
boolean music;
boolean violin;
boolean computer;
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

}
