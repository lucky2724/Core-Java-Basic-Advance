package com.interfaceDemo;

public class Dog222 implements PetInfo {

	@Override
	public void eat() {
		System.out.println("DOG can Eat...");
	}

	@Override
	public void walk() {
		System.out.println("DOG  can walk...");
	}

	@Override
	public void sleep() {
		System.out.println("DOG  can Sleep..");
	}

	@Override
	public void run() {
		System.out.println("DOG  can run..");
	}

	@Override
	public void hunting() {
		System.out.println("DOG  can hunting rats..");
	}

}
