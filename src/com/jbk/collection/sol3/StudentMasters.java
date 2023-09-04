package com.jbk.collection.sol3;

import java.util.ArrayList;

public class StudentMasters {

	private ArrayList<Student> students = new ArrayList<>();

	public void addStudent(Student student) {
		students.add(student);
	}

	public ArrayList<Student> getAllStudent() {

		return students;
	}

}
