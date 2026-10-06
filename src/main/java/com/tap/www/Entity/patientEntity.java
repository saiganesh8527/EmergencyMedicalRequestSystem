package com.tap.www.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class patientEntity {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long patientId;
	private String name;
	private int age;
	private String gender;
	private Long phoneNumber;
	private String address;
	private String BloodGroup;
	public patientEntity(Long patientId, String name, int age, String gender, Long phoneNumber, String address,
			String BloodGroup) {
		super();
		this.patientId = patientId;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.BloodGroup = BloodGroup;
	}
	public patientEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getPatientId() {
		return patientId;
	}
	public void setPatientId(Long patientId) {
		this.patientId = patientId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBloodGroup() {
		return BloodGroup;
	}
	public void setBloodGroup(String BloodGroup) {
		this.BloodGroup = BloodGroup;
	}
	@Override
	public String toString() {
		return "patientEntity [patientId=" + patientId + ", name=" + name + ", age=" + age + ", gender=" + gender
				+ ", phoneNumber=" + phoneNumber + ", address=" + address + ", BloodGroup=" + BloodGroup + "]";
	}

	
	
	
	
}
