package com.oopsPractice;

public class DriverStudent {
	public static void main(String[] args) {
		System.out.println("main method started");

		Student s1 = new Student();

		s1.setDetails(117, "Luckyy", 18);

		s1.getDetails();

		System.out.println("****************");
		
		Student s2 = new Student();

		s2.setDetails(33, "Hardhik Pandya", 25);

		s2.getDetails();

//		s1.sid = 117;
//		s1.sname = "Lucky";
//		s1.sage = 20;
//		
//		System.out.println(s1.sid);
//		System.out.println(s1.sname);
//		System.out.println(s1.sage);
	}
}
