package org.javacream.asc.training;

public class CatchException {

	public static void main(String[] args) {
		System.out.println("Starting...");
		try {
			Integer number1 = Integer.valueOf("42");
			System.out.println("Number1 is " + number1);
		} catch (Exception e) {
			System.out.println("Fehler, unparsable...");
		}
		try {
			Integer number2 = Integer.valueOf("9999");
			System.out.println("Number2 is " + number2);
		} catch (Exception e) {
			System.out.println("Fehler, unparsable...");
		}

		
		System.out.println("Done.");

	}

}
