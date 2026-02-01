package com.interfaceDemo;

public class AnimalDriver {
	public static void main(String[] args) {
		System.out.println("main method started");

		// can not create object for interface
		// Animal a1 = new Animal();

		System.out.println("==== Cat Info =====");
		Animal c = new Cat();
		c.eat();
		c.sound();
		c.walk();
		c.sleep();
		c.run();
		c.swim();
		// c.breath(); can not call static methods with object name
		Animal.breath();
		Cat.breath();
		c.hello();

		System.out.println("==== Dog Info =====");
		Animal d = new Dog();
		d.eat();
		d.sound();
		d.walk();
		d.sleep();
		d.run();
		d.swim();
		Animal.breath();
		d.hello();

		System.out.println("==== Monkey Info =====");
		Animal m = new Monkey();
		m.eat();
		m.sound();
		m.walk();
		m.sleep();
		m.run();
		m.swim();
		Animal.breath();
		m.hello();
	}
}
