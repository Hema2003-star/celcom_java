package com.day7;

public class StackTrace {
		public static void main(String[] args) {
			
			try {
				 int a = 10 /0 ; //manually jvm is throwing the error
				throw new ArithmeticException("cannot divided by zero");   // developer throwing the predefined error 
				
			} catch (ArithmeticException e) {
				e.printStackTrace();

			}

		}

	}



