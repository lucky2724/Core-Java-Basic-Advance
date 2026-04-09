package com.multithreading;

public class DemonThreadDemo extends Thread {

	@Override
	public void run() {
		
		for (int i = 0; i <= 2; i++) {
			System.out.println("run : " + i);
		}
	}

	public static void main(String[] args) {
		System.out.println("main method started");

		DemonThreadDemo dt = new DemonThreadDemo();
		dt.setDaemon(true);
		System.out.println(dt.isDaemon());
		dt.start();

		for (int i = 0; i <= 2; i++) {
			System.out.println("main : " + i);
		}

		System.out.println("main method ended");
	}
}
