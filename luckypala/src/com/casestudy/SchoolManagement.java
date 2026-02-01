package com.casestudy;

public class SchoolManagement {
	int sid;
	String sname;
	char section;
	
	SchoolManagement(int sid,String sname,char section){
		System.out.println("Historical Record : ");
		this.sid=sid;
		this.sname=sname;
		this.section=section;
	}
	
	SchoolManagement(SchoolManagement s,char section){
		System.out.println("Current  Active record : ");
		this.section=section;
		this.sname=s.sname;
		this.sid=s.sid;
	}
	
	void show() {
		System.out.println("====== Student details =======");
		System.out.println("Student Id   : "+sid);
		System.out.println("Student Name : "+sname);
		System.out.println("Section      : "+section);
		System.out.println("==============================");
	}
	
	public static void main(String[] args) {
		System.out.println("main method started..");
		SchoolManagement s1=new SchoolManagement(101,"Lucky",'A');
		s1.show();
		
		SchoolManagement s2=new SchoolManagement(s1,'B');
		s2.show();
		
		SchoolManagement s3=new SchoolManagement(s1,'C');
		s3.show();
	}
}
