package com.operators;

class TestA {

}

class TestB extends TestA {

}

public class InstanceOfOperators2 {
	public static void main(String[] args) {
		System.out.println("main method started..");
		TestA t1 = new TestA();
		TestB t2 = new TestB();

		System.out.println(t1 instanceof TestA); // true
		System.out.println(t1 instanceof TestB); // false
		System.out.println(t2 instanceof TestB); // true
		System.out.println(t2 instanceof TestA); // false

	}
}
