package com.tasks;



public class Arrayprblm {
	//arr= {1,12,21,34,43,55,65,56}
	static int rev(int n) {
		int rev=0;
		
		while(n>0) {
			int digit=n%10;
			rev=rev*10+digit;
			n/=10;
		}
		return rev;
	}
	
	static int countReverse(int arr[]) {
		
		
		int count=0;
		int rev=0;
		for(int i=0;i<arr.length;i++) {
			 rev=rev(arr[i]);
			for(int j=i;j<arr.length;j++) {
				if(arr[j]==rev) {
					count++;
				}
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println("main method started..");
		int arr[]= {94,12,21,3,45,49,6,54};
		
		System.out.println(countReverse(arr));
		
	}
}
