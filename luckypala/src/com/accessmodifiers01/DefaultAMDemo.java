package com.accessmodifiers01;

class DefaultAMDemo {
	int a = 18;
	String name = "Lucky";

	DefaultAMDemo() {
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

	static void main(String[] args) {
		System.out.println("main method started..");

		DefaultAMDemo d = new DefaultAMDemo();

		System.out.println(d.a);
		System.out.println(d.name);
		d.method1();
	}
}
