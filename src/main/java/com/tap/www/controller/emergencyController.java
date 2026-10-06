package com.tap.www.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tap.www.Entity.emergencyRequestEntity;
import com.tap.www.service.emergencyService;

@RestController
public class emergencyController {
	
	
	
	@Autowired
	private emergencyService emergencyService;

	
	
	
	@PostMapping("/api/emergency")
	public ResponseEntity<emergencyRequestEntity> createEmergency(@RequestParam Long patientId, @RequestParam Long hosipitalId,  @RequestBody emergencyRequestEntity emergencyEntity1){
		emergencyRequestEntity emergencyEntity = emergencyService.createEmergency(patientId,hosipitalId,emergencyEntity1);
		
        return new ResponseEntity<>(emergencyEntity,HttpStatus.OK);
	}
	
	
	@GetMapping("/api/emergency")
	public ResponseEntity <List<emergencyRequestEntity>> toGetById(){
		return new ResponseEntity(emergencyService.getAllEmergency(),HttpStatus.OK);
	}
	
	@GetMapping("/api/emergency/{id}")
	public ResponseEntity<emergencyRequestEntity> toGetAllData(@PathVariable Long emergencyId){
		emergencyRequestEntity emergencyEntity = emergencyService.getEmergencyById(emergencyId);
		if(emergencyEntity != null) {
			return new ResponseEntity<>(emergencyEntity,HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(emergencyEntity,HttpStatus.NOT_FOUND);
		}
	}
	
	@PutMapping("/api/emergency/{id}")
	public ResponseEntity<emergencyRequestEntity> updateEmergency(@PathVariable Long emergencyId, @RequestBody emergencyRequestEntity emergencyEntity1){
		emergencyRequestEntity emergencyEntity = emergencyService.updateEmergency(emergencyId,emergencyEntity1);
		if(emergencyEntity != null) {
			return new ResponseEntity<>(emergencyEntity,HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	
	@DeleteMapping("/api/emergency/{id}")
	public ResponseEntity<String> DeleteEmergency(@PathVariable Long emergencyId){
		String emergencyEntity = emergencyService.DeleteEmergency(emergencyId);
		return new ResponseEntity<>(emergencyEntity,HttpStatus.OK);
	}
	
	
}
