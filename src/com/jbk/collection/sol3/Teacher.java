package com.jbk.collection.sol3;

public class Teacher {

	private int teacherId;
	private String teacherName;
	private String teacherSubject;

	public Teacher() {

	}

	public Teacher(int teacherId, String teacherName, String teacherSubject) {
		super();
		this.teacherId = teacherId;
		this.teacherName = teacherName;
		this.teacherSubject = teacherSubject;
	}

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getTeacherSubject() {
		return teacherSubject;
	}

	public void setTeacherSubject(String teacherSubject) {
		this.teacherSubject = teacherSubject;
	}

	@Override
	public String toString() {
		return "Teacher [teacherId=" + teacherId + ", teacherName=" + teacherName + ", teacherSubject="
				+ teacherSubject;
	}

}
