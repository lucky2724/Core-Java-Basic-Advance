package com.java8Features;

@FunctionalInterface
interface Interf3 {
	void hello(String s);
}

public class DemoWith1Arg {
	public static void main(String[] args) {
		System.out.println("main method started");

		Interf3 i3 = s -> System.out.println("Hello " + s);

		i3.hello("Srikanth");
	}
}
