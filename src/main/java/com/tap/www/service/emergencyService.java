package com.tap.www.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.tap.www.Entity.emergencyRequestEntity;
import com.tap.www.Entity.hosipitalEntity;
import com.tap.www.Entity.patientEntity;
import com.tap.www.Repository.emergencyRepository;
import com.tap.www.Repository.hosipitalRepository;
import com.tap.www.Repository.patientRepository;

@RestController
public class emergencyService {
	
    @Autowired
    private emergencyRepository emergencyRepository;

    @Autowired
    private patientRepository patientRepository;

    @Autowired
    private hosipitalRepository hospitalRepository;
    
    
    
    // CREATE EMERGENCY

    public emergencyRequestEntity createEmergency( Long patientId,Long hosipitalID, emergencyRequestEntity emergencyEntity) {

        patientEntity patientEntity = patientRepository.findById(patientId).orElse(null);
                

        hosipitalEntity hosipitalEntity = hospitalRepository.findById(hosipitalID).orElse(null);

        emergencyEntity.setPatientEntity(patientEntity);
        emergencyEntity.setHosipitalEntity(hosipitalEntity);

        return emergencyRepository.save(emergencyEntity);
    }
    
    
    //GetAllEmergency
    
    public List<emergencyRequestEntity> getAllEmergency() {
    	return emergencyRepository.findAll();
    }
    
    
    //GetByIdEmergency
    
    public emergencyRequestEntity getEmergencyById(Long emergencyId) {
    	emergencyRequestEntity emergencyRequest = emergencyRepository.findById(emergencyId).orElse(null);
    	return emergencyRequest;
    }
    
    
 
    //updateEmergency
    
    public emergencyRequestEntity updateEmergency(Long emergencyId , emergencyRequestEntity emergencyRequestEntity) {
    	emergencyRequestEntity emergencyEntity = emergencyRepository.findById(emergencyId).orElse(null);
    	
    	if(emergencyEntity != null) {
    		emergencyEntity.setEmergencyId(emergencyRequestEntity.getEmergencyId());
    		emergencyEntity.setEmergencyType(emergencyRequestEntity.getEmergencyType());
    		emergencyEntity.setEmergencyLocation(emergencyRequestEntity.getEmergencyLocation());
    		emergencyEntity.setEmergencyTime(emergencyRequestEntity.getEmergencyTime());
    		emergencyEntity.setEmergencyStatus(emergencyRequestEntity.getEmergencyStatus());
    		return emergencyRepository.save(emergencyEntity);
    	}
    	return null;
    }
    
    
    //deleteEmergency
    
    public String DeleteEmergency(Long emergencyId) {
    emergencyRepository.deleteById(emergencyId);
    return "Delete the emergency";
    }
    
    
   
	

}
