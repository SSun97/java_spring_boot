package com.example.service;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class StudentResponse {

	@JsonIgnore
	private long id;
	
	@JsonProperty("first_name")
	private String firstName;
	private String lastName;


	public StudentResponse(long id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
}
