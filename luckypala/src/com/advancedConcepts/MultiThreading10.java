package com.advancedConcepts;

class Resource {
	int i = 0;
	boolean status = false;

	synchronized void put(int i) throws InterruptedException {
		while (status) {
			wait();
		}
		this.i = i;
		System.out.println("Put : " + i);
		status = true;
		notify();
	}

	synchronized void get() throws InterruptedException {
		while (!status) {
			wait();
		}
		System.out.println("get : " + i);
		status = false;
		notify();
	}
}

class Producer implements Runnable {

	Resource r1;

	Producer(Resource r1) {
		this.r1 = r1;
		Thread t = new Thread(this, "Producer");
		t.start();
	}

	@Override
	public void run() {
		int i = 0;
		while (true) {
			try {
				r1.put(i++);
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

class Consumer implements Runnable {
	Resource r1;

	Consumer(Resource r1) {
		this.r1 = r1;
		Thread t = new Thread(this, "Consumer");
		t.start();
	}

	@Override
	public void run() {
		while (true) {

			try {
				r1.get();
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

public class MultiThreading10 {
	public static void main(String[] args) {
		System.out.println("main method started");

		Resource r1 = new Resource();

		new Producer(r1);// create object for producer

		new Consumer(r1);// create object for consumer

	}
}
