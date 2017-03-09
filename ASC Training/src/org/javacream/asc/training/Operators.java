package org.javacream.asc.training;

public class Operators {

	public static void main(String[] args) {
		//Mathematische Operatoren
		Integer zahl1 = 22;
		Integer zahl2 = 20;
		
		Integer result = zahl1 + zahl2;
		result = zahl1 - zahl2;
		result = zahl1 * zahl2;
		result = zahl1 / zahl2;
		result = zahl1 % zahl2;
		zahl1 = 1;
		result = zahl1++; //result = 1; zahl1 = 2
		result = ++zahl1;// result = 3 zahl1 = 3
		result += zahl1; // result = result + zahl1;
		//Passiv Schiebe-Operatore: >>, >>>, <<, <<<
		//String Operator
		
		String nachname = "Sawitzki";
		String vorname = "Rainer";
		
		String name = vorname + " " + nachname;
		
		//Logische Operatoren
		Boolean b1 = true;
		Boolean b2 = false;
		
		Boolean logischesResult = b1 && b2; //AND, true AND false -> false
		logischesResult = b1 || b2; //OR //true OR false -> true
		logischesResult = !b1; //Negation true -> false und umgekehrt
		
		//Passiv: Bitweise Vergleiche mit &, |

		//Vergleichsoperatoren
		
		logischesResult = zahl1 > zahl2;
		logischesResult = zahl1 < zahl2;
		logischesResult = zahl1 >= zahl2;
		logischesResult = zahl1 <= zahl2;
		logischesResult = zahl1 == zahl2;
		logischesResult = zahl1 != zahl2; //Ungleich
		//logischesResult = zahl1 = zahl2; Typischer Fehler: Zuweisung statt Vergleich


	
	}

}
