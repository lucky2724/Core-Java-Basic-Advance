package com.oops;

class Student1 implements Cloneable {
	int sid;
	String sname;
	Address address;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public Student1(int sid, String sname, Address address) {
		this.sid = sid;
		this.sname = sname;
		this.address = address;
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
		System.out.println("main method started..");

		Address add = new Address("Hydreabad");

		Student1 s1 = new Student1(1, "Srikanth", add);

		System.out.println("*****************************");
		System.out.println(s1.sid);
		System.out.println(s1.sname);
		System.out.println(s1.address.city);

		Student1 s2 = (Student1) s1.clone();

		System.out.println("*****************************");
		System.out.println(s2.sid);
		System.out.println(s2.sname);
		System.out.println(s2.address.city);

		s2.sid = 2;
		s2.sname = "Vishwa Sir";
		s2.address.city = "Vizagggg";
		
		System.out.println("*****************************");
		System.out.println(s2.sid);
		System.out.println(s2.sname);
		System.out.println(s1.sid);
		System.out.println(s1.sname);
		System.out.println(s2.address.city); // Banglore
		System.out.println(s1.address.city); // Banglore

	}
}
