package com.tap.www.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class hosipitalEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long hospitalId;
	private String hospitalName;
	private String hospitalAddress;
	private Long hospitalPhone;
	private String doctorName;
	private String doctorSpecialization;
	private String doctorAvailability;
	private Long ambulenceNumber;
	private String driverName;
	private Long driverPhone;
	private String ambulenceAvailability;
	
	
	
	public hosipitalEntity(Long hospitalId, String hospitalName, String hospitalAddress, Long hospitalPhone,
			String doctorName, String doctorSpecialization, String doctorAvailability, Long ambulenceNumber,
			String driverName, Long driverPhone, String ambulenceAvailability) {
		super();
		this.hospitalId = hospitalId;
		this.hospitalName = hospitalName;
		this.hospitalAddress = hospitalAddress;
		this.hospitalPhone = hospitalPhone;
		this.doctorName = doctorName;
		this.doctorSpecialization = doctorSpecialization;
		this.doctorAvailability = doctorAvailability;
		this.ambulenceNumber = ambulenceNumber;
		this.driverName = driverName;
		this.driverPhone = driverPhone;
		this.ambulenceAvailability = ambulenceAvailability;
	}



	public hosipitalEntity() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Long getHospitalId() {
		return hospitalId;
	}



	public void setHospitalId(Long hospitalId) {
		this.hospitalId = hospitalId;
	}



	public String getHospitalName() {
		return hospitalName;
	}



	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}



	public String getHospitalAddress() {
		return hospitalAddress;
	}



	public void setHospitalAddress(String hospitalAddress) {
		this.hospitalAddress = hospitalAddress;
	}



	public Long getHospitalPhone() {
		return hospitalPhone;
	}



	public void setHospitalPhone(Long hospitalPhone) {
		this.hospitalPhone = hospitalPhone;
	}



	public String getDoctorName() {
		return doctorName;
	}



	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}



	public String getDoctorSpecialization() {
		return doctorSpecialization;
	}



	public void setDoctorSpecialization(String doctorSpecialization) {
		this.doctorSpecialization = doctorSpecialization;
	}



	public String getDoctorAvailability() {
		return doctorAvailability;
	}



	public void setDoctorAvailability(String doctorAvailability) {
		this.doctorAvailability = doctorAvailability;
	}



	public Long getAmbulenceNumber() {
		return ambulenceNumber;
	}



	public void setAmbulenceNumber(Long ambulenceNumber) {
		this.ambulenceNumber = ambulenceNumber;
	}



	public String getDriverName() {
		return driverName;
	}



	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}



	public Long getDriverPhone() {
		return driverPhone;
	}



	public void setDriverPhone(Long driverPhone) {
		this.driverPhone = driverPhone;
	}



	public String getAmbulenceAvailability() {
		return ambulenceAvailability;
	}



	public void setAmbulenceAvailability(String ambulenceAvailability) {
		this.ambulenceAvailability = ambulenceAvailability;
	}



	@Override
	public String toString() {
		return "hosipitalEntity [hospitalId=" + hospitalId + ", hospitalName=" + hospitalName + ", hospitalAddress="
				+ hospitalAddress + ", hospitalPhone=" + hospitalPhone + ", doctorName=" + doctorName
				+ ", doctorSpecialization=" + doctorSpecialization + ", doctorAvailability=" + doctorAvailability
				+ ", ambulenceNumber=" + ambulenceNumber + ", driverName=" + driverName + ", driverPhone=" + driverPhone
				+ ", ambulenceAvailability=" + ambulenceAvailability + "]";
	}
	
	
	
	
	
	

}
