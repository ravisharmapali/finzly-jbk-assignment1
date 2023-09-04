package com.jbk.collection.sol3;

import java.util.ArrayList;

public class App {
	public static void main(String[] args) {

		TeacherMasters teacherMasters = new TeacherMasters();
		StudentMasters studentMasters = new StudentMasters();

		Teacher teacher1 = new Teacher(11, "Suravi Das", "English");
		Teacher teacher2 = new Teacher(12, "Pradhyumn Deb", "Hindi");
		Teacher teacher3 = new Teacher(13, "Nishtha Yadav", "Math");

		teacherMasters.addTeacher(teacher1);
		teacherMasters.addTeacher(teacher2);
		teacherMasters.addTeacher(teacher3);

		Student student1 = new Student(21, "Ananth Kumar", "10th");
		Student student2 = new Student(22, "Gopi Nandan", "11th");
		Student student3 = new Student(23, "Vishveshvar Dayal", "12th");

		studentMasters.addStudent(student1);
		studentMasters.addStudent(student2);
		studentMasters.addStudent(student3);

		// print all teachers

		System.out.println("----------------");
		ArrayList<Teacher> allTeachers = teacherMasters.getAllTeachers();
		allTeachers.forEach((t) -> System.out.println(t));

		System.out.println("----------------");
		// print all students

		ArrayList<Student> allStudent = studentMasters.getAllStudent();
		allStudent.forEach((s) -> System.out.println(s));
	}
}