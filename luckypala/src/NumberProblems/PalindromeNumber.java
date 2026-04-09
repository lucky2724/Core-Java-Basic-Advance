package NumberProblems;

public class PalindromeNumber {
	static boolean isPalindrome(int n) {
		int temp = n;
		int rev = 0;

		while (n > 0) {
			int digit = n % 10;
			rev = rev * 10 + digit;
			n /= 10;
		}

		if (temp == rev) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println("main method started !!");

		int n = 1234321;
		
		if(isPalindrome(n)) {
			System.out.println(n+" is a Palindrome Number !!");
		}else {
			System.out.println(n+" is not a Palindrome Number !!");

		}
	}
}
