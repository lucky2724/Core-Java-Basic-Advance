package com.tasksarrays;

public class RowAndColsZero {
	public static void main(String[] args) {
		int[][] arr = { { 1, 1, 0 }, { 1, 1, 1 }, { 0, 1, 1 } };

		int rowsl = arr.length;
		int colsl = arr[2].length;

		boolean rows[] = new boolean[arr.length];
		boolean cols[] = new boolean[arr[0].length];

		for (int i = 0; i < rowsl; i++) {
			for (int j = 0; j < colsl; j++) {
				if (arr[i][j] == 0) {
					rows[i] = true;
					cols[j] = true;
				}
			}
		}

		for (int i = 0; i < rowsl; i++) {
			for (int j = 0; j < colsl; j++) {
				if (rows[i] || cols[j]) {
					arr[i][j] = 0;
				}
			}
		}

		
		for (int i = 0; i < rowsl; i++) {
			for (int j = 0; j < colsl; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
