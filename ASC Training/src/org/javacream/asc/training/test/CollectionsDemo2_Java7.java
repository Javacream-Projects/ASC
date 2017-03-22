package org.javacream.asc.training.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.javacream.asc.books.api.Book;
import org.javacream.asc.books.api.BookIsbnComparator;
import org.javacream.asc.books.api.BookPriceComparator;
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
		book.addKeywords("Java", "Programming");
		bookData.add(book);
		book = new Book("ISBN42", "Ruby in Action", 29.99, 200);
		book.addKeywords("Ruby", "Programming");
		bookData.add(book);
		book = new Book("ISBN33", "JEE", 9.99, 800);
		book.addKeywords("Java", "Programming", "JEE");
		bookData.add(book);
		book = new Book("ISBN99", "Bahnfahren", 39.99, 750);
		book.addKeywords("Mobility", "Railway");
		bookData.add(book);
		book = new Book("ISBN99", "Egal Bahnfahren", 39.99, 750);
		book.addKeywords("Mobility", "Railway");
		bookData.add(book);
		
	}
	
	//@Test 
	public void testStringSort(){
		Assert.assertEquals(5, stringData.size());
		Collections.sort(stringData);
		Assert.assertEquals("Alfred", stringData.get(0));
		int lastIndexOfStringDataList = stringData.size() - 1;
		Assert.assertEquals("Zara", stringData.get(lastIndexOfStringDataList));
		
	}
	//@Test 
	public void testBookNaturalOrderSort(){
		Assert.assertEquals(5, bookData.size());
		Collections.sort(bookData);
		Assert.assertEquals("Bahnfahren", bookData.get(0).getTitle());
//		int lastIndexOfStringDataList = stringData.size() - 1;
//		Assert.assertEquals("Zara", stringData.get(lastIndexOfStringDataList));
		
	}
	//@Test 
	public void testBookSortByIsbn(){
		Assert.assertEquals(5, bookData.size());
		Collections.sort(bookData, new BookIsbnComparator(true));
		Assert.assertEquals("Java in Action", bookData.get(0).getTitle());
		Collections.sort(bookData, new BookIsbnComparator(false));
		Assert.assertEquals("Bahnfahren", bookData.get(0).getTitle());
		
	}
	//@Test 
	public void testDuplicateIsbnBook(){
		Assert.assertEquals(5, bookData.size());
		HashSet<Book> noDups = new HashSet<>(bookData);
		Assert.assertEquals(4, noDups.size());
		
		
	}

	//@Test 
	public void testStringAppendRemove(){
		Assert.assertEquals(5, stringData.size());
		stringData.add("Josef");
		Assert.assertEquals(6, stringData.size());
		stringData.clear();
		Assert.assertEquals(0, stringData.size());
		
	}

	//@Test 
	public void testFilterCheapBooksLoop(){
		LinkedList<Book> cheapBooks = new LinkedList<>();
		for (Book book: bookData){
			if (book.getPrice() < 12.99){
				cheapBooks.add(book);
			}
		}
		
	}
	//@Test 
	public void testFilterCheapBooksLoopAndSet(){
		Set<Book> cheapBooks = new HashSet<>();
		for (Book book: bookData){
			if (book.getPrice() < 12.99){
				cheapBooks.add(book);
			}
		}
		
	}

	//@Test TODO... 
	public void testFilterCheapBooksLoop2(){
		for (Book book: bookData){
			if (book.getPrice() >= 12.99){
				bookData.remove(book);
			}
		}
		
	}

	//@Test 
	public void testFilterCheapBooksSortedList(){
		Collections.sort(bookData, new BookPriceComparator(true));
		LinkedList<Book> cheapBooks = new LinkedList<>(bookData);
		Book book;
		while ((book = cheapBooks.removeFirst()).getPrice() < 12.99 && cheapBooks.size() > 0){
			
		}
		cheapBooks.add(book);
	}
	
	@Test public void allKeywords(){
		HashSet<String> allKeywords = new HashSet<>();
		for (Book b: bookData){
			allKeywords.addAll(b.getKeywords());
		}
	}

	@Test public void groupBooksByKeywords(){

		Map<String, Set<Book>> group = new HashMap<>();
		for (Book b: bookData){
			Set<String> keywordsForBook = b.getKeywords();
			for (String keyword: keywordsForBook){
				Set<Book> setForKeyword = group.get(keyword);
				if (setForKeyword == null){
					setForKeyword = new HashSet<>();
					group.put(keyword, setForKeyword);
					
				}
				setForKeyword.add(b);
			}
		}
		
		System.out.println(group);
	}

}
