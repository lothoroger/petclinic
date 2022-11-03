package com.example.petclinic.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.petclinic.model.Patients;

public interface PatientRepository extends CrudRepository<Patients, Integer> {
	

}
