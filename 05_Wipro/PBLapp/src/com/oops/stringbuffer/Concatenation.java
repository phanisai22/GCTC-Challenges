package com.oops.stringbuffer;

public class Concatenation {
	public static void main(String[] args) {
		
//		String input1 = "Sachin, Tendulkar";
		String input1 = "Mark, Kate";
		
		int break_point = input1.indexOf(',');
		String result = input1.substring(0, break_point);
		
		if (input1.substring(break_point + 1).toLowerCase().trim().charAt(0) == input1.charAt(break_point - 1)) {
			result += input1.substring(break_point + 3);
		} else {
			result += input1.substring(break_point + 2);
		}
		
		
		System.out.println(result);
		
	}
}
