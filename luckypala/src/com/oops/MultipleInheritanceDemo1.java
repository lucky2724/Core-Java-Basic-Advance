package com.oops;

interface In1 {
	void method1();

	void method2();
	
	default void method4() {
		System.out.println("Method 4 from In1");
	}
}

interface In2 {
	void method2();

	void method3();
	
	default void method4() {
		System.out.println("Method 4 from In2");
	}
}

interface In3 extends In1, In2 {

	@Override
	default void method4() {
		// TODO Auto-generated method stub
		In1.super.method4();
	}
	
}

class TestIn1 implements In3 {

	@Override
	public void method1() {
		System.out.println("method - 1 called ");
	}

	@Override
	public void method2() {
		System.out.println("method - 2 called ");
	}

	@Override
	public void method3() {
		System.out.println("method - 3 called ");
	}

}

public class MultipleInheritanceDemo1 {
	public static void main(String[] args) {
		System.out.println("main method started..");

		In3 t = new TestIn1();
		t.method1();
		t.method2();
		t.method3();
		t.method4();
	}
}
