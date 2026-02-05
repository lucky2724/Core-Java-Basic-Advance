package com.strings;

public class MaxCharacterSequence {
	public static void main(String[] args) {
		String s = "aaabbccccdde";

		int count = 0;
		int maxCount = 0;
		char maxChar = s.charAt(0);

		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == s.charAt(i - 1)) {
				count++;
			} else {
				if (count > maxCount) {
					maxCount = count;
					maxChar = s.charAt(i - 1);
				}
				count = 0;
			}
		}

		// last sequence check
		if (count > maxCount) {
			maxCount = count;
			maxChar = s.charAt(s.length() - 1);
		}

		System.out.println(maxChar + " repeated " + (maxCount + 1) + " times");

//		************************* max occurance character **********************

		String s1 = "aaabbccccddec";

		int[] arr = new int[127];

		for (int i = 0; i < s1.length(); i++) {
			arr[s1.charAt(i)]++;
		}

		int max = -1;
		char c = ' ';

		for (int i = 0; i < s1.length(); i++) {
			if (max < arr[s1.charAt(i)]) {
				max = arr[s1.charAt(i)];
				c = s1.charAt(i);
			}
			
		}

		System.out.println("***************************");

		System.out.println("max count : " + max);
		System.out.println("max occurance Character : " + c);

	}
}
