package com.casestudy;

public class EmployeeSalaries {
	static int highestSal(int arr[]) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	static int lowestSal(int arr[]) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}

	static int avgSal(int arr[]) {
		int total = 0;
		for (int a : arr) {
			total += a;
		}
		return total / arr.length;
	}

	static void empSal(int arr[]) {
		int low = 0;
		int high = 0;
		for (int i : arr) {
			if (i < avgSal(arr)) {
				low++;
			} else {
				high++;
			}
		}

		System.out.println("Employees Have low Sal is : " + low);
		System.out.println("Employees Have High Sal is : " + high);
	}

	public static void main(String[] args) {
		System.out.println("main method started");

		int[] salaries = { 2500, 5000, 3400, 1250, 1700, 1500, 3000 };

		System.out.println("Highest Salary : " + highestSal(salaries));

		System.out.println("Lowest Salary : " + lowestSal(salaries));

		System.out.println("Average Salary : " + avgSal(salaries));

		empSal(salaries);
	}

}
