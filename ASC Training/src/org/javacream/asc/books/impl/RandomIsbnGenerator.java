package org.javacream.asc.books.impl;

import java.util.Random;

import org.javacream.asc.books.api.IsbnGenerator;

public class RandomIsbnGenerator implements IsbnGenerator {


	private Random randomIsbnGenerator = new Random(this.hashCode() + System.currentTimeMillis());
	@Override
	public String nextIsbn() {
		return "ISBN" + randomIsbnGenerator.nextInt();
	}

}
