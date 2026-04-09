package NumberProblems;

public class CountOddDigitsInGivenNumber {
	static int CountOddDigits(int n) {
		int count = 0;

		while (n > 0) {
			int digit = n % 10;
			if (digit % 2 != 0) {
				count++;
			}
			n /= 10;
		}

		return count;
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		
		int n = 71845;
	
		System.out.println(CountOddDigits(n));
	}
}
