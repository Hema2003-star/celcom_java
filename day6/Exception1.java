package com.day6;

public class Exception1 {
	int a = 10 ;
	public static void main(String[] args) {
		System.out.println("Before Exception");

		//int a = 10 / 0;   //jvm is throwing the exception                !arithmetic exception
		
		//-------------------------//
		
		//int arr[] = {10 ,20 ,30 } ;
		
		//System.out.println(arr[3]);    !ArrayIndexOutOfBoundsException
		
		//----------------------//
		
		//int arr[] = new int[-5];       !NegativeArraySizeException
		
		//int a = Integer.parseInt("abc");   !NumberFormatException
		
		
		//Exception obj = null ;
		//System.out.println(obj.a);    !NullPointerException

		System.out.println("After Excepton"); 
		
		
	}

}
