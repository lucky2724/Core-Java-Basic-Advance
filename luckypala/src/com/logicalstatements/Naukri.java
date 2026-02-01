package com.logicalstatements;

import java.util.Scanner;

public class Naukri {
	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("Welcome to Naukri console Based Application..!");

		Scanner sc = new Scanner(System.in);

		System.out.println("What's your Full Name ?");
		String name = sc.nextLine();

		System.out.println("Hello Mr." + name + " Nice to meet you !!");

		System.out.println("When did you year ofpassed out ?");
		int yop = sc.nextInt();

		if (yop >= 2023 && yop <= 2025) {
			System.out.println("You are eligible for this job !!");

			System.out.println("Enter your Branch :");
			String branch = sc.next();

			if (branch.equalsIgnoreCase("cse") || branch.equalsIgnoreCase("ece")) {
				System.out.println("Your branch is matching with our Job !!");

				System.out.println("Enter your UG percentage : ");
				int percentage = sc.nextInt();

				if (percentage >= 70) {
					System.out.println("Woww , You have Good percentage !!");

					System.out.println("Do you Have any active Backlogs ..?");
					boolean backlogsStatus = sc.nextBoolean();

					if (!backlogsStatus) {
						System.out.println("Good , " + name + " we'll move to next step !! ");

						System.out.println("what programming languages do you know ..?");
						sc.nextLine();
						String prgLang = sc.nextLine();

						if (prgLang.equalsIgnoreCase("Java") || prgLang.equalsIgnoreCase("sql")) {
							System.out.println("Great to know !! your Skills are matching to our job Description");

							System.out.println("Do you know about OOps in java");
							boolean knowStatus = sc.nextBoolean();

							if (knowStatus) {
								System.out
										.println("Woww , Super !! You are almost matching with our Job Description..");

								System.out.println("Do you Know basic Front-end..?");
								boolean frontEndStatus = sc.nextBoolean();

								if (frontEndStatus) {
									System.out
											.println("Great !! ,Your Skills are matching with our Job description !!");
									System.out.println("Great to know !! , you are eligibe for this job..!!");
									System.out.println("Our team Contact with you through the email !!!");
									System.out.println("Thank You " + name + " !!");
								} else {
									System.out.println(
											"Sorry !!, we want some front-end basics ,first You learn that !!");
								}
							} else {
								System.out.println("Sorry !!, you can leave for the day..!!");
							}
						} else {
							System.out.println("Sorry !! Your Skills not matching with our Job description");
						}
					} else {
						System.out.println("Sorry For inconvinence !! First Clear your Backlogs !!! ");
					}
				} else {
					System.out.println("Sorry !! , your percentage is Low !!");
				}
			} else {
				System.out.println(" Sorry !! , Your Branch is Not matching with our Job Profile !!");
			}
		} else {
			System.out.println("Sorry !! You are not Eligible..!!");
		}
		
		sc.close();

	}
}
