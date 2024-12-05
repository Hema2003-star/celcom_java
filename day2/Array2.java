package com.Day2;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {

		int arr[] = new int[5];
		int duplicateCount = 0 ;
		
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Enter" + " " + arr.length + " " + " Elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}


		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = i + 1; arr[i] != -1 && j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					arr[j] = -1;
					count++;
				}
			}

			if (count > 0) {
				duplicateCount++;
			}
		}

		System.out.println("the number of duplicate is : " + duplicateCount);
		sc.close();
	}

}
