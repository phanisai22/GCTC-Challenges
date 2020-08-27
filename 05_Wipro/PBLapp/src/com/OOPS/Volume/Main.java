package com.OOPS.Volume;

public class Main {
	public static void main(String[] args) {
		Box box = new Box(23, 22, 45);
		int volume = box.calculateVolume();
		
		System.out.println(volume);
	}
}
