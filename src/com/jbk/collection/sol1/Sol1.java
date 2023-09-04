package com.jbk.collection.sol1;

public class Sol1 {

	public static void main(String[] args) {

		EmployeeMasters empMaster = new EmployeeMasters();

		Employee emp1 = new Employee(111, "Anant Kumar", "Manager");
		Employee emp2 = new Employee(112, "Harsh Dube", "Head IT");
		Employee emp3 = new Employee(113, "Trisha", "HR");
		Employee emp4 = new Employee(114, "Joy Sinha", "Tech Tead");

		// adding employees
		empMaster.addEmployee(emp1);
		empMaster.addEmployee(emp2);
		empMaster.addEmployee(emp3);
		empMaster.addEmployee(emp4);

		// view all employee details
		empMaster.viewAllEmployee();

		// get employee based on id
		int empId = 114;
		Employee searchedEmployee = empMaster.searchEmployee(empId);
		if (searchedEmployee != null) {
			System.out.println(" Employee with id " + empId + " Details :" + " Name "
					+ searchedEmployee.getEmployeeName() + " Designation " + searchedEmployee.getDesignation());

		} else {
			System.out.println("Employee not found with id " + empId);
		}
		System.out.println("--------------------------");

	}
}