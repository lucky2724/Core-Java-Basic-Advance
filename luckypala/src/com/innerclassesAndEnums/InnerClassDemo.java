package com.innerclassesAndEnums;

class Outer1 {
	int id = 123;

	class Inner1 {

		void display() {
			System.out.println("disply method called " + id);
		}
	}
}

//Driver class
public class InnerClassDemo {
	public static void main(String[] args) {

		System.out.println("main method started");

		Outer1 t1 = new Outer1();
		System.out.println(t1.id);

		Outer1.Inner1 t2 = t1.new Inner1();
		Outer1.Inner1 t3 = new Outer1().new Inner1();
		t3.display();
		t2.display();

	}
}
