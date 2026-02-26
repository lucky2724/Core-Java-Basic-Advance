package com.collectionsFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class Mobile {
	private String model;
	private String brand;
	private double price;
	private String color;
	private int ram;

	public Mobile(String model, String brand, double price, String color, int ram) {
		super();
		this.model = model;
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.ram = ram;
	}

	@Override
	public String toString() {
		return "Mobile [model=" + model + ", brand=" + brand + ", price=" + price + ", color=" + color + ", ram=" + ram
				+ "]";
	}

}

public class AddObjectToList {
	public static void main(String[] args) {
		System.out.println("main method started");

		Mobile m1 = new Mobile("9R", "One Plus", 40000.00, "Blue", 32);
		Mobile m2 = new Mobile("10R", "One Plus", 80000.00, "Black", 16);
		Mobile m3 = new Mobile("17 Pro Max", "IPhone", 159990.00, "Natural Titanium", 8);
		Mobile m4 = new Mobile("S-22-Ultra", "Samsung", 90000.00, "White", 64);
		Mobile m5 = new Mobile("Motorola", "Edge-Fusion", 25999.00, "Meroon", 12);

		List<Mobile> mobileList = new ArrayList<>();
		mobileList.add(m1);
		mobileList.add(m2);
		mobileList.add(m3);
		mobileList.add(m4);
		mobileList.add(m5);

		System.out.println(mobileList);

		System.out.println("--------- for each ---------------------");
		System.out.println();

		for (Mobile m : mobileList) {
			System.out.println(m);
		}

		System.out.println("--------- Iterator ---------------------");
		System.out.println();

		Iterator<Mobile> itr = mobileList.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("--------- list Iterator ---------------------");
		System.out.println();

		ListIterator<Mobile> litr = mobileList.listIterator();

		while (litr.hasNext()) {
			System.out.println(litr.next());
		}

		System.out.println("--------- for loop ---------------------");
		System.out.println();
		for (int i = 0; i < mobileList.size(); i++) {
			System.out.println(mobileList.get(i));
		}

//		Mobile[] m = new Mobile[5];
//		m[0] = m1;
//		m[1] = m2;
//		m[2] = m3;
//		m[3] = m4;
//		m[4] = m5;
//
//		for (Mobile li : m) {
//			System.out.println(li);
//		}

	}
}
