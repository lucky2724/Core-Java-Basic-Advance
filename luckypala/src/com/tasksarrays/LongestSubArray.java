package com.tasksarrays;

public class LongestSubArray {
	public static void main(String[] args) {

		int[] arr = { 0, 0, 1, 0, 0, 1, 1, 0 }; // 1 0 0 1 1 0

		int maxLength = 0;

		int startIndex = -1;
		int endIndex = -1;

		for (int i = 0; i < arr.length; i++) {

			int zeros = 0;
			int ones = 0;

			for (int j = i; j < arr.length; j++) {

				if (arr[j] == 0) {
					zeros++;
				} else {
					ones++;
				}

				if (zeros == ones) {
					if (j - i + 1 > maxLength) {
						maxLength = j - i + 1;
						startIndex = i;
						endIndex = j;
					}
				}
			}
		}

		System.out.println("Longest Subarray Length: " + maxLength);

		for (int k = startIndex; k <= endIndex; k++) {
			System.out.print(arr[k] + " ");
		}
	}
}

//import java.util.HashMap;
//
//public class LongestSubArray {
//    public static void main(String[] args) {
//        System.out.println("main method started");
//
//        int[] arr = {1, 0, 0, 1, 1, 0, 1, 1};
//
//        HashMap<Integer, Integer> map = new HashMap<>();
//
//        int sum = 0;
//        int maxLength = 0;
//
//        map.put(0, -1); // Important step
//
//        for (int i = 0; i < arr.length; i++) {
//
//            // Replace 0 with -1
//            if (arr[i] == 0) {
//                sum += -1;
//            } else {
//                sum += 1;
//            }
//
//            if (map.containsKey(sum)) {
//                int length = i - map.get(sum);
//                maxLength = Math.max(maxLength, length);
//            } else {
//                map.put(sum, i);
//            }
//        }
//
//        System.out.println("Longest Subarray Length: " + maxLength);
//    }
//}
