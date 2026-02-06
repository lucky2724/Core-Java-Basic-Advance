package com.advancedConcepts;

public class StringRegEx {
	public static void main(String[] args) {
//		Regex	Meaning
//		.	any single character
//		\\d	digit (0–9)
//		\\D	not a digit
//		\\w	word character (a-z, A-Z, 0-9, _)
//		\\W	not word character
//		\\s	space
//		\\S	not space

//		| Pattern  | Meaning     |
//		| -------- | ----------- |
//		| `[abc]`  | a or b or c |
//		| `[^abc]` | not a, b, c |
//		| `[a-z]`  | a to z      |
//		| `[A-Z]`  | A to Z      |
//		| `[0-9]`  | digits      |
		
//		| Pattern | Meaning         |
//		| ------- | --------------- |
//		| `+`     | 1 or more       |
//		| `*`     | 0 or more       |
//		| `?`     | 0 or 1          |
//		| `{n}`   | exactly n       |
//		| `{n,}`  | at least n      |
//		| `{n,m}` | between n and m |


		String s = "             Srikanth    C     ";
		System.out.println("Given String : " + s);
		System.out.println("The Updated String : " + s.trim());

		s = s.replaceAll("\\s", "");

		System.out.println("The Updated String With replaceAll() : " + s);

		System.out.println("*****************");
		String s1 = "abcd123456LuckyPala";
		System.out.println("Before replaceAll() : " + s1);

		s1 = s1.replaceAll("\\d", "#");

		System.out.println("After replaceAll() : " + s1);

		String s2 = "Hi 89 pala908";
		s2 = s2.replaceFirst("\\D", "%");

		System.out.println(s2);
	}
}
