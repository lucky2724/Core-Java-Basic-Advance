package com.interfacepractice;

public class Dog implements Animal {

	@Override
	public void walk() {
		System.out.println("Dog can Walk and Run...");
	}

	@Override
	public void eat() {
		System.out.println("Dog eats Pedigryyyy...");

	}

	@Override
	public void sleep() {
		System.out.println("Dog Sleeps morning Mostly..");

	}

	@Override
	public void sound() {
		System.out.println("Dog Sound Like Boww Boww..");

	}

}
