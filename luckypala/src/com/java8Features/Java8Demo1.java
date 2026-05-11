package com.java8Features;

@FunctionalInterface
interface Interf11 {
	void method1();
}

//class Test1 implements Interf1 {
//
//	@Override
//	public void method1() {
//		System.out.println("maethod 1 Called !!");
//	}
//
//}

public class Java8Demo1 {
	public static void main(String[] args) {

//		Test1 t1 = new Test1();
//		t1.method1();

//		Interf11 i1 = new Interf11() {
//
//			@Override
//			public void method1() {
//				System.out.println("method1 called !!");
//			}
//		};
//
//		i1.method1();

		Interf11 i1 = () -> {
			System.out.println("Hello Javaaa 8 !!");
		};

		i1.method1();

	}
}
