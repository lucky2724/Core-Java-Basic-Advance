package com.oops;

public class TestDriverClass {
	public static void main(String[] args) {
		System.out.println("main method started..");

		System.out.println("====== JAVA INFO =======");
		TestAbs jv = new TestJavaVcube();
		jv.technical();
		jv.mockInterviews();
		jv.weeklyTests();
		jv.dailyAssignments();
		jv.plcements();
		jv.welcome();
		
		System.out.println("====== Python INFO =======");
		TestIntf jp = new TestPythonVcube();
		jp.technical();
		jp.mockInterviews();
		jp.weeklyTests();
		jp.dailyAssignments();
		jp.plcements();
		//jp.welcome();
		jp.resumePreparation();
		jp.softSkills();
	}
}
