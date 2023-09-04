package com.jbk.collection.sol1;

import java.util.ArrayList;

// class contains operations on Employees
public class EmployeeMasters {

	private ArrayList<Employee> employees = new ArrayList<Employee>();

//	adding employee
	public void addEmployee(Employee employee) {

		employees.add(employee);

	}

	
	public void viewAllEmployee() {

		for (Employee emp : employees) {
			System.out.println(emp);
		}

	}

	public Employee searchEmployee(int empId) {
		System.out.println("-----------------------");
		for (Employee emp : employees) {
			if (emp.getEmployeeId() == empId) {
				return emp;
			}
		}
		return null;

	}

}
