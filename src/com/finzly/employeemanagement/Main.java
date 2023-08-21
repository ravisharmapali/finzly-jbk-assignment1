package com.finzly.employeemanagement;

public class Main {
	public static void main(String[] args) {
		Employee emp1 = new Manager(111, "Sagar", "ITM");
		Employee emp2 = new Developer(112, "Ajit", "Java");
		System.out.println(emp1);
		System.out.println(emp2);
	}
}