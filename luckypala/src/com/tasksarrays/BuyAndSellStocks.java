package com.tasksarrays;

public class BuyAndSellStocks {
	public static int maxProfit(int[] prices) {
		int n = prices.length;

		int profit = 0;

		int low = prices[0];

		for (int i = 1; i < n; i++) {
			int temp = prices[i] - low;
			if (prices[i] < low) {
				low = prices[i];
			}
			profit = Math.max(temp, profit);
		}

		if (profit < 0) {
			return 0;
		} else {
			return profit;
		}

	}

	public static void main(String[] args) {
		System.out.println("main method started");

		int[] arr = { 10, 5, 11, 1, 19, 27, 13 };

		System.out.println(maxProfit(arr));
	}
}
