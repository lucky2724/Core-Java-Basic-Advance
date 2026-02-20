package com.tasksCollections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class MaxSal {
	public static void main(String[] args) {

		Integer[] sal = { 45999, 35999, 24999, 6599, 86999, 34999, 169599 };

		List<Integer> li = new ArrayList<>(List.of(sal));

//		for (int salary : sal) {
//			li.add(salary);
//		}

		System.out.println(li);

		int maxSal = Integer.MIN_VALUE;

		ListIterator<Integer> litr = li.listIterator();

		while (litr.hasNext()) {
			maxSal = Math.max(maxSal, litr.next());
		}

		System.out.println("Maximum Salary : $" + maxSal);
	}
}
