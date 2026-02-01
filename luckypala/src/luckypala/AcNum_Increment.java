package luckypala;

public class AcNum_Increment {
	String name;
	double balance;
	static int account_Num = 12345;

	{
		account_Num++;

	}
	
		@SuppressWarnings("static-access")
		public static void main(String[] args) {
		AcNum_Increment obj1 = new AcNum_Increment();
		obj1.name = "Lucky pala";
		obj1.balance = 500.00;

		System.out.println(obj1.name);
		System.out.println(obj1.balance);
		System.out.println(obj1.account_Num);

		AcNum_Increment obj2 = new AcNum_Increment();
		obj2.name = "Surya";
		obj2.balance = 700.00;

		System.out.println(obj2.name);
		System.out.println(obj2.balance);
		System.out.println(obj2.account_Num);
		
		System.out.println("Haiii");
		
	

	}

}
