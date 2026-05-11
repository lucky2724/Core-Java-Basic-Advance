package com.java8Features;

@FunctionalInterface
interface Interf5 {
	void method5();
}

interface Interf6 extends Interf5 { // NOT A FUNCTIONAL INTERFACE
	void method6();
}

public class FunctionalInterfaceDemo {
	public static void main(String[] args) {
		System.out.println("main method started");

	}
}
