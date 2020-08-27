package com.JavaFundamentals;

public class CommandLineArgCheck {
	public static void main(String[] args) {
		int len = args.length;
		if (len == 0) System.out.println("No Values");
		else for (String item : args) System.out.print(item+", ");
	}
}
