package com.interviewProblems;

import java.util.Arrays;

public class ReverseWordInSentence {
	static String reverse(String s) {
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev += s.charAt(i);
		}
		return rev;
	}

	public static void main(String[] args) {
		String s = "JAVA IS SIMPLE";

		String[] words = s.split(" ");
		
		String rev="";		

		System.out.println(Arrays.toString(words));
		

		for (String str : words) {
			rev+=reverse(str)+" ";
		}
		 
		System.out.println(Arrays.toString(words));
		
		System.out.println(rev);
		

	}
}
