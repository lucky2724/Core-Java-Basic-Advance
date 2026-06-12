package com.innerclassesAndEnums;

public class Outer11 {

	private static String msg = "Hello from Static Nested Class";

	static class Nested {
		void display() {
			System.out.println(msg);
		}
	}

	public static void main(String[] args) {

		Outer11.Nested n1 = new Outer11.Nested();
		
		n1.display();

	}
}
