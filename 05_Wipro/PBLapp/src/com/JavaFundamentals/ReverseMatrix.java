package com.JavaFundamentals;

public class ReverseMatrix {
	public static void main(String[] args) {
		if (args.length < 4) {
			System.out.println("Please enter 4 integer numbers");
			return;
		}
		String[][] result = new String[2][2];
		int k = args.length - 1;
		
		for(int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				result[i][j] = args[k];
				k--;
			}
		}
		
		for(int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	}
}
