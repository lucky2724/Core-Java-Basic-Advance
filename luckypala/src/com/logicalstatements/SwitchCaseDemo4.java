package com.logicalstatements;

import java.util.Scanner;

public class SwitchCaseDemo4 {
	public static void main(String[] args) {
		System.out.println("main method started..!");
		Scanner sc = new Scanner(System.in);

		float height = sc.nextFloat();

		switch ((int) height) {
		case 1 -> System.out.println();
		}

		sc.close();
	}
}
