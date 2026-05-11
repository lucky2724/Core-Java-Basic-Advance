package com.java8Features;

import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class Employee {
	int id;
	String name;
	double salary;

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	void show() {
		System.out.println("Emp Id     : " + id);
		System.out.println("Emp Name   : " + name);
		System.out.println("Emp Salary : " + salary);
	}

}

public class EmployeeUsingPredifinedFI {
	public static void main(String[] args) {
		System.out.println("main method started");

		Employee e1 = new Employee(101, "Lucky", 25000);
		Employee e2 = new Employee(102, "Nani", 15000);
		Employee e3 = new Employee(103, "Surya", 40000);
		Employee e4 = new Employee(104, "Srinu", 85000);
		Employee e5 = new Employee(105, "Ganga", 30000);
		Employee e6 = new Employee(106, "Bhavani", 75000);

		Employee[] emp = { e1, e2, e3, e4, e5, e6 };

		Predicate<Employee> p1 = s -> s.salary > 30000;

		Function<Employee, String> f1 = e -> {
			String sal = "";

			if (e.salary > 80000) {
				sal = "SUPER SALARY";
			} else if (e.salary > 60000) {
				sal = "MODEARATE SALARY";
			} else if (e.salary > 30000) {
				sal = "GOOD SALARY";
			} else {
				sal = "AVEARAGE SAL";
			}

			return sal;
		};

		Consumer<Employee> e11 = (empDetails) -> {
			empDetails.show();
			System.out.println("Sal Info   : " + f1.apply(empDetails));
			System.out.println("-----------------------------");

		};

		Supplier<Date> cd = () -> {
			return new Date();
		};

		System.out.println("============================");
		System.out.println(cd.get());
		System.out.println("============================");

		for (Employee e : emp) {
			if (p1.test(e)) {
				e11.accept(e);
			}
		}

	}
}
