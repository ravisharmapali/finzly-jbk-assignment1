package com.jbk.collection.sol3;

import java.util.ArrayList;

public class TeacherMasters {

	private ArrayList<Teacher> teachers = new ArrayList<>();

	public void addTeacher(Teacher teacher) {
		teachers.add(teacher);
	}

	public ArrayList<Teacher> getAllTeachers() {
		return teachers;
	}
}
