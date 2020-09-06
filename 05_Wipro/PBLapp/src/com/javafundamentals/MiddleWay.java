package com.javafundamentals;

public class MiddleWay {
	public static void main(String[] args) {
		
		if (args.length < 6) {
			System.out.println("Enter 2 arrays with 3 elements each only");
			return;
		}
		
		String[] result = {args[1], args[4]};
		
		System.out.println(result[0] +"\n"+ result[1]);
		
	}
}
