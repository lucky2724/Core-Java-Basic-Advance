package com.innerclassesAndEnums;

abstract class Animal {
	abstract void sound();
}

public class Outer33 {
	public static void main(String[] args) {

		Animal dog = new Animal() {
			void sound() {
				System.out.println("Bowwww");
			}
		};

		Animal cat = new Animal() {
			void sound() {
				System.out.println("Meowww");
			}
		};

		dog.sound();
		cat.sound();

	}
}
