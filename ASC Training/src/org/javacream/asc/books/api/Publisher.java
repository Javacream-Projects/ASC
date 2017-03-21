package org.javacream.asc.books.api;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.javacream.asc.training.oop.Address;

public class Publisher {

	private String publisherName;
	public Publisher(String publisherName, Address address) {
		super();
		this.publisherName = publisherName;
		this.address = address;
	}
	public String getPublisherName() {
		return publisherName;
	}
	public Address getAddress() {
		return address;
	}
	private Address address;
	
	private List<Book> publishedBooks;
	
	{
		publishedBooks = new LinkedList<>();
	}
	
	public List<Book> findAllBooks(){
		return Collections.unmodifiableList(publishedBooks);
	}
	
	public void addBooks(List<Book> newBooks){
		publishedBooks.addAll(newBooks);
	}
	
}
