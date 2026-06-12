package com.innerclassesAndEnums;

public class Outer {
	private String msg = "Hello From Outer";

	class Inner {
		void showMessage() {
			System.out.println(msg);
		}
	}

	public static void main(String[] args) {

		Outer.Inner i1 = new Outer().new Inner();
		i1.showMessage();

	}
}
