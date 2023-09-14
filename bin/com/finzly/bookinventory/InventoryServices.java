package com.jbk.bookinventory;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import com.jbk.util.HibernateUtil;

public class InventoryServices {

	// add new book to the libraries inventory
	public void addNewBook(Book book) {
		System.out.println("book adding");
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		session.save(book);
		session.beginTransaction().commit();

		session.close();

	}

	public String updateBookDetails(int bookId, Book bookToUpdate) {
		System.out.println("update book");
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Book book = (Book) session.get(Book.class, bookId);
		if (book != null) {
			book.setBookISBN(bookToUpdate.getBookISBN());
			book.setBookAuthor(bookToUpdate.getBookAuthor());
			book.setBookTitle(bookToUpdate.getBookTitle());
			book.setPublicationYear(bookToUpdate.getPublicationYear());
			session.saveOrUpdate(book);
			session.beginTransaction().commit();
			session.close();
			return "Book Updated ";
		} else {
			session.close();
			return "Cant Update due to book not found!";
		}

	}

	public String deleteBook(int bookIdToDeleteBook) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Book book = (Book) session.get(Book.class, bookIdToDeleteBook);
		if (book != null) {
			session.delete(book);
			session.beginTransaction().commit();
			session.close();
			return "book deleted successfully!";
		} else {
			session.close();
			return "book cant be found!";
		}

	}

	public List<Book> searchBookBasedOnPublishedYearRange(String startYear, String endYear) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Book.class);
		List<Book> bookList = criteria.add(Restrictions.between("publicationYear", startYear, endYear)).list();
		session.close();
		return bookList;
	}

	public List<Book> searchBookByAuthorName(String authorName) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Book.class);
		List<Book> bookList = criteria.add(Restrictions.eq("bookAuthor", authorName)).list();
		session.close();
		return bookList;

	}

	public List<Book> searchBookByTitleOrKeyword(String keyword) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Book.class);
		List<Book> list = criteria.add(Restrictions.ilike("bookTitle", keyword)).list();
		session.close();
		return list;
	}

	public List<Book> searchBookByISBN(String isbnNum) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Book.class);
		List<Book> bookList = criteria.add(Restrictions.eq("bookISBN", isbnNum)).list();
		session.close();
		return bookList;
	}

	public List<Book> getAllBook() {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Book.class);
		List<Book> list = criteria.list();
		session.close();
		return list;
	}

}