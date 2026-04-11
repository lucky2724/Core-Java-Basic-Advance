package com.multithreading;

public class SleepDemo extends Thread {
	@Override
	public void run() {
		System.out.println("run Thread Priority : " + Thread.currentThread().getPriority());

		for (int i = 0; i <= 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.err.println(e.getMessage());
			}
			System.out.println("run : " + i);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		System.out.println("main method started");

		SleepDemo t = new SleepDemo();
		t.start();
		t.interrupt();

		System.out.println("main Thread Priority : " + Thread.currentThread().getPriority());
		for (int i = 0; i <= 10; i++) {
			System.out.println("main : " + i);
		}

		System.out.println("main method ended");

	}
}
