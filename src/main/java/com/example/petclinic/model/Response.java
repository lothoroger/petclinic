package com.example.petclinic.model;

import java.util.List;

public class Response {

	Integer code;
	String message;
	List<Patients>  petList;
	
	public Response() {
		
	}
	
	
	

	public Response(Integer code, String message, List<Patients> petList) {
		super();
		this.code = code;
		this.message = message;
		this.petList = petList;
	}




	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<Patients> getPetList() {
		return petList;
	}

	public void setPetList(List<Patients> petList) {
		this.petList = petList;
	}

	@Override
	public String toString() {
		return "Response [code=" + code + ", message=" + message + "]";
	}
	
	
	
}
