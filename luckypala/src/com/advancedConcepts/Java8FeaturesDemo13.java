package com.advancedConcepts;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Student {
	String name;
	int marks;

	public Student(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}
}

//get all students grades based on marks
public class Java8FeaturesDemo13 {
	public static void main(String[] args) {
		System.out.println("main method started");

		Predicate<Student> p1 = (st) -> st.marks > 70;

		Function<Student, String> f1 = (st) -> {

			String grade = "";

			if (st.marks > 90) {
				grade = "A";
			} else if (st.marks > 80) {
				grade = "B";
			} else if (st.marks > 70) {
				grade = "C";
			} else if (st.marks > 60) {
				grade = "D";
			} else {
				grade = "F";
			}

			return grade;
		};

		Student st = new Student("Durga Baa", 83);
		Student st1 = new Student("Jai Baab", 98);
		Student st2 = new Student("Boss", 75);
		Student st3 = new Student("lucky", 35);

		Student[] s = { st, st1, st2, st3 };

		System.out.println("-----------------------------------");

		Consumer<Student> c1 = (student1) -> {

			System.out.println("Name : " + student1.name);
			System.out.println("Marks : " + student1.marks);
			System.out.println("Grade : " + f1.apply(student1));
			System.out.println("-----------------------------------");
		};

		for (Student stu : s) {
			if (p1.test(stu)) {
				c1.accept(stu);
			}
		}

	}
}
