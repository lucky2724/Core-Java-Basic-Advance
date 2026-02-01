package luckypala;

public class ArmstrongNum {
	public static void main(String [] args) {
		int n=153;
		int digits=String.valueOf(n).length();
		int temp=n;
		int sum=0;
		
		
		while(n>0) {
			int digit=n%10;
			sum+=(int)Math.pow(digit, digits);
			n/=10;
		}
		System.out.println(sum);
		
		if(temp==sum) {
			System.out.println(temp+" is a Armstrong number");
		}else {
			System.out.println(temp+" is not Armstrong number");
		}
	}

}
