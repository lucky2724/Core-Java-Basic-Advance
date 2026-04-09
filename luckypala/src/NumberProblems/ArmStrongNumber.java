package NumberProblems;

public class ArmStrongNumber {
	static boolean isArmstrong(int n) {
		int digits = Integer.toString(n).length();
		int temp = n;
		int ans = 0;

		while (n > 0) {
			int digit = n % 10;
			ans += Math.pow(digit, digits);
			n /= 10;
		}

		if (temp == ans) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println("main method started !!");

		int n = 371;

		if (isArmstrong(n)) {
			System.out.println(n + " is a Armstrong Number !!");
		} else {
			System.out.println(n + " is not a Armstrong Number !!");
		}
	}
}
