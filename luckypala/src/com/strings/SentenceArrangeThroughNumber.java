package com.strings;

public class SentenceArrangeThroughNumber {
	public static void main(String[] args) {
		System.out.println("main method started");

		String s = "am2 I1 to4 going3 town6 home5";

		String ans = "";

		String[] arr = s.split("\\s+");

		int k = 1;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[j].charAt(arr[j].length() - 1) == (char) (k + '0')) {
					ans += arr[j].substring(0, arr[j].length() - 1) + " ";
					k++;
					break;
				}
			}
		}
		System.out.println(ans);
		System.out.println("Jaiii Baabu");
	}
}
