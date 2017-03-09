package org.javacream.asc.training;

public class ArrayType {

	public static void main(String[] args) {
		String[] names = { "Sawitzki", "Mustermann", "Musterfrau" };
		for (Integer i = 0; i < names.length; i++) {
			System.out.println(i + " -> " + names[i]);
		}
		printAndChange(names);
		System.out.println("########################");
		System.out.println(names[1]);
		
	}

	static void printAndChange(String[] namesToPrintAndChange){
		String newName = "Metzger";
		namesToPrintAndChange[1] = newName;
		//for-each-Schleife
		for (String name: namesToPrintAndChange){
			System.out.println("Name: " + name);
		}
		
	}

}
