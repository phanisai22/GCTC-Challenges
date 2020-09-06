package com.oops.volume;

public class Box {
	
	private int width;
	private int height;
	private int depth;
	
	
	public Box(int width, int height, int depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	
	public int calculateVolume() {
		
		int volume = width * height * depth;
		return volume;
	}
	
	
}
