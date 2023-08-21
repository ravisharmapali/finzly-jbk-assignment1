package com.finzly.employeemanagement;

public class Developer extends Employee {
	private String programmingLanguage;

	public Developer(int id, String name, String prgrammingLanguage) {
		super(id, name);
		this.programmingLanguage = prgrammingLanguage;
	}

	@Override
	public String toString() {
		return "Developer [id =" + super.getId()+" name "+ super.getName() +" programmingLanguage=" + programmingLanguage + "]";
	}

	
}
