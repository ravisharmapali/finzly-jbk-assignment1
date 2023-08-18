package com.finzly.librarymanagement;

public class LibraryItem {

	private int itemID; // to identify the item
	private String title; // to store title of item

	public LibraryItem(int itemId, String title) {
		this.itemID = itemId;
		this.title = title;
	}

	public int getItemID() {
		return itemID;
	}

	public void setItemID(int itemID) {
		this.itemID = itemID;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void displayInfo() {
		System.out.println("Item ID " + itemID + " with title " + title);
	}
}
