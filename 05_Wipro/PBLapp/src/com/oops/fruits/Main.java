package com.oops.fruits;

public class Main {
	public static void main(String[] args) {
		Apple apple = new Apple("Apple", "Sweat", 32);
		Orange orange = new Orange("Orange", "Lutris", 22);
		
		apple.eat();
		orange.eat();
	}
}
