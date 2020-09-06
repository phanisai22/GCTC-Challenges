package com.javafundamentals;

public class OrderAlphabet {
	public static void main(String[] args) {
		char one = args[0].charAt(0);
		char two = args[1].charAt(1);
		if (one >= two) System.out.println(two + ", " + one);
		else System.out.println(one + ", " + two);
	}
}
