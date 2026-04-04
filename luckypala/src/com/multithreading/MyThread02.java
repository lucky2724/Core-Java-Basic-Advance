package com.multithreading;

public class MyThread02 extends Thread {

	@Override
	public void run() {
		System.out.println("Show method started");
		System.out.println("Show thread Info : " + Thread.currentThread());

		for (int i = 0; i <= 50; i++) {
			System.out.println("runw : " + i);
		}

		System.out.println("Show method ended");

	}

	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("main thread Info : " + Thread.currentThread());

		MyThread02 mt = new MyThread02();
		mt.start();

		for (int i = 0; i <= 50; i++) {
			System.out.println("main : " + i);
		}

		System.out.println("main method ended");
	}
}
