package com.ems.main;

import java.util.Scanner;

import com.ems.model.Employee;
import com.ems.service.EmployeeService;

/**
 * @version 1.0 
 * It is the main class
 */

public class EMSApp {

	static Scanner sc = new Scanner(System.in);

	/**
	 * 
	 * @return static 
	 * It display the menu details
	 */

	public static int menu() {
		System.out.println("1. Insert Employee");
		System.out.println("2. Delete Employee");
		System.out.println("3. Update Employee");
		System.out.println("4. Find Employee");
		System.out.println("5. Find All Employee");
		System.out.println("6. Exit");

		System.out.println("Enter your choice : ");
		int choice = sc.nextInt();

		return choice;
	}

	/**
	 * 
	 * @return Static 
	 * It is performing insert view operation.
	 */

	public static Employee insertView() {
		System.out.println("Enter Employee id, name and salary");
		return new Employee(sc.nextInt(), sc.next(), sc.nextDouble()); // passing all data in one employee object
	}

	/**
	 * 
	 * @return Static 
	 * It is performing delete view operation.
	 */
	public static int deleteView() {
		System.out.println("Enter Employee id");
		return sc.nextInt();
	}

	/**
	 * 
	 * @return Static 
	 * It is performing update view operation.
	 */
	public static Employee updateView() {
		System.out.println("Enter Employee id, name and salary");
		return new Employee(sc.nextInt(), sc.next(), sc.nextDouble()); // passing all data in one employee object
	}

	/**
	 * 
	 * @return Static 
	 * It is performing find view operation.
	 */
	public static int findView() {
		System.out.println("Enter Employee id");
		return sc.nextInt();
	}

	/**
	 * 
	 * @param args 
	 * It is the main method
	 */
	public static void main(String[] args) {

		EmployeeService employeeService = new EmployeeService();
		String result = "";
		Employee employee;
		String msg = "";
		int id;

		do {
			int choice = menu();

			switch (choice) {
			case 1:
				employee = insertView();
				result = employeeService.insertValidation(employee);
				System.out.println(result);
				break;
			case 2:
				id = deleteView();
				result = employeeService.deleteValidation(id);
				System.out.println(result);
				break;
			case 3:
				employee = updateView();
				result = employeeService.updateValidation(employee);
				System.out.println(result);
				break;
			case 4:
				id = findView();
				result = employeeService.findValidation(id);
				System.out.println(result);
				break;
			case 5:
				result = employeeService.findAllValidation();
				System.out.println(result);
				break;
			case 6:
				System.out.println("Thank You");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice");

			}
			System.out.println("Do You Want TO Continue [yes | No ] ");
			msg = sc.next();

		} while (msg.equalsIgnoreCase("Yes"));

	}

}
