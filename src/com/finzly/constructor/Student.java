package com.finzly.constructor;

public class Student {

	private int studentId; // to uniquely identify
	private String name;
	private int age;

	// to generate uid
//	private static final AtomicInteger atomicInteger = new AtomicInteger(111);
	private static int id = 111;
	
	public Student() {
		studentId = 0;
		name = "Unknown";
		age = 0;
	}

	public Student(String name, int age) {
//		this.studentId = 111;   // how to generate unique number

	//	this.studentId = atomicInteger.incrementAndGet();
		this.studentId = ++id;
		this.name = name;
		this.age = age;
	}

	public Student(int studetnId, String name, int age) {
		
		this.studentId = studentId;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student Id " + this.studentId + " name " + this.name + " age " + this.age;
	}

}
