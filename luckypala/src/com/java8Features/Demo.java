package com.java8Features;


@FunctionalInterface
interface In1 {
	public abstract void method1();

	public default void method2() {
		System.out.println("Method 2 Called !!");
	}

}

public class Demo {
	public static void main(String[] args) {

		System.out.println("main method started ");

		In1 i1 = () -> {
			System.out.println("Method 1 implemented Succesfully !!");
		};

		i1.method1();
		i1.method2();
	}
}
