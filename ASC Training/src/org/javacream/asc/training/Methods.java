package org.javacream.asc.training;

public class Methods {

	public static void main(String[] args) {
		//Integer number = 42;
		String name = "Hugo";
		String numberString = "42";
		Integer number = Integer.valueOf(numberString);
		System.out.println(number + 1);
		numberString = String.valueOf(number);
	}
	
	static void doStringOperations(){
		//TODO: Zeichenkettenverarbeitung
	}
	static void doTypeConversion(){
		//TODO: String -> Integer und umgekehrt...
		//Integer i1 = 2; Integer i2 = 4; Integer result = i1/i2;
	}

}
