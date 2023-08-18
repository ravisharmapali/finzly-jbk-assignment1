package com.finzly.librarymanagement;

public class Book extends LibraryItem {
	// attribute
	private String author;

	public Book(int itemId, String title, String author) {
		super(itemId, title);
		this.author = author;
	}
	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Book author " + author);
	}
}
