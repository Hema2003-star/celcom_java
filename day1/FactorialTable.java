package com.day1;

import java.util.Scanner;

public class FactorialTable {
	
	public static void main(String args []) {
		
		int fact = 1;

		System.out.println("Enter the number to find the factorial :");

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		
		
		System.out.println("No \t Factorial " );	
		for (int j =1 ; j <= num; j++) {
			fact = fact * j;
			System.out.println(j + "\t"  +fact);
		}
		
		
		
		sc.close();
	}
}
