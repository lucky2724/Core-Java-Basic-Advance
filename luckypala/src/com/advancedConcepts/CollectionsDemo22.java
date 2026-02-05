package com.advancedConcepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class Mobile {

	private String name;
	private String model;
	private double price;
	private int ram;

	@Override
	public String toString() {
		return "Mobile [name=" + name + ", model=" + model + ", price=" + price + ", ram=" + ram + "]";
	}

	public Mobile(String name, String model, double price, int ram) {
		super();
		this.name = name;
		this.model = model;
		this.price = price;
		this.ram = ram;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

}

public class CollectionsDemo22 {
	public static void main(String[] args) {
		System.out.println("main method started");

		Mobile m1 = new Mobile("One Plus", "9R", 45000, 16);
		Mobile m2 = new Mobile("One Plus", "10T", 65000, 16);
		Mobile m3 = new Mobile("Iphone", "17 pro max", 175000, 8);
		Mobile m4 = new Mobile("Iphone", "12", 55000, 4);
		Mobile m5 = new Mobile("Samsung", "S22", 119000, 12);

		List<Mobile> mobileList = new ArrayList<>();

		mobileList.add(m1);
		mobileList.add(m2);
		mobileList.add(m3);
		mobileList.add(m4);
		mobileList.add(m5);

		System.out.println(mobileList);

		System.out.println("-------------------------------------------------------");

		Iterator<Mobile> itr = mobileList.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// Anonymous inner class implements Comparator
		Comparator<Mobile> cmp = new Comparator<>() {

			@Override
			public int compare(Mobile o1, Mobile o2) {
				if (o1.getPrice() < o2.getPrice()) {
					return -1;
				} else if (o1.getPrice() > o2.getPrice()) {
					return 1;
				} else {
					return 0;
				}
				// return o1.getName().compareTo(o2.getName());
			}
		};

		Collections.sort(mobileList, cmp);

		System.out.println("-------------------------------------------------------");

		Iterator<Mobile> itr2 = mobileList.iterator();

		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}

	}
}
