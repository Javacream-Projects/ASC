package org.javacream.asc.books.api;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Book implements Comparable<Book>{

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", price=" + price + ", pages=" + pages + ", authors="
				+ authors + ", keywords=" + keywords + "]";
	}

	private String isbn;
	private String title;
	private Double price;
	private Integer pages;
	private List<Author> authors;
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getPages() {
		return pages;
	}
	public void setPages(Integer pages) {
		this.pages = pages;
	}
	public String getIsbn() {
		return isbn;
	}
	public String info() {
		return "Book [isbn=" + isbn + ", title=" + title + ", price=" + price + ", pages=" + pages + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (isbn == null) {
			if (other.isbn != null)
				return false;
		} else if (!isbn.equals(other.isbn))
			return false;
		return true;
	}
	public String getTitle() {
		return title;
	}
	public Book(String isbn, String title, Double price, Integer pages) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.price = price;
		this.pages = pages;
	}
	@Override
	public int compareTo(Book o) {
		return this.title.compareTo(o.title);
//		return this.pages- o.pages;
	}

	private Set<String> keywords = new HashSet<>();
	
	public Set<String> getKeywords() {
		return Collections.unmodifiableSet(keywords);
	}
	public void addKeywords(String...keywords ){
		this.keywords.addAll(Arrays.asList(keywords));
	}
	
}
