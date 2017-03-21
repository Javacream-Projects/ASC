package org.javacream.asc.books;

public class SchoolBook extends Book {

	private String topic;
	private Integer year;

	public SchoolBook(String isbn, String title, Double price, Integer pages, Integer year, String topic) {
		super(isbn, title, price, pages);
		this.topic = topic;
		this.year = year;
	}

	public String getTopic() {
		return topic;
	}

	public Integer getYear() {
		return year;
	}

	public String info() {
		return "SchoolBook [topic=" + topic + ", year=" + year + ", info()=" + super.info() + "]";
	}

}
