package com.oops;

public class MethodOverLoading04 {

	void show(Object o) {
		System.out.println("Object method called!! " + o);
	}

	void show(String s) {
		System.out.println("String method called!! " + s);
	}

	void main(String[] args) {
		System.out.println("main method started..");

		show("Java");
		show(null);
	}
}
