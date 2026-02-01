package com.coreJavanotes;

public class Day65Arrays08 {
	public static void main(String[] args) {
		/*
		 
		-----------------------------------------------------------
			ARRAYS 08 :
				3D Array :
				//How to declare and access
					public class Arrays3D {
						public static void main(String[] args) {
							System.out.println("main method started..");
					
							int[][][] arr = new int[3][3][3];
					
							arr[0][0][0] = 10;
							arr[1][1][1] = 20;
							arr[2][2][2] = 30;
							
							
					
							System.out.println("===== Using for-each  loop ======");
							for (int[][] n2 : arr) {
								for (int[] n1 : n2) {
									for (int n : n1) {
										System.out.print(n + " ");
									}
									System.out.println();
								}
								System.out.println();
							}
					
							System.out.println("===== Using for loop ======");
							for (int i = 0; i < arr.length; i++) {
								for (int j = 0; j < arr[i].length; j++) {
									for (int k = 0; k < arr[i][j].length; k++) {
										System.out.print(arr[i][j][k]+" ");
									}
									System.out.println();
								}
								System.out.println();
							}
						}
					}
					
					//way 2
					/// 
					/// 	public static void main(String[] args) {
							System.out.println("main method started..");
					
							int arr[][][] = { { { 1, 2, 3, 4 }, { 4, 5, 6, 7 }, { 6, 7, 8, 9 } },
									{ { 1, 2, 3 }, { 2, 3, 4 }, { 3, 4, 5 }, { 5, 6, 7 } }, { { 3, 4, }, { 1, 2 }, { 6, 7 } },
									{ { 9, 0 }, { 7, 8 } } };
					
							for (int n2[][] : arr) {
								for (int n1[] : n2) {
									for (int n : n1) {
										System.out.print(n + " ");
									}
									System.out.println();
								}
								System.out.println();
							}
						}

		 */
		
	}
}
