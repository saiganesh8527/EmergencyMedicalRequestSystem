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
import org.springframework.web.bind.annotation.RestController;

import com.tap.www.Entity.patientEntity;
import com.tap.www.service.patientService;

@RestController
public class patientController {
	
	@Autowired
	private patientService patientService;
	
	
	@PostMapping("/api/patient")
	public ResponseEntity<patientEntity> createdPatient(@RequestBody patientEntity patientEntity){
		return new ResponseEntity<> (patientService.createPatient(patientEntity),HttpStatus.CREATED);
	}
	
	@GetMapping("/api/patient")
	public ResponseEntity<List<patientEntity>> getAllData(){
		return new ResponseEntity<>(patientService.getAllData(),HttpStatus.OK);
	}
	
	@GetMapping("/api/patient/{id}")
	public ResponseEntity<patientEntity> getDataById(@PathVariable("id") Long PatientId,patientEntity patientEntity){
		patientEntity patientEntity1 = patientService.getPatientById(PatientId);
		
		if(patientEntity1 != null) {
			return new ResponseEntity<>(patientEntity,HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
	}
	
	@PutMapping("/api/patient/{id}")
	public ResponseEntity<patientEntity> updateEntity(@PathVariable("id") Long patientId, @RequestBody patientEntity patientEntity){
		patientEntity patientEntity1 = patientService. updatePatient(patientId,patientEntity);
		
		if(patientEntity1 != null) {
			return new ResponseEntity<>(patientEntity1,HttpStatus.CREATED);
		}
		else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/api/patient/{id}")
	public ResponseEntity<String> deleteEntity(@PathVariable("id") Long patientId){
		String patientEntity = patientService.deletePatient(patientId);
		return new ResponseEntity<>(patientEntity,HttpStatus.OK);
	}
	

}
