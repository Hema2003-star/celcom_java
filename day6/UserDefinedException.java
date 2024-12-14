package com.day6;

import java.util.Scanner;

class AgeException extends Exception {
	@Override
	public String toString() {
		return "invalid age";
	}
}

public class UserDefinedException {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();

		if (age >= 18) {
			System.out.println(" Welcome to vote ");
		} else {
			try {
				throw new AgeException();
			} catch (AgeException e) {
				System.out.println(e);
			}
		}

	}

}
