package com.multithreading;

public class YieldDemo extends Thread {

	@Override
	public void run() {
		System.out.println("run Thread Priority : " + Thread.currentThread().getPriority());

		for (int i = 0; i <= 10; i++) {
			Thread.yield();
			System.out.println("run : " + i);
		}
	}

	public static void main(String[] args) {
		System.out.println("main method started");

		YieldDemo t = new YieldDemo();
		t.start();

		System.out.println("main Thread Priority : " + Thread.currentThread().getPriority());
		for (int i = 0; i <= 10; i++) {
			System.out.println("main : " + i);
		}

		System.out.println("main method ended");

	}
}
