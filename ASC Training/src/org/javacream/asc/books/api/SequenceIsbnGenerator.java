package org.javacream.asc.books.api;

public class SequenceIsbnGenerator implements IsbnGenerator {


	private static int counter;
	@Override
	public String nextIsbn() {
		return "ISBN" + counter++;
	}

}
