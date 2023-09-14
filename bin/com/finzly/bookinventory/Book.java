package com.jbk.bookinventory;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {

	@Id
	private int bookId;
	private String bookISBN;
	private String bookTitle;
	private String bookAuthor;
	private String publicationYear;

	public Book() {

	}

	public Book(int bookId, String bookISBN, String bookTitle, String bookAuthor, String publicationYear) {
		super();
		this.bookId = bookId;
		this.bookISBN = bookISBN;
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.publicationYear = publicationYear;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookISBN() {
		return bookISBN;
	}

	public void setBookISBN(String bookISBN) {
		this.bookISBN = bookISBN;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public String getPublicationYear() {
		return publicationYear;
	}

	public void setPublicationYear(String publicationYear) {
		this.publicationYear = publicationYear;
	}

	@Override
	public String toString() {
		return "Book [bookISBN=" + bookISBN + ", bookTitle=" + bookTitle + ", bookAuthor=" + bookAuthor
				+ ", publicationYear=" + publicationYear + "]";
	}

}