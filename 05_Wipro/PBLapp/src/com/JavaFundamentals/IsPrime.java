package com.JavaFundamentals;

public class IsPrime {
	public static void main(String[] args) {
		int number = Integer.parseInt(args[0]);

		boolean flag = false;
		
		for(int i = 2; i <= number/2; ++i) {
			if (number % i == 0) {
				flag = true;
				break;
			}
		}
		
		if(flag) System.out.println("Prime");
		else System.out.println("Not a Prime");
		
	}
}
