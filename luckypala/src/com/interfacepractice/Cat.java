package com.interfacepractice;

public class Cat implements Animal {

	@Override
	public void walk() {
		System.out.println("Cat Walking like Cat-Walk....");
	}

	@Override
	public void eat() {
		System.out.println("Cat eat Rats...");
	}

	@Override
	public void sleep() {
		System.out.println("Cat Sleep night mostly..");
	}

	@Override
	public void sound() {
		System.out.println("cat Sound like Meoww...");
	}

}
