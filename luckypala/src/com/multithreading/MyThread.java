package com.multithreading;

public class MyThread extends Thread {

	@Override
	public void run() {

		System.out.println("Show method Started");
		System.out.println(Thread.currentThread());

		for (int i = 6; i <= 10; i++) {
			System.out.println("run :" + i);
			System.out.println("--------------");
		}

		System.out.println("Show method ended");
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println(Thread.currentThread());

		MyThread mt = new MyThread();
		mt.start();

		for (int i = 1; i <= 5; i++) {
			System.out.println("main :" + i);
		}

		System.out.println("main method ended");
	}
}
