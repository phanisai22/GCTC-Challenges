package com.OOPS.Fruits;

public class Fruit {
	String name;
	String taste;
	int size;
	
	
	public Fruit(String name, String taste, int size) {
		super();
		this.name = name;
		this.taste = taste;
		this.size = size;
	}

	public void eat() {
		System.out.println("Name : "+this.name+" \t Taste : "+this.taste);
	}
}
