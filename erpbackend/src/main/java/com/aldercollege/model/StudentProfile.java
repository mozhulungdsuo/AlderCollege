package com.aldercollege.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table
public class StudentProfile {
	@Id
	@GeneratedValue(generator="stud_sequence", strategy= GenerationType.SEQUENCE)
	@SequenceGenerator(name="stud_sequence", sequenceName="stud_seq", initialValue=1, allocationSize=1)
	String id;
	String univRegNo;
	String firstName;
	String lastName;
	String middleName;
	String gender;
	@JsonFormat(shape=JsonFormat.Shape.STRING,pattern="dd-MM-yyyy")
	Date dateOfBirth;
	String identificationMark;
	String religion;
	String tribeOrCommunity;
	String fatherName;
	String motherName;
	String fatherOrMotherAddress;
	String fatherOrMotherPhoneNumber;
	String guardianName;
	String guardianAddress;
	String guardianPhoneNumber;
	String kohimaAddress;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUnivRegNo() {
		return univRegNo;
	}
	public void setUnivRegNo(String univRegNo) {
		this.univRegNo = univRegNo;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getIdentificationMark() {
		return identificationMark;
	}
	public void setIdentificationMark(String identificationMark) {
		this.identificationMark = identificationMark;
	}
	public String getReligion() {
		return religion;
	}
	public void setReligion(String religion) {
		this.religion = religion;
	}
	public String getTribeOrCommunity() {
		return tribeOrCommunity;
	}
	public void setTribeOrCommunity(String tribeOrCommunity) {
		this.tribeOrCommunity = tribeOrCommunity;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public String getFatherOrMotherAddress() {
		return fatherOrMotherAddress;
	}
	public void setFatherOrMotherAddress(String fatherOrMotherAddress) {
		this.fatherOrMotherAddress = fatherOrMotherAddress;
	}
	public String getFatherOrMotherPhoneNumber() {
		return fatherOrMotherPhoneNumber;
	}
	public void setFatherOrMotherPhoneNumber(String fatherOrMotherPhoneNumber) {
		this.fatherOrMotherPhoneNumber = fatherOrMotherPhoneNumber;
	}
	public String getGuardianName() {
		return guardianName;
	}
	public void setGuardianName(String guardianName) {
		this.guardianName = guardianName;
	}
	public String getGuardianAddress() {
		return guardianAddress;
	}
	public void setGuardianAddress(String guardianAddress) {
		this.guardianAddress = guardianAddress;
	}
	public String getGuardianPhoneNumber() {
		return guardianPhoneNumber;
	}
	public void setGuardianPhoneNumber(String guardianPhoneNumber) {
		this.guardianPhoneNumber = guardianPhoneNumber;
	}
	public String getKohimaAddress() {
		return kohimaAddress;
	}
	public void setKohimaAddress(String kohimaAddress) {
		this.kohimaAddress = kohimaAddress;
	}
	
	
	
	
}
