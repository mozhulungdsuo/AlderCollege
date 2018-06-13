package com.aldercollege.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class StudentPreviousHistory {
	@Id
	String id;
	String previousSChoolCollege;
	String lastExam;
	String rollNumber;
	String boardUniversity;
	String divison;
	String subject1;
	String subject2;
	String subject3;
	String subject4;
	String subject5;
	String subject6;
	String subject7;
	String subject8;
	float subject1Marks;
	float subject2Marks;
	float subject3Marks;
	float subject4Marks;
	float subject5Marks;
	float subject6Marks;
	float subject7Marks;
	float subject8Marks;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPreviousSChoolCollege() {
		return previousSChoolCollege;
	}
	public void setPreviousSChoolCollege(String previousSChoolCollege) {
		this.previousSChoolCollege = previousSChoolCollege;
	}
	public String getLastExam() {
		return lastExam;
	}
	public void setLastExam(String lastExam) {
		this.lastExam = lastExam;
	}
	public String getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getBoardUniversity() {
		return boardUniversity;
	}
	public void setBoardUniversity(String boardUniversity) {
		this.boardUniversity = boardUniversity;
	}
	public String getDivison() {
		return divison;
	}
	public void setDivison(String divison) {
		this.divison = divison;
	}
	public String getSubject1() {
		return subject1;
	}
	public void setSubject1(String subject1) {
		this.subject1 = subject1;
	}
	public String getSubject2() {
		return subject2;
	}
	public void setSubject2(String subject2) {
		this.subject2 = subject2;
	}
	public String getSubject3() {
		return subject3;
	}
	public void setSubject3(String subject3) {
		this.subject3 = subject3;
	}
	public String getSubject4() {
		return subject4;
	}
	public void setSubject4(String subject4) {
		this.subject4 = subject4;
	}
	public String getSubject5() {
		return subject5;
	}
	public void setSubject5(String subject5) {
		this.subject5 = subject5;
	}
	public String getSubject6() {
		return subject6;
	}
	public void setSubject6(String subject6) {
		this.subject6 = subject6;
	}
	public String getSubject7() {
		return subject7;
	}
	public void setSubject7(String subject7) {
		this.subject7 = subject7;
	}
	public String getSubject8() {
		return subject8;
	}
	public void setSubject8(String subject8) {
		this.subject8 = subject8;
	}
	public float getSubject1Marks() {
		return subject1Marks;
	}
	public void setSubject1Marks(float subject1Marks) {
		this.subject1Marks = subject1Marks;
	}
	public float getSubject2Marks() {
		return subject2Marks;
	}
	public void setSubject2Marks(float subject2Marks) {
		this.subject2Marks = subject2Marks;
	}
	public float getSubject3Marks() {
		return subject3Marks;
	}
	public void setSubject3Marks(float subject3Marks) {
		this.subject3Marks = subject3Marks;
	}
	public float getSubject4Marks() {
		return subject4Marks;
	}
	public void setSubject4Marks(float subject4Marks) {
		this.subject4Marks = subject4Marks;
	}
	public float getSubject5Marks() {
		return subject5Marks;
	}
	public void setSubject5Marks(float subject5Marks) {
		this.subject5Marks = subject5Marks;
	}
	public float getSubject6Marks() {
		return subject6Marks;
	}
	public void setSubject6Marks(float subject6Marks) {
		this.subject6Marks = subject6Marks;
	}
	public float getSubject7Marks() {
		return subject7Marks;
	}
	public void setSubject7Marks(float subject7Marks) {
		this.subject7Marks = subject7Marks;
	}
	public float getSubject8Marks() {
		return subject8Marks;
	}
	public void setSubject8Marks(float subject8Marks) {
		this.subject8Marks = subject8Marks;
	}
	

}
