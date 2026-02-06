package com.strings;

public class StringMethods07 {
	public static void main(String[] args) {
		System.out.println("main method started");

		String str = "Ishan";

		// Using GetBytes()
		byte[] ab = str.getBytes();

		System.out.println(new String(ab));

		int l = 0;
		int r = ab.length - 1;

		while (l < r) {
			int temp = ab[l];
			ab[l] = ab[r];
			ab[r] = (byte) temp;

			l++;
			r--;
		}

		System.out.println(new String(ab));

		System.out.println("*********************************");

		// Using toCharArray();
		String s = "Tilak";

		System.out.println(s);

		char[] ach = s.toCharArray();

		int low = 0;
		int high = ach.length - 1;

		while (low < high) {
			int temp = ach[low];
			ach[low] = ach[high];
			ach[high] = (char) temp;

			low++;
			high--;
		}

		System.out.println(new String(ach));
	}
}
