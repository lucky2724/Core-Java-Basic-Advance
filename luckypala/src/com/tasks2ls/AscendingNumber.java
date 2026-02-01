package com.tasks2ls;

import java.util.Arrays;

public class AscendingNumber {
	static int countDigits(int n) {
		int count = 0;
		while (n > 0) {
			n /= 10;
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		int n = 987643521;
		
		System.out.println("Input  : "+n);

		int[] arr = new int[countDigits(n)];

		int idx = 0;

		while (n > 0) {
			arr[idx++] = n % 10;
			n /= 10;
		}
		
		//System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr);
		
		//System.out.println(Arrays.toString(arr));
		
		int result=0;
		
		for(int digit:arr) {
			result=result*10+digit;
		}
		
		System.out.println("Output : "+result);
	}
}
