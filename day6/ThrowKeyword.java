package com.day6;

public class ThrowKeyword {

	public static void main(String[] args) {
		
		try {
			// int a = 10 /0 ; manually jvm is throwing the error
			throw new ArithmeticException("cannot divided by zero");   // developer throwing the predefined error 
			
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());

		}

	}

}
