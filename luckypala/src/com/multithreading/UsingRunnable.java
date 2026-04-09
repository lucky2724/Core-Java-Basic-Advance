package com.multithreading;

public class UsingRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("run method started");

		Thread.currentThread().setName("Show Thread !!!!");
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread());

		for (int i = 0; i <= 20; i++) {
			System.out.println("run : " + i);
		}

		System.out.println("run method ended");

	}

	public static void main(String[] args) {
		System.out.println("main method started");

		UsingRunnable t = new UsingRunnable();

		Thread t1 = new Thread(t);
		t1.start();

		Thread.currentThread().setName("Main Thread !!!!!!!!!!!!!!!!!");
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread());


		for (int i = 0; i <= 20; i++) {
			System.out.println("main : " + i);
		}

		System.out.println("main method eneded");
	}

}
