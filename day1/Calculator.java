package com.day1;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		System.out.println("Calculator Program");

		Scanner sc = new Scanner(System.in);

		int firstNum;
		int secondNum;
		int ans;
		String user = "";

		do {
			System.out.println("1.Addition");
			System.out.println("2.subtraction");
			System.out.println("3.multiplication");
			System.out.println("4.division");
			System.out.println("5.exit");

			int choice;

			System.out.println("enter you choice");
			choice = sc.nextInt();

			System.out.println("enter first number");
			firstNum = sc.nextInt();

			System.out.println("enter second number");
			secondNum = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Addition");

				ans = firstNum + secondNum;
				
				System.out.println("addition is :" + ans);

				break;

			case 2:
				System.out.println("Subtraction");

				ans = firstNum - secondNum;

				System.out.println("Subtraction is :" + ans);

				break;

			case 3:
				System.out.println("Multiplication");

				ans = firstNum * secondNum;

				System.out.println("Multiplication is :" + ans);

				break;

			case 4:
				System.out.println("Division");

				ans = firstNum / secondNum;

				System.out.println("division is :" + ans);

				break;

			case 5:
				System.out.println("Thank you");
				System.exit(0);

			default:
				System.out.println("invalid");

			}

			System.out.println("Do you want to continue (Yes | No)");
			user = sc.next();
		} while (user.equalsIgnoreCase("Yes"));

		sc.close();

	}

}
