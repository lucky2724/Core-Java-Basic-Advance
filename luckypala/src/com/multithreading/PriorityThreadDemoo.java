package com.multithreading;

public class PriorityThreadDemoo extends Thread {

	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("run : " + i);
//			Thread.currentThread().setPriority(MAX_PRIORITY);

		}
	}

	public static void main(String[] args) {
		System.out.println("main method started!!");

		PriorityThreadDemoo t = new PriorityThreadDemoo();
		t.start();

		for (int i = 0; i <= 10; i++) {
			System.out.println("main : " + i);
			Thread.currentThread().setPriority(MIN_PRIORITY);
//			Thread.currentThread().setPriority(100); //java.lang.IllegalArgumentException

		}

		System.out.println("main method ended!!");
	}
}
