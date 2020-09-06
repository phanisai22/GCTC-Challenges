package com.javafundamentals;

public class EvenOrOdd {
	public static void main(String[] args){
		int number = Integer.parseInt(args[0]);
		if (number % 2 == 0) System.out.println("even");
		else System.out.println("odd");
	}
}
