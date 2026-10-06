package com.tap.www.Entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


//@Setter
//@Getter
//@NoArgsConstructor
//@AllArgsConstructor
@Entity
public class emergencyRequestEntity {
	
	
	@ManyToOne
	@JoinColumn(name = "patient_id")
	private patientEntity patientEntity;
	
	@ManyToOne
	@JoinColumn(name = "hosipitalId_id")
	private hosipitalEntity hosipitalEntity;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long emergencyId;
	private String emergencyType;
	private String emergencyLocation;
	private LocalDateTime emergencyTime;
	private String emergencyStatus;
	
	
	
	
	public emergencyRequestEntity(com.tap.www.Entity.patientEntity patientEntity,
			com.tap.www.Entity.hosipitalEntity hosipitalEntity, Long emergencyId, String emergencyType,
			String emergencyLocation, LocalDateTime emergencyTime, String emergencyStatus) {
		super();
		this.patientEntity = patientEntity;
		this.hosipitalEntity = hosipitalEntity;
		this.emergencyId = emergencyId;
		this.emergencyType = emergencyType;
		this.emergencyLocation = emergencyLocation;
		this.emergencyTime = emergencyTime;
		this.emergencyStatus = emergencyStatus;
	}




	public emergencyRequestEntity() {
		super();
		// TODO Auto-generated constructor stub
	}




	public patientEntity getPatientEntity() {
		return patientEntity;
	}




	public void setPatientEntity(patientEntity patientEntity) {
		this.patientEntity = patientEntity;
	}




	public hosipitalEntity getHosipitalEntity() {
		return hosipitalEntity;
	}




	public void setHosipitalEntity(hosipitalEntity hosipitalEntity) {
		this.hosipitalEntity = hosipitalEntity;
	}




	public Long getEmergencyId() {
		return emergencyId;
	}




	public void setEmergencyId(Long emergencyId) {
		this.emergencyId = emergencyId;
	}




	public String getEmergencyType() {
		return emergencyType;
	}




	public void setEmergencyType(String emergencyType) {
		this.emergencyType = emergencyType;
	}




	public String getEmergencyLocation() {
		return emergencyLocation;
	}




	public void setEmergencyLocation(String emergencyLocation) {
		this.emergencyLocation = emergencyLocation;
	}




	public LocalDateTime getEmergencyTime() {
		return emergencyTime;
	}




	public void setEmergencyTime(LocalDateTime emergencyTime) {
		this.emergencyTime = emergencyTime;
	}




	public String getEmergencyStatus() {
		return emergencyStatus;
	}




	public void setEmergencyStatus(String emergencyStatus) {
		this.emergencyStatus = emergencyStatus;
	}




	@Override
	public String toString() {
		return "emergencyRequest [emergencyId=" + emergencyId + ", emergencyType=" + emergencyType + ", emergencyLocation="
				+ emergencyLocation + ", emergencyTime=" + emergencyTime + ", emergencyStatus=" + emergencyStatus + "]";
	}
	
	
	
	
	
	
	
	
}
