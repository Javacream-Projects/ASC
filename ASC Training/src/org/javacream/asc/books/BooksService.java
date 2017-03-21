package org.javacream.asc.books;

import java.util.HashMap;

public class BooksService {

	private HashMap<String, Book> books;

	{
		books = new HashMap<>();
	}

	public void newBook(Book book){
		books.put(book.getIsbn(), book);
	}
	
	public Book findBookByIsbn(String isbn){
		return books.get(isbn);
	}

	
	public void deleteBookByIsbn(String isbn){
		books.remove(isbn);
	}
	
	public void update(String isbn, Double newPrice, Integer newPages){
		Book book = books.get(isbn);
		if (book != null){
			book.setPages(newPages);
			book.setPrice(newPrice);
		}
	}

}
