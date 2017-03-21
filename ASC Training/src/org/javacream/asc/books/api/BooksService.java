package org.javacream.asc.books.api;

public interface BooksService {

	void newBook(Book book);

	Book findBookByIsbn(String isbn);

	void deleteBookByIsbn(String isbn);

	void update(String isbn, Double newPrice, Integer newPages);

}