package com.advancedConcepts;

class MyThread extends Thread {
	@Override
	public void run() {
		Thread.yield();
		for (int i = 0; i <= 50; i++) {
			System.out.println("run -> " + i);
		}
	}
}

public class MultiThreading08 {
	public static void main(String[] args) {
		System.out.println("main method started");

		MyThread m5 = new MyThread();
		m5.start();

		for (int i = 50; i <= 100; i++) {
			System.out.println("main Thread -> " + i);
		}
	}
}
