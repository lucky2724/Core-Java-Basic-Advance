package com.tasksarrays;

public class SumAndAvg {
	public static void main(String[] args) {
		System.out.println("main method started..");

		int a[] = { 1, 2, 3 };
		int b[] = { 5, 6, 7 };

		int aSum = 0;
		int bSum = 0;

		double aAvg = 0;
		double bAvg = 0;

		int[] cols = new int[a.length];

		for (int i = 0; i < a.length; i++) {
			aSum += a[i];
			bSum += b[i];

			cols[i] = a[i] + b[i];

		}

		aAvg = aSum / a.length;
		bAvg = bSum / b.length;

		System.out.println("**************");
		System.out.println("a row Array Sum : " + aSum);
		System.out.println("a row Average : " + aAvg);

		System.out.println("**************");
		System.out.println("b row  Array Sum : " + bSum);
		System.out.println("b row  Average : " + bAvg);

		System.out.println("**************");

		for (int i = 0; i < a.length; i++) {
			double colsAvg = cols[i] / 2;
			System.out.println("Column " + i + " sum : " + cols[i]);
			System.out.println("Column " + i + " Average : " + colsAvg);
		}
	}
}
