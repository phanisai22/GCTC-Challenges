package com.JavaFundamentals;

public class Palindrome {
	public static void main(String[] args) {
		int number = Integer.parseInt(args[0]);
		int duplicate = number;
		int reversed = 0;
		int reminder;
		
		while (number > 0) {
			reminder = number % 10;
			reversed = reversed * 10 + reminder;
			number /= 10;
		}
		
		if (duplicate == reversed) System.out.println(duplicate + " is a palindrome");
		else System.out.println(duplicate + " is not a palindrome");
	}
}

