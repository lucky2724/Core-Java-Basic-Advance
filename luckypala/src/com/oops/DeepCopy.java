package com.oops;

class Employee {
	String empName;
	Address1 address1;

	public Employee(String empName, Address1 address1) {
		this.empName = empName;
		this.address1 = address1;
	}

	public Employee(Employee emp1) {
		this.empName = emp1.empName;
		this.address1 = new Address1(emp1.address1);
	}

}

class Address1 {
	String city;

	public Address1(String city) {
		this.city = city;
	}

	public Address1(Address1 add1) {
		this.city = add1.city;
	}

}

public class DeepCopy {
	public static void main(String[] args) {
		System.out.println("main method started..");

		Address1 add1 = new Address1("Katrenipadu");

		Employee emp1 = new Employee("Srikanth", add1);

		System.out.println(emp1.empName);
		System.out.println(emp1.address1.city);
		System.out.println("************************");

		Employee emp2 = new Employee(emp1);
		System.out.println(emp2.empName);
		System.out.println(emp2.address1.city);
		System.out.println("************************");

		emp2.address1.city = "BVRM";
		System.out.println(emp2.address1.city);
		System.out.println(emp1.address1.city);
	}
}
