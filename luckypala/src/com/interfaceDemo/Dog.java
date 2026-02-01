package com.interfaceDemo;

public class Dog implements Animal {

	@Override
	public void eat() {
		System.out.println("Dog Eat Non-veg...");
	}

	@Override
	public void sound() {
		System.out.println("Dog Sounds like Boww Bowww..");
	}

	@Override
	public void walk() {
		System.out.println("Dog Walks on road");
	}

	@Override
	public void sleep() {
		System.out.println("Dogs sleep in morning..");

	}

}
