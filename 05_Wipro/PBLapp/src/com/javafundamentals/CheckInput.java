package com.javafundamentals;

public class CheckInput {

	public static void main(String[] args) {
		int ascii = args[0].charAt(0);
		if (ascii >= 97 && ascii <= 122 || ascii >= 65 && ascii <= 90) System.out.println("Alphabet");
		else if (ascii >= 48 && ascii <= 57) System.out.println("Digit");
		else System.out.println("Special Character");
	}

}
