package NumberProblems;

public class ReverseANumber {
	static int reverseNum(int n) {
		int rev = 0;

		while (n > 0) {
			int digit = n % 10;
			rev = rev * 10 + digit;
			n /= 10;
		}
		return rev;
	}

	public static void main(String[] args) {
		System.out.println("main method started");

		int n = 71845;

		System.out.println(reverseNum(n));
	}
}
