package com.logicalstatements;

import java.util.Scanner;

//WAP to print cricketer name based on his jersy number
public class SwitchCaseDemo1 {
	public static void main(String[] args) {
		System.out.println("main method started..");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Jersy Number : ");
		int jno = sc.nextInt();

		switch (jno) {
		case 7:
			System.out.println("MSD  THALA !!");
			break;
		case 18:
			System.out.println("KING Kohliii !!");
			break;
		case 45:
			System.out.println("Rohit Sharma !!");
			break;
		case 1:
			System.out.println("K L RAHUL !!");
			break;
		case 77:
			System.out.println("Shubman Gill !!");
			break;
		case 33:
			System.out.println("Hardhik Pandya !!");
			break;
		default:
			System.out.println("This jersy number is not in my list..!");
		}

		sc.close();
	}
}
