package com.interfacepractice;

public class Goat implements Animal {

	@Override
	public void walk() {
		System.out.println("Goat walks Slowlyyyyyy...");

	}

	@Override
	public void eat() {
		System.out.println("Goat can eat Grass..");

	}

	@Override
	public void sleep() {
		System.out.println("Goat Sleeps daily twice");

	}

	@Override
	public void sound() {
		System.out.println("Goat can sounds Mehhh...Mehhh...");

	}

	@Override
	public void run() {
		System.out.println("Goat runs Slowly with some fear..");
	}

	@Override
	public void hello() {
		System.out.println("Haii Luuckyyy palaaa .../////");
	}

}
