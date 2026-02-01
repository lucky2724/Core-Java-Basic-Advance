package com.interfacepractice;

public interface Animal {
	String org = "VSS";

	public abstract void walk();

	public abstract void eat();

	void sleep();

	void sound();

	default void run() {
		System.out.println("Some Animals Can also Run...");
	}

	static void breath() {
		System.out.println("All animals can breath..");
	}

	private void haii() {
		System.out.println("HELLooooo");
		System.out.println("HELLooooo");
		System.out.println("HELLooooo");
		System.out.println("HELLooooo");
	}

	default void hello() {
		haii();
	}

}
