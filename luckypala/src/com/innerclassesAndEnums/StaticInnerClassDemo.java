package com.innerclassesAndEnums;

class Outer2 {
	static String name = "V-Cube";

	static class Inner2 {

		void show() {
			System.out.println("Show method called " + name);
		}
	}
}

public class StaticInnerClassDemo {
	public static void main(String[] args) {
		System.out.println("main method started");

		Outer2.Inner2 t2 = new Outer2.Inner2();
		System.out.println(Outer2.name);
		t2.show();

		System.out.println("main method ended");
	}
}
