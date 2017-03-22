package org.javacream.asc.training.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.javacream.asc.books.api.Book;
import org.javacream.asc.books.api.BookIsbnComparator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CollectionsDemo2_Java7 {

	private List<String> stringData;
	private List<Book> bookData;
	
	@Before public void initTest(){
		stringData = new ArrayList<>();
		stringData.add("Hugo");
		stringData.add("Emil");
		stringData.add("Fritz");
		stringData.add("Zara");
		stringData.add("Alfred");
		
		bookData = new ArrayList<>();
		Book book = new Book("ISBN321", "Java in Action", 19.99, 500);
		bookData.add(book);
		book = new Book("ISBN42", "Ruby in Action", 29.99, 200);
		bookData.add(book);
		book = new Book("ISBN33", "JEE", 9.99, 800);
		bookData.add(book);
		book = new Book("ISBN53", "TSV 1860", 0.0, 100);
		bookData.add(book);
		book = new Book("ISBN99", "Bahnfahren", 39.99, 750);
		bookData.add(book);
		
	}
	
	@Test public void testStringSort(){
		Assert.assertEquals(5, stringData.size());
		Collections.sort(stringData);
		Assert.assertEquals("Alfred", stringData.get(0));
		int lastIndexOfStringDataList = stringData.size() - 1;
		Assert.assertEquals("Zara", stringData.get(lastIndexOfStringDataList));
		
	}
	@Test public void testBookNaturalOrderSort(){
		Assert.assertEquals(5, bookData.size());
		Collections.sort(bookData);
		Assert.assertEquals("Bahnfahren", bookData.get(0).getTitle());
//		int lastIndexOfStringDataList = stringData.size() - 1;
//		Assert.assertEquals("Zara", stringData.get(lastIndexOfStringDataList));
		
	}
	@Test public void testBookSortByIsbn(){
		Assert.assertEquals(5, bookData.size());
		Collections.sort(bookData, new BookIsbnComparator(true));
		Assert.assertEquals("Java in Action", bookData.get(0).getTitle());
		Collections.sort(bookData, new BookIsbnComparator(false));
		Assert.assertEquals("Bahnfahren", bookData.get(0).getTitle());
		
	}

	@Test public void testStringAppendRemove(){
		Assert.assertEquals(5, stringData.size());
		stringData.add("Josef");
		Assert.assertEquals(6, stringData.size());
		stringData.clear();
		Assert.assertEquals(0, stringData.size());
		
	}
}
