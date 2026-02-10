package com.advancedConcepts;

@FunctionalInterface
interface Interf2 {
	void addition();

	default void hello() {
		System.out.println("hello");
	}

	static void welcome() {
		System.out.println("Welcome");
	}
}

class Test3 implements Interf2 {

	@Override
	public void addition() {
		System.out.println("addition : " + (10 + 20));
	}

}

public class Java8FeaturesDemo03 {
	public static void main(String[] args) {
		System.out.println("main method started");

		Interf2 t3 = new Test3();
		t3.addition();

	}
}
