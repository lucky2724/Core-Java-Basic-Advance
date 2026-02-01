package com.interfaceDemo;

public interface Animal {

	public static String orgName = "VSS";

	public abstract void eat();

	public abstract void sound();

	void walk();

	void sleep();

	default void run() {
		System.out.println("Most of the animals Can run..");
	}

	default void swim() {
		System.out.println("Some of the animals can Swim..");
	}

	static void breath() {
		System.out.println("Every animal  can  must breath to survival");
	}

	default void hello() {
		haii();
	}

	private void haii() {
		System.out.println("HAIIII");
		System.out.println("HAIIII");
		System.out.println("HAIIII");
		System.out.println("HAIIII");
		System.out.println("HAIIII");
	}

	public static void main(String[] args) {

		System.out.println("Helloo Java World !!");

		breath();
		
	}

}
