package com.practVcube;

class Parent {
	String name = "Parent";
}

class Child extends Parent {
	String name = "Child";

	void show() {
		System.out.println(name);
		System.out.println(super.name);
	}
}

public class Main2 {
	public static void main(String[] args) {
		Child c = new Child();

		c.show();
	}
}
