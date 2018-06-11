package com.aldercollege.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class BAStudentSubjectCombination {
   String id;
   String honoursSubject;
   boolean sociology;
   boolean politicalScience;
   boolean history;
   boolean education;
   boolean english;
   boolean economics;
   boolean tenyidie;
  
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getHonoursSubject() {
	return honoursSubject;
}
public void setHonoursSubject(String honoursSubject) {
	this.honoursSubject = honoursSubject;
}
public boolean isSociology() {
	return sociology;
}
public void setSociology(boolean sociology) {
	this.sociology = sociology;
}
public boolean isPoliticalScience() {
	return politicalScience;
}
public void setPoliticalScience(boolean politicalScience) {
	this.politicalScience = politicalScience;
}
public boolean isHistory() {
	return history;
}
public void setHistory(boolean history) {
	this.history = history;
}
public boolean isEducation() {
	return education;
}
public void setEducation(boolean education) {
	this.education = education;
}
public boolean isEnglish() {
	return english;
}
public void setEnglish(boolean english) {
	this.english = english;
}
public boolean isEconomics() {
	return economics;
}
public void setEconomics(boolean economics) {
	this.economics = economics;
}
public boolean isTenyidie() {
	return tenyidie;
}
public void setTenyidie(boolean tenyidie) {
	this.tenyidie = tenyidie;
}

}
