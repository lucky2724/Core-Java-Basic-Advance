package com.practVcube;

interface I1 {
	public default void show() {
		System.out.println("Default Show from I1");
	}

	public static void display() {
		System.out.println("Static  Display from I1");
	}

	@SuppressWarnings("unused")
	private void view() {
		System.out.println("Private View from I1");
	}

	void lucky();

}

interface I2 extends I1 {

	public default void show() {
		System.out.println("Default Show from I2");
	}

	@SuppressWarnings("unused")
	private void display() {
		System.out.println("private   Display from I2");
	}

	public static void view() {
		System.out.println("static View from I2");
	}

	void lucky();

}

public class Bob implements I1, I2 {

	public static void main(String[] args) {

		Bob b = new Bob();
		b.show();
		b.lucky();

		I2 i = new Bob();
		i.show();
		I1.display();
		I2.view();

	}

	@Override
	public void lucky() {
		System.out.println("Lucky Implements !!");
	}

}
