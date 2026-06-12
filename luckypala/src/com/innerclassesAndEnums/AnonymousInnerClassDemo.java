package com.innerclassesAndEnums;

class Test {
	void method1() {
		System.out.println("method1 Called ");
	}
}

public class AnonymousInnerClassDemo {
	public static void main(String[] args) {
		System.out.println("main method started");

		// Anonymous Class extebds Test
		Test t = new Test() {
			String name = "Java";

			@Override
			void method1() {
				System.out.println("method 1 Override at Anonymous Class");
				System.out.println("Hello , " + name);
			}

		};

		t.method1();

	}
}
