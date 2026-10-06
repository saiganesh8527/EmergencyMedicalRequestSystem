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

import com.tap.www.Entity.hosipitalEntity;
import com.tap.www.service.hosipitalService;

@RestController
public class hosipitalController {
	
	@Autowired
	private hosipitalService hosipitalService;
	
	
	
	@PostMapping("/api/hosipital")
	public ResponseEntity<hosipitalEntity> createHosipital(@RequestBody hosipitalEntity hosipitalEntity){
		return new ResponseEntity<>( hosipitalService.createhosipital(hosipitalEntity),HttpStatus.CREATED);
	}
	
	@GetMapping("/api/hosipital")
	public ResponseEntity<List<hosipitalEntity>> toGetData(){
		return new ResponseEntity<>(hosipitalService.togetAllData(),HttpStatus.OK);
	}
	
	
	@GetMapping("/api/hosipital/{id}")
	public ResponseEntity<hosipitalEntity> toGetDataById(@PathVariable Long hosipitalId){
		hosipitalEntity hosipitalEntity = hosipitalService.toGetById(hosipitalId);
		if(hosipitalEntity != null) {
			return new ResponseEntity<>(hosipitalEntity,HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	
	@PutMapping("/api/hosipital/{id}")
	public ResponseEntity<hosipitalEntity>  updateHosipital(@PathVariable("id") Long hosipitalId ,@RequestBody hosipitalEntity hosipitalEntity )
	{
		hosipitalEntity hosipitalEntity1 = hosipitalService.updateHosipital(hosipitalId, hosipitalEntity);
		
		if(hosipitalEntity1 != null) {
			return new ResponseEntity<>(hosipitalEntity1,HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
	}
	
	
	@DeleteMapping("/api/hosipital/{id}")
	public ResponseEntity<String> DeleteBYId(@PathVariable("id") Long hosipitalId){
		String hosipitalEntity = hosipitalService.deleteHosipital(hosipitalId);
		return new ResponseEntity<>(hosipitalEntity,HttpStatus.OK);
		
	}
	
	
	
	
	

}
