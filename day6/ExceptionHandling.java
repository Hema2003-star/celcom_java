package com.day6;

public class ExceptionHandling {

	public static void main(String[] args) {

		System.out.println("Before Exception");

		try {
			//int a = 10 / 0; // it will take first error and leaves the try block
			//int b = Integer.parseInt("abc");
			int c[] = new int[-5] ;
		} catch (ArithmeticException e) { // arithmetic exception is a predefined class of lang package
			System.out.println("The Error because of : " + e.getMessage());

		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds Exception is occured");
		}

		catch (NumberFormatException e) {
			System.out.println("NumberFormatException Exception is occured");
		}
		
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		finally {
			System.out.println("Inside finally"); 
		}

		System.out.println("After Exception");

	}

}
