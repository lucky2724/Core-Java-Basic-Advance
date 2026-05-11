package com.java8Features;

public class FIwithMutiThreading {

	public static void main(String[] args) {
		System.out.println("main method started");

		Runnable r = () -> {
			for (int i = 0; i <= 10; i++) {
				System.out.println("run : " + i);
			}
		};

		Thread t = new Thread(r);

		t.start();

		for (int i = 10; i <= 20; i++) {
			System.out.println("main : " + i);
		}

		System.out.println("main method ended");

	}

}
