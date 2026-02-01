package com.interfaceDemo;

public class Cat implements Animal {

	@Override
	public void eat() {
		System.out.println("cat can eat rats..");
	}

	@Override
	public void sound() {
		System.out.println("cat can sound like MEoww..");
	}

	@Override
	public void walk() {
		System.out.println("cat can walk cat-walk..");
	}

	@Override
	public void sleep() {
		System.out.println("cat can sleep nights..");
	}

	@Override
	public void swim() {
		System.out.println("Cats Can not Swim..");
	}
	
	//@Override
	static void breath() {
		System.out.println("Cat breaths.s...");
	}

}
