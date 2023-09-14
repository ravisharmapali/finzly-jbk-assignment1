package com.jbk.bookinventory;

import java.util.List;

/*
*
*
*/
public class App {
	private static InventoryServices services = new InventoryServices();

	public static void main(String[] args) {

		// 1. add a new book
		// addNewBook();

		// a. Search for books published within a certain range of years.
		searchOnRangeOfYear();

		// b. Search for books written by a specific author.
//		searchByAuthor();
		// c. Search for books with a specific title or containing specific keywords in
		// the title.
//		searchByTitle();

		// d. Search for books with a specific ISBN number.
//		searchByIsbn();

		// e. Display all books currently available in the library.
//		displayAllBooks();

		// 2 .update book
//		updateBook();

		// 3. delete book
//		deleteBook();

	}

	private static void addNewBook() {

//		Book book = new Book(111,"IS-JBK01","Industrial Java","Mr. Kiran","2020");
//		services.addNewBook(book);

//		Book book2 = new Book(112,"IS-JBK02","Adv Java","Mr. Sagar","2022");
//		services.addNewBook(book2);
//		
//		Book book3 = new Book(113,"IS-JBK03","Angular","Mr.Sumit","2023");
//		services.addNewBook(book3);
//		Book book5 = new Book(114,"JJJ-112","sample","Mr X","2021");
//		services.addNewBook(book5);

	}

	public static void searchOnRangeOfYear() {

		String startYear = "2021";
		String endYear = "2023";
		List<Book> books = services.searchBookBasedOnPublishedYearRange(startYear, endYear);
		System.out.println("------ Books -----------");
		if (books != null) {
			for (Book book : books) {

				System.out.println(book);
			}
		} else {
			System.out.println("not found on this range");
		}
	}

	public static void searchByAuthor() {

		String authorName = "";
		List<Book> byAuthor = services.searchBookByAuthorName(authorName);
		if (byAuthor != null) {
			for (Book book : byAuthor) {

				System.out.println(book);
			}
		} else {
			System.out.println("not found by this author");
		}

	}

	public static void searchByTitle() {

		String keyword = "java";
		List<Book> list = services.searchBookByTitleOrKeyword(keyword);
		if (list != null) {
			for (Book book : list) {

				System.out.println(book);
			}
		} else {
			System.out.println("not found by this title");
		}

	}

	public static void updateBook() {
		Book bookToUpdate = new Book();
		bookToUpdate.setBookISBN("IS-JBK11");
		bookToUpdate.setBookTitle("Complete ref to Adv Java");
		bookToUpdate.setBookAuthor("Mr. Sagar");
		bookToUpdate.setPublicationYear("2023");
		String status = services.updateBookDetails(112, bookToUpdate);
		System.out.println(status);

	}

	public static void deleteBook() {
		int bookIdToDeleteBook = 114;
		String delStatus = services.deleteBook(bookIdToDeleteBook);
		System.out.println(delStatus);

	}

	public static void searchByIsbn() {
		String isbnNum = "";
		List<Book> list = services.searchBookByISBN(isbnNum);
		if (list != null) {
			for (Book book : list) {

				System.out.println(book);
			}
		} else {
			System.out.println("not found by this title");
		}
	}

	public static void displayAllBooks() {
		List<Book> allBook = services.getAllBook();
		if (allBook != null) {
			for (Book book : allBook) {

				System.out.println(book);
			}
		} else {
			System.out.println("not books available");
		}

	}

}