package com.oopsPractice;

class Student1 implements Cloneable {
	int sid;
	String name;
	Address address;

	public Student1(int sid, String name, Address address) {
		this.sid = sid;
		this.name = name;
		this.address = address;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}

class Address {
	String city;

	public Address(String city) {
		this.city = city;
	}

}

public class ShallowCopy {
	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("main method started");

		Address add = new Address("Hyderabad");

		Student1 s1 = new Student1(1, "Lucky", add);

		System.out.println(s1.sid);
		System.out.println(s1.name);
		System.out.println(s1.address.city);
		System.out.println("*****************************");

		Student1 s2 = (Student1) s1.clone();

		s2.address.city = "OOty";
		System.out.println(s2.sid);
		System.out.println(s2.name);
		System.out.println(s2.address.city);
		System.out.println(s1.address.city);
		System.out.println("*****************************");

	}

}
