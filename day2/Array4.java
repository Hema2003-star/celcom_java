package com.Day2;

import java.util.Arrays;
import java.util.Scanner;

public class Array4 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		int size;
		System.out.println("Enter the size of an array :");
		size = sc.nextInt();
		
		int arr[] = new int[size];

		// Getting elements
		System.out.println("Enter" + " " + arr.length + " " + " Elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr);

		for (int i : arr) {
			System.out.println(i);
		}

		// Ascending order
		System.out.println("The sorted elements of Ascending order :");

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		// Descending order
		System.out.println("The sorted elements of Descending order :");

		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);

		}
		sc.close();
	}

}
