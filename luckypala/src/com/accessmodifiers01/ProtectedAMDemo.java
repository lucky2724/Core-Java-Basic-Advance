package com.accessmodifiers01;

public class ProtectedAMDemo {
	protected int a = 33;
	String name = "Hardhik Pandya";

	protected ProtectedAMDemo() {
		System.out.println("no-arg constructor called..");
	}

	void method1() {
		System.out.println("method 1 called..!");
	}

	static {
		System.out.println("static block called..");
	}

	{
		System.out.println("instance block called..");
	}

	public static void main(String[] args) {
		System.out.println("main method started");

		ProtectedAMDemo p1 = new ProtectedAMDemo();
		System.out.println(p1.a);
		System.out.println(p1.name);
		p1.method1();
	}
}
