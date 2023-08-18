package com.finzly.librarymanagement;

public class DVD extends LibraryItem {

	private String duration; // to store duration

	public DVD(int itemId, String title, String duration) {
		super(itemId, title);
		this.duration = duration;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("DVD with " + duration + " duration");
	}
}
