package com.javafundamentals;

public class InvertCase {
	public static void main(String[] args) {
		char c = args[0].charAt(0);
		int ascii = c;
		
		if (ascii >= 97 && ascii <= 122) {
			c -= 32;
			System.out.println(c);
		} else if(ascii >= 65 && ascii <= 90) {
			c += 32;
			System.out.println(c);
		} else {}
	}

}
