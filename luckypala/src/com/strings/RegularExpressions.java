package com.strings;

public class RegularExpressions {
	public static void main(String[] args) {
		System.out.println("main method started");

//			Regex	Meaning
//			.	any single character
//			\\d	digit (0–9)
//			\\D	not a digit
//			\\w	word character (a-z, A-Z, 0-9, _)
//			\\W	not word character
//			\\s	space
//			\\S	not space

//			| Pattern  | Meaning     |
//			| -------- | ----------- |
//			| `[abc]`  | a or b or c |
//			| `[^abc]` | not a, b, c |
//			| `[a-z]`  | a to z      |
//			| `[A-Z]`  | A to Z      |
//			| `[0-9]`  | digits      |

//			| Pattern | Meaning         |
//			| ------- | --------------- |
//			| `+`     | 1 or more       |
//			| `*`     | 0 or more       |
//			| `?`     | 0 or 1          |
//			| `{n}`   | exactly n       |
//			| `{n,}`  | at least n      |
//			| `{n,m}` | between n and m |

		String str = "Java is Simple";
		str = str.replace('a', '#');
		System.out.println(str);

		String str2 = "Welcome to String World string is Simple";
		str2 = str2.toLowerCase().replace("string", "Javaaaa");
		System.out.println(str2);

		String str3 = "Crickete is Simple to play";
		str3 = str3.replaceAll("Simple", "Easy");
		System.out.println(str3);

		String str4 = "AMHGS4563K";
		// str4=str4.replaceAll("\\D", "X");
		str4 = str4.replaceAll("\\d", "X");
		System.out.println(str4);

		String s1 = "          Hello    Good Evening  ";
		System.out.println(s1);
		System.out.println(s1.replaceAll("\\s+", " ").trim());

		System.out.println("--------------------------");
		
		

	}
}
