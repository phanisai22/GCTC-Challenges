package com.OOPS.StringBuffer;

public class FirstHalf {
	public static void main(String[] args) {
//		String text = "tomcat";
		String text = "Apron";
		int len = text.length();
		
		if (len % 2 == 0) {
			System.out.println(text.substring(0, (int)len/2));
		} else {
			System.out.println("null");
		}
	}
}
