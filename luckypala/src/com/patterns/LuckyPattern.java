package com.patterns;

public class LuckyPattern {
	public static void main(String[] args) {
		
		        String[] L = {
		                "*     ",
		                "*     ",
		                "*     ",
		                "*     ",
		                "******"
		        };

		        String[] U = {
		                "*   *",
		                "*   *",
		                "*   *",
		                "*   *",
		                " *** "
		        };

		        String[] C = {
		                " ****",
		                "*    ",
		                "*    ",
		                "*    ",
		                " ****"
		        };

		        String[] K = {
		                "*   *",
		                "*  * ",
		                "***  ",
		                "*  * ",
		                "*   *"
		        };

		        String[] Y = {
		                "*   *",
		                " * * ",
		                "  *  ",
		                "  *  ",
		                "  *  "
		        };

		        // Printing side by side line by line
		        for (int i = 0; i < 5; i++) {
		            System.out.println(L[i] + "   " + U[i] + "   " + C[i] + "   " + K[i] + "   " + Y[i]);
		        }
		    }
		

}
