package com.example.service;

import com.example.entity.Address;
import com.example.entity.Student;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AddressResponse {
	private String city;
	private String street;
	private long id;
	private Student student;
	
	public AddressResponse(Address address) {
		this.id = address.getId();
		this.city = address.getCity();
		this.street = address.getStreet();
		this.student = address.getStudent();
	}
}
