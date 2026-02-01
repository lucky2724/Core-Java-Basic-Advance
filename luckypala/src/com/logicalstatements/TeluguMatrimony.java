package com.logicalstatements;

import java.util.Scanner;

public class TeluguMatrimony {
	public static void main(String[] args) {
		System.out.println("main method started...");
		System.out.println("======== Telugu Matrimonial Site =======");

		Scanner sc = new Scanner(System.in);

		System.out.println("Can you tell your Full name : ");
		String name = sc.nextLine();

		System.out.println("Hello mr." + name);

		System.out.println("Enter your assests and Salary : ");
		double assests = sc.nextDouble();
		System.out.println("Salary also >?");
		double salary = sc.nextDouble();

		if (assests >= 50000000 && salary >= 1500000) {
			System.out.println("Great to know !! Lets continue the discussion");

			System.out.println("Enter your age : ");
			int age = sc.nextInt();

			if (age <= 27 && age >= 22) {
				System.out.println("Oh nice !! your age is matching with our profile !");

				System.out.println("Enter your height");
				float height = sc.nextFloat();

				if (height >= 5.6 && height <= 6.2) {
					System.out.println("Okay !! We can proceed furthur !!");

					System.out.println("Enter your weight");
					double weight = sc.nextDouble();

					if (weight <= 80 && weight >= 65) {
						System.out.println("We almost good ,Lets discuss more !!");

						System.out.println("Do you have siblings ...?");
						boolean sibStatus = sc.nextBoolean();

						if (!sibStatus) {
							System.out.println("Yes !! we will contact later..");
						} else {
							System.out.println("Sorry !! we did n't expect !! you can leave for thr day");
						}
					} else {
						System.out.println("You must need to Join Gym ,Your profile is not matching");
					}
				} else {
					System.out.println("You are too Short or height not matching..");
				}
			} else {
				System.out.println("Your age is not matching with or profile ..");
			}

		} else {
			System.out.println("Sorry !! you can leave for the day..");
		}

		sc.close();

	}
}
