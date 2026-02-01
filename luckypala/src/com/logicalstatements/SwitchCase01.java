package com.logicalstatements;

import java.util.Scanner;

public class SwitchCase01 {
	public static void main(String[] args) {
		System.out.println("main method started...");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your Jersy Number : ");
		int jno = sc.nextInt();

		switch (jno) {
		case 18:
			System.out.println("KING KOHLI !!");
			break;
		case 45:
			System.out.println("HIT MAN ROHIT !!");
			break;
		case 33:
			System.out.println("HARDHIK PANDYA !!");
			break;
		case 7:
			System.out.println("MAHENDHRA SING DHONI !!");
			break;
		case 77:
			System.out.println("GILL MOWA");
			break;
		case 1:
			System.out.println("CLASSY KL RAHUL");
			break;
		default:
			System.out.println("This Jersy number is not my FAV ...!");
		}

		sc.close();
	}
}
