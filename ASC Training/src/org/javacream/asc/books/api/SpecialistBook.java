package org.javacream.asc.books.api;

public class SpecialistBook extends Book {

	private String subject;
	public SpecialistBook(String isbn, String title, Double price, Integer pages, String subject) {
		super(isbn, title, price, pages);
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}

	public String info() {
		return "SpecialistBook [subject=" + subject + ", info()=" + super.info() + "]";
	}
	
	
}
