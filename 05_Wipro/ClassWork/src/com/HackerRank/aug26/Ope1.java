package com.HackerRank.aug26;

import java.util.Scanner;

public class Ope1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String exp = sc.next();
		int result = 0;
		
		for (int i = 0; i < exp.length() - 1; i++) {
			if (exp.charAt(i) == '+' || exp.charAt(i) == '-' || exp.charAt(i) == '*' || exp.charAt(i) == '/') {
				result += switch_case(exp.charAt(i), result, (int) exp.charAt(i + 1) - '0');
			}
		}
		
		System.out.println(result);
		
		sc.close();
	}
	
	public static int switch_case(char c, int x, int y) {
			
		switch(c) {
		case '+':
			return x + y;
		case '-':
			return x - y;
		case '*':
			return x * y;
		case '/':
			return (int)(x / y);
		default: return x;
		}
		
	}
}
