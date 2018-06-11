package com.aldercollege.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class HSElectiveSubjects {
@Id
String id;
boolean environmentalStudies;
boolean lifeSkills;
boolean alternativeEnglish;
boolean tenyidie;
String lastEditor;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public boolean isEnvironmentalStudies() {
	return environmentalStudies;
}
public void setEnvironmentalStudies(boolean environmentalStudies) {
	this.environmentalStudies = environmentalStudies;
}
public boolean isLifeSkills() {
	return lifeSkills;
}
public void setLifeSkills(boolean lifeSkills) {
	this.lifeSkills = lifeSkills;
}
public boolean isAlternativeEnglish() {
	return alternativeEnglish;
}
public void setAlternativeEnglish(boolean alternativeEnglish) {
	this.alternativeEnglish = alternativeEnglish;
}
public boolean isTenyidie() {
	return tenyidie;
}
public void setTenyidie(boolean tenyidie) {
	this.tenyidie = tenyidie;
}
public String getLastEditor() {
	return lastEditor;
}
public void setLastEditor(String lastEditor) {
	this.lastEditor = lastEditor;
}
}
