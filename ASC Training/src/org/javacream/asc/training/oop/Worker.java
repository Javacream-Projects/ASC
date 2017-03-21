package org.javacream.asc.training.oop;

public class Worker extends Person {

	public Worker(String lastname, String givenName, Integer height, Character gender, Company company) {
		super(lastname, givenName, height, gender);
		this.company = company;
	}

	public Worker(String givenName, Integer height, Character gender, Company company) {
		super(givenName, height, gender);
		this.company = company;
	}

	private Company company;

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public void work() {
		System.out.println("working at " + company.getName());
	}

	@Override
	public String sayHello() {
		return super.sayHello() + ", working at " + company.getName();
	}

}
