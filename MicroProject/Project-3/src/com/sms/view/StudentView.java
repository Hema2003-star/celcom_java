package com.sms.view;


import java.util.Scanner;

import com.sms.model.Department;
import com.sms.model.Student;

/**
 * @version 1.0 It is performing View Service
 */

public class StudentView {

	static Scanner sc = new Scanner(System.in);
	static int id, dno;
	static String firstName, lastName, email, address, dname;
	
	/**
	 * it display menu
	 */
	public static int printMenu() {
		System.out.println("1. Insert Student");
		System.out.println("2. Delete Student");
		System.out.println("3. Update Student");
		System.out.println("4. Find Student");
		System.out.println("5. Find All Student");
		System.out.println("6. Insert Department");
		System.out.println("7. Delete Department");
		System.out.println("8. Update Department");
		System.out.println("9. Find Department");
		System.out.println("10. Find All Department");
		System.out.println("11. Exit");
		System.out.println("Enter your choice : ");
		
		int choice = sc.nextInt();

		return choice;
	}
	
	
		public static void printInvalidChoice() {
		System.out.println("Invalid Choice");
	}
		
		public static String askToContinue() {
			System.out.println("Do You Want TO Continue [yes | No ] ");
		    return sc.next();
			
		}

	/**
	 * 
	 * @param result
	 */
	public static void printResult(String result) {
		System.out.println(result);
	}

	/**
	 * 
	 * @return Static It is performing insert view operation.
	 */

	public static Student insertStudentView() {
		System.out.println("Enter Student id, firstName, lastName, email, address, dno");
		id = sc.nextInt();
		firstName = sc.next();
		lastName = sc.next();
		email = sc.next();
		address = sc.next();
		dno = sc.nextInt();

		Department department = new Department();
		department.setDno(dno);

		return new Student(id, firstName, lastName, email, address, department);
	}

	/**
	 * 
	 * @return Static It is performing delete view operation.
	 */
	public static int deleteStudentView() {
		System.out.println("Enter Student id");
		return sc.nextInt();
	}

	/**
	 * 
	 * @return Static It is performing update view operation.
	 */
	public static Student updateStudentView() {
		System.out.println("Enter Student id, firstName, lastName, email, address and dno to update student");
		id = sc.nextInt();
		firstName = sc.next();
		lastName = sc.next();
		email = sc.next();
		address = sc.next();
		dno = sc.nextInt();

		Department department = new Department();
		department.setDno(dno);

		return new Student(id, firstName, lastName, email, address, department);
	}

	/**
	 * 
	 * @return Static It is performing find view operation.
	 */
	public static int findStudentView() {
		System.out.println("Enter Student id");
		return sc.nextInt();
	}

}
