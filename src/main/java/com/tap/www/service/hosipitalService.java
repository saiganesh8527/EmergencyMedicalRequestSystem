package com.tap.www.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tap.www.Entity.hosipitalEntity;
import com.tap.www.Repository.hosipitalRepository;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Service
public class hosipitalService {
	@Autowired
	private hosipitalRepository hosipitalRepository;
	
	public hosipitalEntity createhosipital(hosipitalEntity hosipitalEntity) {
		return hosipitalRepository.save(hosipitalEntity);
	}
	
	public List<hosipitalEntity> togetAllData(){
		return hosipitalRepository.findAll();
	}
	
	public hosipitalEntity toGetById(Long hosipitalId) {
		return hosipitalRepository.findById(hosipitalId).orElse(null);
	}
	
	

	
	public hosipitalEntity updateHosipital(Long hosipitalId, hosipitalEntity hosipitalEntity1) {
		hosipitalEntity hosipitalEntity = hosipitalRepository.findById(hosipitalId).orElse(null);
		if(hosipitalEntity != null) {
			hosipitalEntity.setHospitalId(hosipitalEntity1.getHospitalId());
			hosipitalEntity.setHospitalName(hosipitalEntity1.getHospitalName());
			hosipitalEntity.setHospitalAddress(hosipitalEntity1.getHospitalAddress());
			hosipitalEntity.setHospitalPhone(hosipitalEntity1.getHospitalPhone());
			hosipitalEntity.setDoctorName(hosipitalEntity1.getDoctorName());
			hosipitalEntity.setDoctorSpecialization(hosipitalEntity1.getDoctorSpecialization());
			hosipitalEntity.setDoctorAvailability(hosipitalEntity1.getDoctorAvailability());
			hosipitalEntity.setAmbulenceNumber(hosipitalEntity1.getAmbulenceNumber());
			hosipitalEntity.setDriverName(hosipitalEntity1.getDriverName());
			hosipitalEntity.setDriverPhone(hosipitalEntity1.getDriverPhone());
			hosipitalEntity.setAmbulenceAvailability(hosipitalEntity1.getAmbulenceAvailability());
			
			return hosipitalRepository.save(hosipitalEntity1);
		}
		return null;
	}
	
	
	public String deleteHosipital(Long hosipitalId) {
		hosipitalRepository.deleteById(hosipitalId);
		return "Deleted Hosipital";
	}
	

}
