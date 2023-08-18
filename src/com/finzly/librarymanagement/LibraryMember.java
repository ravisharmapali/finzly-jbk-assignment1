package com.finzly.librarymanagement;

public abstract class LibraryMember implements Reservable {

	// To store the unique identifier for the member
	private int memberID;
	// to store the name of the member
	private String name;

	public LibraryMember(int memberId, String name) {

		this.memberID = memberId;
		this.name = name;
	}

	public int getMemberID() {
		return memberID;
	}

	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// abstract method
	public abstract void borrowItem(LibraryItem item);

}