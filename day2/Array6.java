package com.Day2;

import java.util.Scanner;

public class Array6 {

	public static void main(String[] args) {

				int arr[][] = new int [3][];
				
				arr[0] = new int[] {1,2};
				arr[1] = new int[] {3,4,5,6};
				arr[2] = new int[] {7,8,9};

				Scanner sc = new Scanner(System.in);

			    //printing elements
				System.out.println("The Array Elements :");
				for (int i = 0; i < arr.length; i++) {
					for(int j = 0 ; j < arr[i].length ; j++ ) {
						System.out.print(arr[i][j] +" ");				
					}
					System.out.println();			
				}
				
				System.out.println("-------------");	
				
				for(int i[] : arr) {
					for(int j : i) {
						System.out.print(j + " ");	
					}
					System.out.println();	
				}
				sc.close();


	}

}
