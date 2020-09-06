package com.oops.stringbuffer;

public class RepeatNOfLastN {
	public static void main(String[] args) {
		int len = args[0].length();
		int n = Integer.parseInt(args[1]);
		
		if (n > len) {
			return;
		}
		
		String repeat = args[0].substring(len - n);
		
		for (int i = 0; i < n; i++) {
			System.out.print(repeat);
		}
		
	}
}
