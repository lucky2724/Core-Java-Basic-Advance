package com.interfaceDemo;

public class Monkey implements Animal {

	@Override
	public void eat() {
		System.out.println("Monkey Mostly eats Bananas..");
	}

	@Override
	public void sound() {
		System.out.println("Monkey sounds like Oooop oooop...");
	}

	@Override
	public void walk() {
		System.out.println("Monkey can also run and Jump....");
	}

	@Override
	public void sleep() {
		System.out.println("Monkey can never Sleep...");
	}
	
	@Override
	public void run() {
		System.out.println("Monkey Can aslo run but monkey can jumps Mostly....");
	}
}
