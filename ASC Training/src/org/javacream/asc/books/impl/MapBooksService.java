package org.javacream.asc.books.impl;

import java.util.HashMap;
import java.util.Map;

import org.javacream.asc.books.api.Book;
import org.javacream.asc.books.api.BooksService;

public class MapBooksService implements BooksService {

	private Map<String, Book> books;

	{
		books = new HashMap<>();
	}

	/* (non-Javadoc)
	 * @see org.javacream.asc.books.BooksService#newBook(org.javacream.asc.books.Book)
	 */
	@Override
	public void newBook(Book book){
		books.put(book.getIsbn(), book);
	}
	
	/* (non-Javadoc)
	 * @see org.javacream.asc.books.BooksService#findBookByIsbn(java.lang.String)
	 */
	@Override
	public Book findBookByIsbn(String isbn){
		return books.get(isbn);
	}

	
	/* (non-Javadoc)
	 * @see org.javacream.asc.books.BooksService#deleteBookByIsbn(java.lang.String)
	 */
	@Override
	public void deleteBookByIsbn(String isbn){
		books.remove(isbn);
	}
	
	/* (non-Javadoc)
	 * @see org.javacream.asc.books.BooksService#update(java.lang.String, java.lang.Double, java.lang.Integer)
	 */
	@Override
	public void update(String isbn, Double newPrice, Integer newPages){
		Book book = books.get(isbn);
		if (book != null){
			book.setPages(newPages);
			book.setPrice(newPrice);
		}
	}

}
