package org.javacream.asc.books.api;

import java.util.Comparator;

public class BookPriceComparator implements Comparator<Book> {
	private boolean ascending;

	public BookPriceComparator(boolean ascending) {
		super();
		this.ascending = ascending;
	}

	@Override
	public int compare(Book o1, Book o2) {
		if (ascending) {
			if (o1.getPrice() > o2.getPrice()){
				return 1;
			}else{
				return -1;
			}
		} else {
			if (o1.getPrice() < o2.getPrice()){
				return 1;
			}else{
				return -1;
			}
		}
	}

}
