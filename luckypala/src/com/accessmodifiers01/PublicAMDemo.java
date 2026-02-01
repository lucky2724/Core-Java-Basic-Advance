package com.accessmodifiers01;

public class PublicAMDemo {
	public int a = 45;
	public String name = "HIT-MAN ";

	public PublicAMDemo() {
		System.out.println("no-arg constructor called..");
	}

	public void method2() {
		System.out.println("method 2 called..!");
	}

	static {
		System.out.println("static 2 block called..");
	}

	{
		System.out.println("instance 2 block called..");
	}

	public static void main(String[] args) {
		System.out.println("main method started...");

		PublicAMDemo p = new PublicAMDemo();
		System.out.println(p.name);
		System.out.println(p.a);
		p.method2();

	}
}
