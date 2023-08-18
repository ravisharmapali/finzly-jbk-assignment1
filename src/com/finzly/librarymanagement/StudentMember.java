package com.finzly.librarymanagement;

public class StudentMember extends LibraryMember {

	public StudentMember(int memberId, String name) {
		super(memberId, name);
	}

	@Override
	public void borrowItem(LibraryItem item) {

		System.out.println("Student member "+ super.getName() +" borrowing ");
		
		item.displayInfo();

	}
	
	@Override
	public void reserveItem(LibraryItem item) {
	
		System.out.println("Student member "+ super.getName() +" reserving ");
		
		item.displayInfo();
		
		
	}
}