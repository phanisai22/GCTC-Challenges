package com.JavaFundamentals;

public class MaxInMatrix {
	public static void main(String[] args) {
		if(args.length < 9) {
			System.out.println("Please enter 9 Integer numbers");
			return;
		}
		
		int k = 1, l = 0;
		int max = Integer.parseInt(args[0]);

		System.out.println("Given array is:");
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if(Integer.parseInt(args[k]) > max) {
					max = Integer.parseInt(args[k]);
					k++;
				}
				System.out.print(args[l] + " ");
				l++;
			}
			System.out.println();
		}
		System.out.println("The biggest number in the given array "+ max);
	}
}
