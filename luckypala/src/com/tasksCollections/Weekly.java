package com.tasksCollections;

import java.util.Objects;

public class Weekly {
	public static void main(String[] args) {

		String s1 = "";

		for (int i = 0; i < 3; i++) {
			i += 2;
			s1 += i;
			s1 += 1;
		}

		System.out.println(s1);

		String s = "null";
		System.out.println(Objects.equals(s, null));

//		String s = null;
//		System.out.println(s);
//		s = s + "Java";
//		System.out.println(s);

//		List list = Arrays.asList("Java", "Spring", "Hibernate");
//		System.out.println(list);
//		list.add("Mc");
//		System.out.println(list);
	}

}
