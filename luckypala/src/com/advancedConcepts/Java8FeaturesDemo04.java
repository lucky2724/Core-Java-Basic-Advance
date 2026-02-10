package com.advancedConcepts;

interface Interf3 {
	void method1();

	default void hello() {
		System.out.println("hello Default method -> ");
	}
}

//class Test4 implements Interf3 {
//
//	@Override
//	public void method1() {
//		System.out.println("method1 Called from Test4");
//	}
//
//}

//Lambda Expression means : no method name no return type no access modifier

public class Java8FeaturesDemo04 {
	public static void main(String[] args) {
		System.out.println("main method started");

//		Interf3 i3 = new Test4();
//		i3.method1();

		Interf3 i3 = () -> {
			System.out.println("Hello method1");
		};

		i3.method1();
		i3.hello();

		Interf3 i4 = () -> System.out.println("Hello Method1");

		i4.method1();
		i4.hello();

	}
}
