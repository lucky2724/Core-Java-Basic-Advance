package com.oopsPractice;

public class TestDriver {
	public static void main(String[] args) {
		System.out.println("main method strated...");

		System.err.println("=======! Student Details !=======");
		TestAbs s = new TestStudent();
		s.lucky();
		s.bhaii();
		s.tharun();

		System.err.println("=======! Employee Details !=======");
		TestAbs e = new TestEmp();
		e.lucky();
		e.babu();
		e.durga();
		e.bhaii();
		e.tharun();
	}
}
