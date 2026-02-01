package com.oops;

//class TestA {
//	void method1() {
//
//	}
//}
//
//class TestB extends TestA {
//	// method overloading
//	void method1(int a) {
//
//	}
//}

public class MethodOverLoading05 {
	// var arg methods
	void addition(String s, int... a) {
		int sum = 0;

		for (int num : a) {
			sum = sum + num;
		}

		System.out.println("Sum : " + s + " " + sum);
	}

	void hello(String... names) {
		System.out.println("******************");
		for (String name : names) {
			System.out.println(name);
		}
	}

	void main(String[] args) {
		System.out.println("main method started..");
		addition("->");
		addition("->", 10);
		addition("->", 10, 20);
		addition("->", 10, 20, 30);
		addition("->", 10, 20, 30, 40);
		addition("->", 10, 20, 30, 40, 50);
		addition("->", 10, 20, 30, 40, 50, 60);

		System.out.println("==== Strings ====");

		hello();
		hello("lucky");
		hello("lucky", "Surya");
		hello("lucky", "Surya", "Ram");
		hello("lucky", "Surya", "Ram", "raju");
	}
}
