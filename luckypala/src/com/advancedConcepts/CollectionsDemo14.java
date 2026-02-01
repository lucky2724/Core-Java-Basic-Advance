package com.advancedConcepts;

import java.util.ArrayList;
import java.util.List;

public class CollectionsDemo14 {
	public static void main(String[] args) {
		System.out.println("main method started");

		List<Employee5> empList = new ArrayList<>();

		Employee5 e1 = new Employee5(1, "Lucky", 65000, 23, 77887766599L);
		Employee5 e2 = new Employee5(2, "Surya", 60000, 25, 99887766599L);
		Employee5 e3 = new Employee5(3, "Ram", 85000, 26, 887766599L);
		Employee5 e4 = new Employee5(4, "Srinu", 90000, 21, 67887766599L);
		Employee5 e5 = new Employee5(5, "Shiva", 45000, 20, 797887766599L);
		Employee5 e6 = new Employee5(6, "Raju", 25000, 20, 87887766599L);

		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
		empList.add(e6);

		// Collections.sort(empList); Not Working because employee not implements
		// Comparble

		System.out.println(empList); // Looks Clumsy
		System.out.println("------------------------");
		for (Employee5 emp : empList) {
			System.out.println(emp);
		}
	}
}
