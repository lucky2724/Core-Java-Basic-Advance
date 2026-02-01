package com.advancedConcepts;

public class SubStringDemo {
	int id = 123;
	String name = "Srikanth";

	@Override
	public String toString() {
		System.out.println();
		return "Id : " + id + " , Name : " + name;
	}

	public static void main(String[] args) {
		String s = "Hello Welcome to Java";

		System.out.println(s.substring(6));
		System.out.println(s.substring(0, 5));

		char[] chAr = s.toCharArray();

		for (char ch : chAr) {
			System.out.print(ch + " ");
		}

		SubStringDemo ss = new SubStringDemo();
		System.out.println(ss);

		int a = 10;

		String s2 = "1500";
		System.out.println(String.valueOf(a));

		System.out.println(Integer.valueOf(s2));
		System.out.println();
		
		
	}
}
