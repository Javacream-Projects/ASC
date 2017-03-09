package org.javacream.asc.training;

public class Functions {
	static String dummyPersonName = "Person";
	public static void main(String[] args){ 
		//Lokale Variable, nicht sichtbar ausserhalb dieser Funktion
		String name = "Sawitzki";
		String name2 = "Mustermann";
		printName(name, true);
		printName(name2, false);
	
		for (Integer i = 0; i < 5; i++){
			String personName = dummyPersonName + i;
			printName(personName, true);
		}
		//System.out.println(i);
	}

	// Eigene Funktionen definieren
	// Neuer Datentyp: Void, void

	// Andere Sprachen unterscheiden Funktionen mit Rückgabewert von Prozeduren
	// ohne Rückgabe

	// Funktionsdefinitionen:
	// static void <name>(typisierte Parameterliste){...}
	static void printName(String personName, Boolean friendly) {
		String prefix = generatePrefix(friendly);	
		System.out.println(prefix + personName);
	}
	
	static String generatePrefix(Boolean mode){
		if (mode){
			return dummyPersonName + ": Hello, my name is ";
		}
		else{
			return dummyPersonName + ": Name  ";
			
		}
	}
}
