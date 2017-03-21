package org.javacream.asc.books.test;

import org.javacream.asc.books.Book;
import org.javacream.asc.books.BooksService;
import org.javacream.asc.books.SchoolBook;
import org.javacream.asc.books.SpecialistBook;
import org.junit.Test;

public class BooksServiceTest {

	@Test
	public void testBooksApplication() {
		BooksService booksService = new BooksService();
		Book book = new Book("ISBN1", "TITLE1", 19.99, 200);
		booksService.newBook(book);
		book = new Book("ISBN2", "TITLE2", 9.99, 100);
		booksService.newBook(book);
		book = new Book("ISBN3", "TITLE3", 29.99, 500);
		booksService.newBook(book);
		SpecialistBook specialistBook = new SpecialistBook("ISBN4", "TITLE4", 3.99, 800, "Physics");
		booksService.newBook(specialistBook);
		SchoolBook schoolBook = new SchoolBook("ISBN5", "TITLE5", 1.99, 300, 9, "History");
		booksService.newBook(schoolBook);
		schoolBook = new SchoolBook("ISBN6", "TITLE6",21.99, 500, 9, "French");
		booksService.newBook(schoolBook);
		specialistBook = new SpecialistBook("ISBN7", "TITLE7", 99.99, 2000, "Math");
		booksService.newBook(specialistBook);
		
		System.out.println(booksService.findBookByIsbn("ISBN1").info());
		System.out.println(booksService.findBookByIsbn("ISBN6").info());

		booksService.deleteBookByIsbn("ISBN6");
		System.out.println(booksService.findBookByIsbn("ISBN6"));
		
		booksService.update("ISBN2", 309.87, 3);
		System.out.println(booksService.findBookByIsbn("ISBN2").info());
		

	}
}
