package com.OOPS.Animals;

public class Main {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.eat();
		animal.sleep();
		
		Bird bird = new Bird();
		bird.eat();
		bird.sleep();
		bird.fly();
	}
}
