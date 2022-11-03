package com.example.petclinic.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Patients {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Integer pId;
	String name;
	String phone;
	String email;
	String petkind;
	
	public Patients() {
		
	}

	public Patients(Integer pId, String name, String phone, String email, String petkind) {
		super();
		this.pId = pId;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.petkind = petkind;
	}

	public Integer getpId() {
		return pId;
	}

	public void setpId(Integer pId) {
		this.pId = pId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPetkind() {
		return petkind;
	}

	public void setPetkind(String petkind) {
		this.petkind = petkind;
	}
}
