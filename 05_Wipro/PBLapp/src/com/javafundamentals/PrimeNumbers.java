package com.javafundamentals;

public class PrimeNumbers {
	public static void main(String[] args) {
		int start = 10;
		int end = 99;
		boolean flag;
		
		for (int num = start; num <= end; ++num) {
			flag = false;
			
			for (int i = 2; i < num / 2; ++i) {
				if (num % i == 0) {
					flag = true;
					break;
				}
			}
			
			if(!flag) {
				System.out.println(num);
				flag = false;
			}
		}
	}
}
