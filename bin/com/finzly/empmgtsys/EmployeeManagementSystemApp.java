package com.jbk.empmgtsys;

import java.util.List;

public class EmployeeManagementSystemApp {
	public static void main(String[] args) {
		EmployeeServices services = new EmployeeServices();

		// create
		Employee employee1 = new Employee(111, "Hriday", "Goswami", "15-02-1995", "gohriday@gmail.com", "development",
				55000);
		services.addNewEmployee(employee1);
		Employee employee2 = new Employee(112, "Darshil", "Upadhyay", "15-02-1998", "darshilesh@gmail.com", "Testing",
				65000);
		services.addNewEmployee(employee2);
		Employee employee3 = new Employee(113, "Ravi", "Sharma", "14-03-1990", "ravish@gmail.com", "development",
				55000);
		services.addNewEmployee(employee1);

		// read
		Employee byId = services.getEmployeeById(111);
		System.out.println(byId);

		// read all employee
		List<Employee> allEmp = services.getAllEmployee();
		for (Employee employee : allEmp) {
			System.out.println(employee);
		}

		// update
		Employee empToUpdate = new Employee();
		empToUpdate.setDepartment("DevOps");
		empToUpdate.setSalary(80000);
		String updateEmployee = services.updateEmployee(empToUpdate, 112);
		System.out.println(updateEmployee);

		// delete
		int empIdToDelete = 113;
		String employee = services.deleteEmployee(empIdToDelete);
		System.out.println(employee);

		// a. Get the employees who is having salary getter that 30000
		List<Employee> emps = services.findEmployeeWithSal(30000);

		// b. Get the employees who has department developer and tester
		String[] dept = { "developer", "tester" };
		List<Employee> list = services.findEmployeeWithDept(dept);
		for (Employee employee4 : list) {
			System.out.println(employee4);
		}

		// c. Get the employees from all the departments other than tester.
		String department = "tester";
		List<Employee> list2 = services.findEmployeeDepartmentNotIn(department);

		for (Employee employee4 : list) {
			System.out.println(employee4);
		}

		// d. Sort (descending) the employees based of their salary

		List<Employee> sorted = services.sortEmployeeOnSalaryDesc();

		for (Employee emp : sorted) {
			System.out.println(emp);
		}

	}
}