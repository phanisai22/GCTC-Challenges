package com.OOPS.StringBuffer;

public class NCopies {
	public static void main(String[] args) {
//		String text = "Wipro";
		String text = "Phani sai";
		int len = text.length();
		
		StringBuffer stringBuffer = new StringBuffer();
		
		for (int i = 0; i < len; i++) {
			stringBuffer.append(text.substring(0, 2));
		}
		
		System.out.println(stringBuffer);
	}
}
