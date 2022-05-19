package com.example.service;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
//@NoArgsConstructor
public class StudentResponse {

	@JsonIgnore
	private long id;
	
	@JsonProperty("first_name")
	private String firstName;
	private String lastName;
	
}
