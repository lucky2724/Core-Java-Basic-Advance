package com.advancedConcepts;

public class MultiThreading01 {
	void show() {
		System.out.println("Good Morning,Have a nice day!!");
	}

	public static void main(String[] args) {
		System.out.println("main method started");

		MultiThreading01 m = new MultiThreading01();

		m.show();

		System.out.println("Name of the Thread : " + Thread.currentThread());
		System.out.println("Name of the Thread : " + Thread.currentThread().getName());

		System.out.println("main method ended");
		
	}
}
