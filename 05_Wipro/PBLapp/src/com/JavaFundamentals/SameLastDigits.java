package com.JavaFundamentals;

public class SameLastDigits {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		if ((a % 10) == (b % 10))  System.out.println("true");
		else System.out.println("false");
	}
}