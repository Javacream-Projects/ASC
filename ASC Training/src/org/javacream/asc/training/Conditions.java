package org.javacream.asc.training;

public class Conditions {

	public static void main(String[] args) {
		// If
		Integer zahl = 1;
		if (zahl > 0) {
			System.out.println("Zahl war größer null");
		}

		// if else
		if (zahl > 0) {
			System.out.println("Zahl war größer null");
		} else {
			System.out.println("Zahl war kleiner gleich null");

		}

		// beliebig verschachteln

		if (zahl > 0) {
			System.out.println("Zahl war größer null");
		} else if (zahl > -5) {
			System.out.println("Zahl war kleiner gleich null und größer -5");
		} else {
			// ...
		}

		switch (zahl) {
		case 1: {
			System.out.println("Zahl war 1");
			break;
		}
		case 3: {
			System.out.println("Zahl war 3");
			break;
		}
		case 5: {
			System.out.println("Zahl war 5");
			break;
		}
		default: {
			System.out.println("Zahl war nicht 1, 3, 5");
			break;
		}
		}

	}

}
