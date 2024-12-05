package com.Day2;

import java.util.Scanner;

public class Array3 {
	
public static void main(String[] args) {
		
		int arr[] = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter" + " " + arr.length + " " + " Elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int counteven = 0 ;
		int countodd = 0 ;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				counteven ++ ;
			}
			else {
				countodd ++ ;
			}
		}
		System.out.println("The even count is :" +counteven);
		System.out.println("The odd count is :" +countodd);
		sc.close();
}
}
