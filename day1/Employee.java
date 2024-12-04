package com.day1;


import java.lang.String;
import java.lang.System;
import java.util.Scanner;


//command line argument
public class Employee{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your employee id");
		int id = sc.nextInt();
		
		System.out.println("Enter your employee name");
		String name = sc.next();

		System.out.println("Enter your employee salary");
		float salary = sc.nextFloat();

		System.out.println("Employee details");

		System.out.println("name : " +id);
		System.out.println("name : " +name);
		System.out.println("name : " +salary);
		
		sc.close();
	
	}
}