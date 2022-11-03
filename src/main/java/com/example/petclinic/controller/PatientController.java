package com.example.petclinic.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.petclinic.model.Patients;
import com.example.petclinic.model.Response;
import com.example.petclinic.repository.PatientRepository;

@RestController
@RequestMapping("/app")
public class PatientController {

	@Autowired
	PatientRepository patientrepo;
	
	@PostMapping("/add")
	public <patientrepo> Response addPatients(@RequestParam(required=false) String name, @RequestParam(required=false) String phone, @RequestParam(required=false) String email, @RequestParam(required=false) String petkind) {
		
		Patients patient = new Patients(null, name, phone, email, petkind);
		patientrepo.save(patient);
		
		Response response = new Response(101, name+" added Successfully on "+new Date(), null);
		return response;
		
	}
	
	@GetMapping("/List")
	public Response listPatients() {
	
	List<Patients> patientList = new ArrayList<Patients>();
	patientrepo.findAll().forEach((customer)->patientList.add(customer));
	
	Response response = new Response(101, "A total of "+patientList.size()+" customers fetched at "+ new Date(), patientList);
	return response;
	
}
}
