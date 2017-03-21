package org.javacream.asc.training.oop;

public class Student extends Person {

	public Student(String lastname, String givenName, Integer height, Character gender, String university) {
		super(lastname, givenName, height, gender);
		this.university = university;
	}

	public Student(String givenName, Integer height, Character gender, String university) {
		super(givenName, height, gender);
		this.university = university;
	}

	
	private String university;


	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public void study(){
		System.out.println("studying at " + university);
	}

	@Override
	public String sayHello() {
		return super.sayHello() + ", studying at " + university;
	}
	
	
}
