package com.accessmodifiers01;

public class TestAccessDemo1 {

	// Private Data Members
	private int a1 = 10;
	private String name1 = "sachin";

	private void method1() {
		System.out.println("method-1 called..");
	}

//	private TestAccessDemo1() {
//		System.out.println("no-arg constructor called..");
//	}

	// Default data members
	int a2 = 18;
	String name2 = "virat";

	void method2() {
		System.out.println("method-2 called..!");
	}

	static {
		System.out.println("Hello static block");
	}

	{
		System.out.println("Hello instance block");
	}

//	TestAccessDemo1() {
//
//	}

	// public data members
	public int a3 = 45;
	public String name3 = "Rohit Sharma";

	public void method3() {
		System.out.println("method -3 called...");
	}

	public TestAccessDemo1() {
		System.out.println("no-arg constructor callled");
	}

	// protected data members
	protected int a4 = 7;
	protected String name4 = "Mahi";

	protected void method4() {
		System.out.println("method 4 called");
	}

	public static void main(String[] args) {
		System.out.println("main method started..");

		// we can access private data members within the class only ...
		System.out.println("===== private =======");
		TestAccessDemo1 t1 = new TestAccessDemo1();
		System.out.println(t1.a1);
		System.out.println(t1.name1);
		t1.method1();

		System.out.println("===== default =======");

		// we can access default data in class as well as package
		System.out.println(t1.a2);
		System.out.println(t1.name2);
		t1.method2();

		System.out.println("===== public =======");
		System.out.println(t1.a3);
		System.out.println(t1.name3);
		t1.method3();
		
		System.out.println("===== protected =======");
		System.out.println(t1.a4);
		System.out.println(t1.name4);
		t1.method4();
	}
}
