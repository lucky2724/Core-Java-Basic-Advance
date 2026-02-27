package com.collectionsFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Customer {
	private int cid;
	private String cname;
	private int cage;

	public Customer(int cid, String cname, int cage) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cage = cage;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getCage() {
		return cage;
	}

	public void setCage(int cage) {
		this.cage = cage;
	}

	@Override
	public String toString() {
		return "Customer : Id :" + cid + " ,Name :" + cname + " ,Age :" + cage;
	}

}

public class ComparatorDemo {
	public static void main(String[] args) {
		System.out.println("main method started");

		Customer c1 = new Customer(3, "AbhiShek", 26);
		Customer c2 = new Customer(4, "Hardhik", 33);
		Customer c3 = new Customer(1, "Tilak", 25);
		Customer c4 = new Customer(5, "SKY", 29);
		Customer c5 = new Customer(2, "Ishan", 28);

		List<Customer> list = new ArrayList<>();

		list.add(c1);
		list.add(c2);
		list.add(c3);
		list.add(c4);
		list.add(c5);

		for (Customer cust : list) {
			System.out.println(cust);
		}

		System.out.println("================");

		// ANONYMOUS INNER Class
		Comparator<Customer> c = new Comparator<Customer>() {

			@Override
			public int compare(Customer o1, Customer o2) {
//				if (o1.getCage() < o2.getCage())
//					return -1;
//				else if (o1.getCage() > o2.getCage())
//					return 1;
//				else
//					return 0;

				return o1.getCname().compareTo(o2.getCname());
			}

		};

		Collections.sort(list, c);

		for (Customer cust : list) {
			System.out.println(cust);
		}

	}
}
