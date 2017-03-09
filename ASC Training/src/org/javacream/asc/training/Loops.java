package org.javacream.asc.training;

public class Loops {
	public static void main(String[] args) {
		// Die Klassische C-Schleife
		for (Integer i = 0; i < 5; i++) {
			System.out.println(i);
		}

		Boolean flag = true;

		while (flag) {
			flag = false;
		}

		Integer max = 5;
		//Kopfgesteuert
		while (max > 0) {
			max--;
		}

		//Fussgesteuert
		do {
			max++;
		} while (max < 5);

	}
}
