package org.javacream.asc.training;

import java.util.Date;

public class TypeConstruction {

	public static void main(String[] args) {
		Date actualDate = new Date();//es gibt kein Date-Literal #12-12-2007#;
		System.out.println(actualDate);
		String s = "Hugo";
		addToString(s);
		System.out.println(s);
		String result = addToStringWithReturn(s);
		System.out.println(result);
		StringBuilder sb = new StringBuilder("SB-Hugo");
		System.out.println(sb);
		addToString(sb);
		System.out.println(sb);
		
		String s2 = sb.toString();
		System.out.println(s2);
	}

	//Überladen von Methoden, 
	//die Typen der Parameterliste sind Bestandteil der Signatur
	//NICHT: Parameternamen, Rückgabetyp
	static void addToString(String s){
		s.concat("-Emil");
	}
	static void addToString(StringBuilder s){
		s.append("-Emil").append("-Fritz");
	}
	static String addToStringWithReturn(String s){
		return s.concat("-Emil");
	}

}
