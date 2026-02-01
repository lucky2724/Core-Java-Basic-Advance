package com.oops;

abstract class TestA {
	abstract void method1();
}

class TestB extends TestA {

	@Override
	void method1() {
		System.out.println("Test B class");
	}
}

abstract class TestC extends TestB {
	@Override
	void method1() {
		System.out.println("test C class");
	}
}

public class Testdemo2 {
	public static void main(String[] args) {

	}
}
