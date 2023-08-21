package com.finzly.constructor;

public class Main {
	public static void main(String[] args) {
		Student student = new Student();
		System.out.println(student);

		Student student2 = new Student( "Adhya", 15);
		System.out.println(student2);

		Student student3 = new Student( "Shaunak", 16);
		System.out.println(student3);
		
	}
}
