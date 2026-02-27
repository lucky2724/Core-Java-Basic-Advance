package com.collectionsFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Product implements Comparable<Product> {
	int pid;
	String pname;
	double price;

	public Product(int pid, String pname, double price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}

	@Override
	public String toString() {
		return "[Product : Id :" + pid + " ,Name :" + pname + " ,Price :" + price + " ]";
	}

	@Override
	public int compareTo(Product o) {

//		if (this.price < o.price) {
//			return -1;
//		} else if (this.price > o.price) {
//			return 1;
//		} else {
//			return 0;
//		}

		return this.pid - o.pid;

//		return this.pname.compareTo(o.pname);

	}

}

public class ComparableDemo {
	public static void main(String[] args) {
		System.out.println("main method started");

		Product p1 = new Product(5, "IPhone", 89000);
		Product p2 = new Product(4, "Samsung", 50000);
		Product p3 = new Product(3, "OnePlus", 65000);
		Product p4 = new Product(1, "IQ", 35000);
		Product p5 = new Product(2, "NOTHING", 99000);
		Product p6 = new Product(3, "RealMe", 19000);

		List<Product> list = new ArrayList<>();

		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		list.add(p6);

		for (Product p : list) {
			System.out.println(p);
		}

		System.out.println("==========================");

		Collections.sort(list);

		for (Product p : list) {
			System.out.println(p);
		}

		System.out.println("**************************************************");

		List<Integer> li = Arrays.asList(8, 7, 7, 89, 3, 4, 5);

		Collections.sort(li);

		System.out.println("----------------");

		for (int i : li) {
			System.out.println(i);
		}

	}
}
