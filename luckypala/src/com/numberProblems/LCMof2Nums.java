package com.numberProblems;

public class LCMof2Nums {
	static int lcm(int n1, int n2) {
		int i = 1;
		int n = Math.min(n1, n2);
		while (true) {
			int mul = n * i;
			if (mul % n1 == 0 && mul % n2 == 0) {
				return mul;
			}
			i++;
		}
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		
		System.out.println(lcm(8,12));
		
	}
}
