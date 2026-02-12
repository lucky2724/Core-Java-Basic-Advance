package com.strings;

public class SeparateStringandSumTheNums {
	public static void main(String[] args) {
		System.out.println("main method started..");

		String s = "V1c5ube J81ava";

		String ans = "";
		int sum = 0;

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (!Character.isDigit(ch)) {
				ans += ch;
			} else {
				int num = 0;

				while (i < s.length() && Character.isDigit(s.charAt(i))) {
					num = num * 10 + (s.charAt(i) - '0');
					i++;
				}

				sum += num;
				i--;
			}
		}

		//LuckyPala
		System.out.println("String : " + ans);
		System.out.println("Sum: " + sum);
	}

}
