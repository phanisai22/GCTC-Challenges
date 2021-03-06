package com.oops.stringbuffer;

public class CharAsteriskChar {
	public static void main(String[] args) {
		int index = args[0].indexOf('*');
		
		if (index == -1) {
			return;
		} 
		
		StringBuffer result = new StringBuffer();
		
		if (index == 0) {
			result.append(args[0].substring(2));
		} else {
			result.append(args[0].substring(0, index - 1));
			result.append(args[0].substring(index + 2));
		}
		
		System.out.println(result);
	}
}
