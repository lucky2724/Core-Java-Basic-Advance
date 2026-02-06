package com.advancedConcepts;

public class MultiThreading02 extends Thread {
	@Override
	public void run() {
		System.out.println("Child Thread Started..");

		for (int i = 0; i < 10; i++) {
			System.out.println("Hello !! - "+i);
		}

		System.out.println("Child thread Ended..");
	}

	public static void main(String[] args) {
		System.out.println("main method started");

		MultiThreading02 m1 = new MultiThreading02();
		m1.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("main ## - "+i);
		}

		System.out.println("main method ended");
	}
}
