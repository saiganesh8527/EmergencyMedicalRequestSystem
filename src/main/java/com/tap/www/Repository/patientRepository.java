package com.tap.www.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tap.www.Entity.patientEntity;

public interface patientRepository extends JpaRepository<patientEntity,Long>{


}
