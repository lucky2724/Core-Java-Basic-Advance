package com.interfaceDemo;

public interface PetDriver {
	public static void main(String[] args) {
		System.out.println("main method started...");

		PetInfo d = new Dog222();

		System.out.println("======= " + PetInfo.name + " =======");

		d.eat();
		d.run();
		d.walk();
		d.sleep();
		d.hunting();

	}
}
