package com.advancedConcepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Laptop implements Comparable<Laptop> {
	private String name;
	private int ram;
	private double price;

	@Override
	public String toString() {
		return "Laptop [name=" + name + ", ram=" + ram + ", price=" + price + "]";
	}

	public Laptop(String name, int ram, double price) {
		super();
		this.name = name;
		this.ram = ram;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

//	@Override
//	public int compareTo(Laptop o) {
//		if (this.getPrice() < o.getPrice()) {
//			return -1;
//		} else if (this.getPrice() > o.getPrice()) {
//			return 1;
//		} else {
//			return 0;
//		}
//	}

	@Override
	public int compareTo(Laptop l) {
		return this.getName().compareTo(l.getName());
	}

}

public class CollectionsDemo21 {
	public static void main(String[] args) {
		System.out.println("main method started");

		Laptop l1 = new Laptop("Lenovo", 16, 59999);
		Laptop l2 = new Laptop("Asus", 8, 50000);
		Laptop l3 = new Laptop("Dell", 4, 55000);
		Laptop l4 = new Laptop("Mac", 4, 159999);
		Laptop l5 = new Laptop("Hp", 8, 65000);

		List<Laptop> lapList = new ArrayList<>();

		lapList.add(l1);
		lapList.add(l2);
		lapList.add(l3);
		lapList.add(l4);
		lapList.add(l5);

		System.out.println(lapList);

		System.out.println("---------------------------------------------");

		for (Laptop lap : lapList) {
			System.out.println(lap);
		}

		System.out.println("---------------------------------------------");

		Collections.sort(lapList);

		for (Laptop lap : lapList) {
			System.out.println(lap);
		}
	}
}
