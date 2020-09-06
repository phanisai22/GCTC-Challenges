package com.javafundamentals;

public class ReverseNumber {
	public static void main(String[] args) {	
		int number = Integer.parseInt(args[0]);
		int result = 0;
		int reminder;
		
		while (number > 0) {
			reminder = number % 10;
			result = result * 10 + reminder;
			number /= 10;
		}

		System.out.println(result);
	}
}
