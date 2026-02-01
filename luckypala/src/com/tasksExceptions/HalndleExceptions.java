package com.tasksExceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HalndleExceptions {
	public static void main(String[] args) {
		System.out.println("main method started");

		Scanner sc = new Scanner(System.in);

		int[] arr = { 1, 2, 3, 4 };

		try {
			System.out.println("In try");
			System.out.println("Enter index value do you want : ");
			int index = sc.nextInt();

			System.out.println("Your Value at index " + index + " is : " + arr[index]);
		} catch (InputMismatchException ip) {
			System.err.println("In Catch Of IE");
			System.err.println(ip.getMessage());
		} catch (ArrayIndexOutOfBoundsException ar) {
			System.err.println("In Catch of AR");
			System.err.println(ar.getMessage());
		} finally {
			System.out.println("Program Ended !!");
		}

		sc.close();
	}
}
