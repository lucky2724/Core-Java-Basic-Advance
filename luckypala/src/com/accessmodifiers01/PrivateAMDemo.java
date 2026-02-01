package com.accessmodifiers01;

public class PrivateAMDemo {
	int a = 18;
	String name = "Lucky";

	private PrivateAMDemo() {
		System.out.println("no-arg constructor called..");
	}

	private void method1() {
		System.out.println("method 1 called..!");
	}

	static {
		System.out.println("static block called..");
	}

	{
		System.out.println("instance block called..");
	}

	public static void main(String[] args) {
		System.out.println("main method started..");

		PrivateAMDemo p1 = new PrivateAMDemo();
		System.out.println(p1.a);
		System.out.println(p1.name);
		p1.method1();

	}
}
