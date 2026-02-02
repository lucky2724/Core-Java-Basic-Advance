package com.constructors;

public class Animal {
	String name = "Kitty";
	int age = 3;

	Animal() {
		System.out.println("no arg constructor called from Animal");
	}

	Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {
		System.out.println("main method started from Animal...");
	}
}

class Dog extends Animal {
	// String name;
	Dog() {
		super(); // by default super() access parent class constructor
		System.out.println("No arg constructor called from Dog..");
	}

	Dog(String name) {
		// ny default supe
		super(name, 78);
		this.name = name;
	}

	public static void main(String[] args) {
		System.out.println("main method stated from dog...");

		Dog d1 = new Dog();
		System.out.println(d1.name);
		System.out.println(d1.age);

		Dog d2 = new Dog("Snoopy");
		System.out.println(d2.name);
		System.out.println(d2.age);

	}
}