package com.strings;

public class CharactersThroughCount {
	public static void main(String[] args) {
		String s = "a1b2c3d5";

		for (int i = 0; i < s.length(); i += 2) {

			int j = s.charAt(i + 1) - '0';

			while (j > 0) {
				System.out.print(s.charAt(i));
				j--;
			}
		}

		// Double digit

		String s1 = "a1b12c13d5";

		System.out.println();

		for (int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);

			if (Character.isLetter(ch)) {
				i++;
			}

			int num = 0;

			while (i < s1.length() && Character.isDigit(s1.charAt(i))) {
				num = num * 10 + (s1.charAt(i) - '0');
				i++;
			}

			i--;

			for (int j = 0; j < num; j++) {
				System.out.print(ch);
			}
		}

	}
}
