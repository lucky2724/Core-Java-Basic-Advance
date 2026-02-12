package com.strings;

import java.util.Scanner;

public class MaxOccuranceOfCharacter {
	public static void main(String[] args) {
		System.out.println("main method started");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a String : ");
		String s = sc.nextLine();

		int[] arr = new int[127];

		for (int i = 0; i < s.length(); i++) {
			arr[s.charAt(i)]++;
		}

		int maxOccurance = -1;
		char ch = ' ';

		for (int i = 0; i < s.length(); i++) {
			if (arr[s.charAt(i)] > maxOccurance) {
				maxOccurance = arr[s.charAt(i)];
				ch = s.charAt(i);
			}
		}

		System.out.println("Max Occurance : " + maxOccurance);
		System.out.println("Character is : " + ch);
		
		sc.close();

	}
}
