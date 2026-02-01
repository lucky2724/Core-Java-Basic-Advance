package com.interfacepractice;

public class AnimalDriverclass {
	public static void main(String[] args) {
		System.out.println("main method started");

		System.out.println("====== CAT Information ====");
		Animal c = new Cat();
		c.eat();
		c.walk();
		c.sound();
		c.sleep();
		c.run();
		Animal.breath();
		c.hello();
		System.out.println("============================");

		System.out.println("====== DOG Information ====");
		Animal d = new Dog();
		d.eat();
		d.walk();
		d.sound();
		d.sleep();
		d.run();
		Animal.breath();
		System.out.println("============================");

		System.out.println("====== GOAT Information ====");
		Animal g = new Goat();
		g.eat();
		g.walk();
		g.sound();
		g.sleep();
		g.run();
		Animal.breath();
		g.hello();
		System.out.println("============================");
	}
}
