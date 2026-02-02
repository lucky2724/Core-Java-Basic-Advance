package com.interviewProblems;

public class ReverseWordsInSentence {
	public static void main(String[] args) {
		System.out.println("main method started");

		String s = "    JAVA IS POWERFUL";

		s = s.trim();

		String result = "";
		String word = "";

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (ch != ' ') {
				word = ch + word; // reverse word
			} else {
				result = result + word + " "; //add the word to result string
				word = "";
			}
		}

		result += word;// Last word add to mandotory !!!

		System.out.println(result);
	}
}
