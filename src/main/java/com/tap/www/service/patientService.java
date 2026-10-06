package com.tap.www.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tap.www.Entity.patientEntity;
import com.tap.www.Repository.patientRepository;

@Service
public class patientService {
	
	@Autowired
	private patientRepository patientRepository;
	
	
	
	public patientEntity createPatient(patientEntity patientEntity) {
		return patientRepository.save(patientEntity);
	}
	
	public List<patientEntity> getAllData() {
		return patientRepository.findAll();
	}
	
	
	public patientEntity getPatientById(Long patientId) {
		return  patientRepository.findById(patientId).orElse(null);
	}
	
	
	public patientEntity updatePatient(Long patientId, patientEntity patientEntity) {
		
		patientEntity patientEntity1 = patientRepository.findById(patientId).orElse(null);
		
		if(patientEntity1 != null) {
			patientEntity1.setPatientId(patientEntity.getPatientId());
			patientEntity1.setName(patientEntity.getName());
			patientEntity1.setGender(patientEntity.getGender());
			patientEntity1.setAddress(patientEntity.getAddress());
			patientEntity1.setPhoneNumber(patientEntity.getPhoneNumber());
			patientEntity1.setBloodGroup(patientEntity.getBloodGroup());
		
			return patientRepository.save(patientEntity);
		}
		return  null;
	}
	
	
	public String deletePatient(Long patientId) {
		patientRepository.deleteById(patientId);
		return "deleted patient Successfull";
	}
	
	
	
}
