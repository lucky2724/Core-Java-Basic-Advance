package com.innerclassesAndEnums;

public class Outer22 {

	void outerMethod() {
		int num = 100;

		class LocalInner {
			void print() {
				System.out.println("Value : " + num);
			}
		}

		LocalInner li = new LocalInner();
		li.print();
	}

	public static void main(String[] args) {

		Outer22 o1 = new Outer22();
		o1.outerMethod();

	}

}
