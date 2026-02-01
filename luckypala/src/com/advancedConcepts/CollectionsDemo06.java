package com.advancedConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class CollectionsDemo06 {
	public static void main(String[] args) {

		Collection<Integer> c1 = new ArrayList<>();

		c1.add(100);
		c1.add(200);
		c1.add(300);
		c1.add(500);
		c1.add(400);
		c1.add(300);
		c1.add(600);
		c1.add(200);
		c1.add(300);
		c1.add(700);
		c1.add(100);
		c1.add(null);
		c1.add(null);

		System.out.println(c1.size());

		Object[] arr = c1.toArray();
		System.out.println(Arrays.toString(arr));

		System.out.println("'----------");
		Iterator<Integer> itr = c1.iterator();

		while (itr.hasNext()) {
			// returns next element
			System.out.println(itr.next());
			itr.remove();
		}

		System.out.println(c1);

//		for (Integer n : c1) {
//			System.out.println(n);
//		}
	}
}
