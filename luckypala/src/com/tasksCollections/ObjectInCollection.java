package com.tasksCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Laptop implements Comparable<Laptop> {
	private int id;
	private String brand;
	private int ram;
	private double price;

	public Laptop(int id, String brand, int ram, double price) {
		super();
		this.id = id;
		this.brand = brand;
		this.ram = ram;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
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

	@Override
	public String toString() {
		return "Laptop : " + id + " " + brand + " " + ram + " " + price;
	}

	@Override
	public int compareTo(Laptop l) {

		if (this.getPrice() < l.getPrice()) {
			return -1;
		} else if (this.getPrice() > l.getPrice()) {
			return 1;
		} else {
			return 0;
		}

//		return (int) (this.getPrice() - l.getPrice());

	}

}

public class ObjectInCollection {
	public static void main(String[] args) {
		System.out.println("main method started");

		Laptop l1 = new Laptop(101, "LENOVO", 16, 59999);
		Laptop l2 = new Laptop(102, "MAC", 16, 89999);
		Laptop l3 = new Laptop(103, "HP", 12, 45999);
		Laptop l4 = new Laptop(104, "LENOVO IQ", 24, 99999);
		Laptop l5 = new Laptop(105, "DELL", 16, 79999);

		List<Laptop> li = new ArrayList<>();

		li.add(l1);
		li.add(l2);
		li.add(l3);
		li.add(l4);
		li.add(l5);

		for (Laptop l : li) {
			System.out.println(l);
		}

		Collections.sort(li);

		System.out.println("-----------------------------------");

		for (Laptop l : li) {
			System.out.println(l);
		}

	}

}
