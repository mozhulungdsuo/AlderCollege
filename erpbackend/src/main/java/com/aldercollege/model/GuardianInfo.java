package com.aldercollege.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class GuardianInfo {
	@Id
	String id;
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
