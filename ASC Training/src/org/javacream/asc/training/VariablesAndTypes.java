package org.javacream.asc.training;

public class VariablesAndTypes {
	public static void main(String[] args) {
		String zeichenkette; //Beliebig lange Zeichenkette
		Character einzelzeichen; //Ein einzelnes Zeichen
		Integer ganzZahl; //Ganzzahl, Wertebereich -> Dokumentation
		Double kommaRahl; //Kommazahl, Wertebereich -> Dokumentation
		Boolean logischerWert; //Logischer Wert, wahr oder falsch
		
		//###  Nur passiv zu wissen:
		Byte byteGanzZahl; //Ganzzahl, Wertebereich -> Dokumentation
		Short shortGanzZahl; //Ganzzahl, Wertebereich -> Dokumentation
		Long longGanzZahl; //Ganzzahl, Wertebereich -> Dokumentation
		Float floatKommaZahl; //Kommazahl, Wertebereich -> Dokumentation
		
		//###  Historisch:
		char altesEinzelzeichen; //Ein einzelnes Zeichen
		int  alteGanzZahl; //Ganzzahl, Wertebereich -> Dokumentation
		double alteKommaRahl; //Kommazahl, Wertebereich -> Dokumentation
		boolean alterLogischerWert; //Logischer Wert, wahr oder falsch
		byte altebyteGanzZahl; //Ganzzahl, Wertebereich -> Dokumentation
		short alteshortGanzZahl; //Ganzzahl, Wertebereich -> Dokumentation
		long altelongGanzZahl; //Ganzzahl, Wertebereich -> Dokumentation
		float altefloatKommaZahl; //Kommazahl, Wertebereich -> Dokumentation
		
		//var message; nicht möglich
		
		zeichenkette = "Hello";
		einzelzeichen = 'a';
		ganzZahl = 42;
		kommaRahl = 47.11;
		logischerWert = true;
		logischerWert = false;
		
		alteGanzZahl = ganzZahl;
		Integer alteGanzZahl2 = ganzZahl;
		
		
		//Potenzielle Fehler:
//		zeichenkette = ganzZahl;
//		zeichenkette = 42;

		
		//Kompaktere Schreibweise
		String name = "Sawitzki";
		
		String string = "Hugo";
		Integer integer = 42;
	}
}
