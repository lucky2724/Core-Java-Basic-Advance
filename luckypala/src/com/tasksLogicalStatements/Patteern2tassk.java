package com.tasksLogicalStatements;

public class Patteern2tassk {
	public static void main(String[] args) {
		System.out.println("main method started ...");

		int rows = 7;
		int n=1;
		
//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//
//		for (int i = 1; i <= n; i++) {
//			for (int j = n; j > i; j--) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print("* ");
			}
			if(i<(rows/2)+1) {
				n++;
			}else {
				n--;
			}
			System.out.println();
		}
	}
}
