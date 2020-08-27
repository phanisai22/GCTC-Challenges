package com.OOPS.StringBuffer;

public class CharCombination {
	public static void main(String[] args) {
		int len1 = args[0].length();
		int len2 = args[1].length();
		
		StringBuffer result = new StringBuffer();
		
		for (int i = 0, j = 0; i < len1 || j < len2; i++, j++) {
			if (i < len1 && j < len2) {
				result.append(args[0].charAt(i));
				result.append(args[1].charAt(j));
				continue;
			} 
			
			if ( i < len1) {
				result.append(args[0].charAt(i));
			} else {
				result.append(args[1].charAt(j));
			}
		}
		
		System.out.println(result);
		
	}
}
