package com.cogent.employeemanagementsystem;

import com.cogent.employeemanagementsystem.model.Employee;

import com.cogent.employeemanagementsystem.service.EmployeeService;
public class Main {

	public static void main(String[] args) {
	/*
		Employee employee = new Employee();
		Employee employee3 = null;
		int a = 10;
		System.out.println(a);
	    // ClassName reference = object
		Employee employee2 = new Employee ("ab001", "abhi", "chivate", 123.0f, "PA");
		
		System.out.print(employee2.getEmployeeId());
		// System.out.print(employee3.getAddress());
		
		Employee employees[] = new Employee[10];
		for (int i = 0; i < employees.length; i++) {
			employees[i] = new Employee();
		}
		
		
		for (Employee employee4 : employees) {
			
			System.out.println (employee);
		}
		}
	*/
		

		EmployeeService employeeService = new EmployeeService();
		
		Employee employee = new Employee("ab001", "abhi", "chivate", 123.0f, "PA");
		
		String result = employeeService.addEmployee(employee);
		
		System.out.println(result);
	}

}
