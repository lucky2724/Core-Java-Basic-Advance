package com.practVcube;

public class ExceptionHandling {
	public static void main(String[] args) {
		System.out.println("main method started..");

//		try {
//			int arr[] = { 1, 2, 3 };
//			System.out.println(arr[10]);
//
//		} catch (Exception e) {
//			System.out.println("Something wrong !!");
//		} finally {
//			System.out.println("finally !!!");
//		}

//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("Enter your total marks : ");
//		int marks = sc.nextInt();
//
//		System.out.println("Enter number of subjects you attempted : ");
//		int sub = sc.nextInt();
//
//		int avg = marks / sub;
//
//		System.out.println("Average marks per subject : " + avg);
//
//		sc.close();

		try {
			int a = 10;
			int b = 0;

			System.out.println(a / b);
		} catch (ArithmeticException e) {
			System.out.println("Can not  Divisible by zero !! please check the input once.!!");
		}

	}
}
