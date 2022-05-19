package com.example.request;

import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class CreateStudentRequest {

	@NotBlank(message = "First name is required")
	private String firstName;
	private String lastName;
	private String email;
}
