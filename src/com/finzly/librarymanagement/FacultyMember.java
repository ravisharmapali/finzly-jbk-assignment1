package com.finzly.librarymanagement;

public class FacultyMember extends LibraryMember {

	public FacultyMember(int memberId, String name) {
		super(memberId, name);
	}

	@Override
	public void borrowItem(LibraryItem item) {

		System.out.println("faculty member " + super.getName() + " borrowing ");
		item.displayInfo();

	}

	@Override
	public void reserveItem(LibraryItem item) {
		System.out.println("faculty member " + super.getName() + " reserving ");
		item.displayInfo();

	}
}
