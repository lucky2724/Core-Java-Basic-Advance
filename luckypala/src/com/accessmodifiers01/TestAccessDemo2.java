package com.accessmodifiers01;

public class TestAccessDemo2 {
	public static void main(String[] args) {
		System.out.println("main method started..");

		// whenever our data is private we can not access out side of the class
		// if constructors are private can not create objects outside of the class
//		TestAccessDemo1 t1 = new TestAccessDemo1();
//		System.out.println(t1.a1);
//		System.out.println(t1.name1);
//		t1.method1();

		//default data members are access within the package and within the class 
		TestAccessDemo1 t1 = new TestAccessDemo1();
		System.out.println(t1.a2);
		System.out.println(t1.name2);
		t1.method2();
	}
}
