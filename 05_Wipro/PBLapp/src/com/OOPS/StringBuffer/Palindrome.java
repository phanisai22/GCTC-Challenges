package com.OOPS.StringBuffer;

public class Palindrome {
	
	public static void main(String[] args) {
		
		String text = "Malayalam";
		int len = text.length();
		String reverse = "";
		
		for (int i = len - 1; i >= 0; i--) {
			reverse += text.charAt(i);
		}
			
		if (text.equalsIgnoreCase(reverse)) System.out.println("Palindrome");
		else System.out.println("Not a palindrome");
		
	}

}
