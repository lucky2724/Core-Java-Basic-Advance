package luckypala;

public class objectCount {
	static int count =0;
	objectCount(){
		count++;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unused")
		objectCount obj=new objectCount();
		@SuppressWarnings("unused")
		objectCount obj2=new objectCount();
		@SuppressWarnings("unused")
		objectCount obj3=new objectCount();
		
		
		System.out.println("Number of objects "+ count);
		
		
		

	}

}
