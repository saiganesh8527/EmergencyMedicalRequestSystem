package com.tap.www.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tap.www.Entity.emergencyRequestEntity;

public interface emergencyRepository extends JpaRepository<emergencyRequestEntity,Long> {
	
	
}
