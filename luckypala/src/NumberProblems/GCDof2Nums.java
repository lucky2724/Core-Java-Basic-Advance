package NumberProblems;

public class GCDof2Nums {
	static int gcd(int n1, int n2) {
		int ans = 1;
		for (int i = Math.min(n1, n2); i>=1; i--) {
			if (n1 % i == 0 && n2 % i == 0) {
				return i;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		System.out.println("main method started..!!");

		System.out.println(gcd(20, 40));
	}
}
