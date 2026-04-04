package com.multithreading;

public class MultiThreading01 {
	public static void main(String[] args) {
		System.out.println("main method started");

		System.out.println(Thread.currentThread());
		System.out.println(Thread.currentThread().getName());

		System.out.println("main method ended");

	}
}
