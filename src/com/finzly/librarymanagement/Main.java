package com.finzly.librarymanagement;

public class Main {
	public static void main(String[] args) {
		//
		LibraryItem item1 = new Book(101, "Book1", "Dhyutiman Singh");

		LibraryItem item2 = new DVD(202, "movie1", "2:30 hrs");

		item1.displayInfo();
		System.out.println("----------------");
		item2.displayInfo();
		System.out.println("----------------");
		LibraryMember member1 = new StudentMember(111, "Amit Sharma");
		member1.borrowItem(item1);
		System.out.println("----------------");
		LibraryMember member2 = new FacultyMember(222, "Harshit Dubey");
		member2.borrowItem(item2);

	}
}