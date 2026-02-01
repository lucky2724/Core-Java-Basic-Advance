package luckypala;

public class practice {
	//int  a;
	public static void main(String Vcube []) {
		int n=12345;
		int temp=0;
		
		while(n!=0) {
			int digit=n%10;
			temp=temp*10+digit;
			n/=10;
			
		}
		
		System.out.println(temp);
	}

}
