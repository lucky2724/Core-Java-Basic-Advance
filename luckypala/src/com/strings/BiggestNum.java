package com.strings;

public class BiggestNum {
	public static void main(String[] args) {

		String s = "1331313313";
		int max = 0;

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == '1') {

				String ns = s.substring(0, i) + s.substring(i + 1);

				int num = Integer.parseInt(ns);
				System.out.println(num);
				max = Math.max(max, num);
			}
		}

		System.out.println("--------------------------");
		System.out.println("max : " + max);

	}
}
