package com.java8Features;

class TestA {
	void taste() {
		System.out.println("Biryani is Too Spicyy !!");
	}
}

public class AnonymosInnerClassDemo {
	public static void main(String[] args) {
		System.out.println("main method started");

		TestA a = new TestA() {
			
			@Override
			void taste() {
				System.out.println("Biryani is not Spicyy !!");
			}

		};

		a.taste();

	}
}
