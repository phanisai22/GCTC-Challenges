package com.JavaFundamentals;

public class FloydsFormat {
	public static void main(String[] args) {
		
		int len = args.length;
		
		if (len == 0) {
			System.out.println("Please enter an integer number");
			return;
		}
		
		int n = Integer.parseInt(args[0]);

		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
}
