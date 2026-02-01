package com.oops;

//Implicit Single Inheritance
class Animal {

	String name = "puppy";
	int age = 15;

	void animalInfo() {
		System.out.println("Every Animal can run and also walk..");
	}

	void sound() {
		System.out.println("Every Animal can Sound !!");
	}

}

class Dog extends Animal {

	String name = "Chimtu";
	int age = 10;

	@Override
	void sound() {
		System.out.println("BOWW BOWW !!");
	}

	void show() {
		System.out.println(super.name);
		System.out.println(super.age);
		super.sound();
	}
}

class BabyDog extends Dog {
	
}

//driver class
public class InheritanceTypes {
	public static void main(String[] args) {
		System.out.println("main method started");

		Dog d = new Dog();
		d.sound();
		d.animalInfo();

		System.out.println(d.name);
		System.out.println(d.age);
		d.show();
		
		System.out.println("***************************");
		BabyDog bd=new BabyDog();
		bd.sound();
		bd.animalInfo();
		bd.show();

	}
}
