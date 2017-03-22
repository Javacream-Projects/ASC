package org.javacream.asc.books.api;

import java.util.Comparator;

public class BookIsbnComparator implements Comparator<Book> {
	private boolean ascending;

	public BookIsbnComparator(boolean ascending) {
		super();
		this.ascending = ascending;
	}

	@Override
	public int compare(Book o1, Book o2) {
		if (ascending) {
			return o1.getIsbn().compareTo(o2.getIsbn());
		} else {
			return -o1.getIsbn().compareTo(o2.getIsbn());

		}
	}

}
