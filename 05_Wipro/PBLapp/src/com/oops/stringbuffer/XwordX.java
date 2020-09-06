package com.oops.stringbuffer;

public class XwordX {
	public static void main(String[] args) {
//		String text = "xHix";
		String text = "India";
		
		if (text.indexOf('x') == 0 && text.indexOf('x', 1) == text.length() - 1) {
			System.out.println(text.substring(1, text.length() - 1));
		} else {
			System.out.println(text);
		}
	}
}
