package com.advancedConcepts;

interface Interf1 {
	public abstract void method1();

	public default void show() {
		System.out.println("Show method called -> default");
	}

	public static void display() {
		System.out.println("Display method called -> static");
	}

}

class Test1 implements Interf1 {

	@Override
	public void method1() {
		System.out.println("Hello method 1 from Test1");
	}

	@Override
	public void show() {
		System.out.println("Show method called from test1=");
	}

}

class Test2 implements Interf1 {

	@Override
	public void method1() {
		System.out.println("Hello method 1 from Test2");
	}

}

public class Java8FeaturesDemo02 {
	public static void main(String[] args) {
		System.out.println("main method started");

		Interf1 i1 = new Test1();
		i1.method1();
		i1.show();
		Interf1.display();

		Interf1 i2 = new Test2();
		i2.method1();
		i2.show();
		Interf1.display();

	}
}
