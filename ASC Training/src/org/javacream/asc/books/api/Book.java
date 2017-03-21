package org.javacream.asc.books.api;

public class Book {

	private String isbn;
	private String title;
	private Double price;
	private Integer pages;
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
}
