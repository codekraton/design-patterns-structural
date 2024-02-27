package com.codekraton.designpatterns.adapters;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

	public List<Employee> getEmployeeList() {
	
		List<Employee> employees = new ArrayList<>();

		EmployeeDB employeeDB = new EmployeeDB("1234", "John", "Wick", "john@wick.com");

		EmployeeLdap employeeFromLdap = new EmployeeLdap("chewie", "Solo", "Han", "han@solo.com");

		EmployeeCSV employeeFromCSV = new EmployeeCSV("567,Sherlock,Holmes,sherlock@holmes.com");

		/*
			TODO: Excercise one
			Create adapters so that we can add the three types of legacy com.codekraton.designpatterns.adapters.Employee objects to the list of Employees.
			You cannot modify any of the existing objects.
		*/

//		employees.add(employeeDB);
//		employees.add(employeeFromLdap);
//		employees.add(employeeFromCSV);

		return employees;
		
	}
	
}
