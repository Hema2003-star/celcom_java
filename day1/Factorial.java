package com.day1;

import java.util.Scanner;

public class Factorial {

	public static void main(String args[]) {
		int fact = 1;

		System.out.println("Enter the number to find the factorial :");

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("The Factorial of Number of "+ num +" : " +fact);
		sc.close();
	}
}
