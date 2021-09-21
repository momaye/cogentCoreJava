package com.cogent.employeemanagementsystem.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {

	private String employeeId;
	private String firstName;
	private String lastName;
	private float emSalary;
	private String address;
	public Employee() {
		this.employeeId="";
		// explicit default constructor
	}
       
}


