package com.day4;

public class MethodOverloading {

	// method overloading
	void myMethod(int a) { // method 1
		System.out.println("hi i'm with one integer argument");
		System.out.println("The value we got is :" +a);
		System.out.println("-------------------------");
	}

	int myMethod(int a, int b) { // method 2
		System.out.println("hi i'm with two integer argument");
		int c = a+b;
		System.out.println("-------------------------");
		return c;

	}

	void myMethod(String a) { // method 3
		System.out.println("hi i'm with one string argument , the value :" +a);
		System.out.println("-------------------------");

	}

	public static void main(String[] args) {

		MethodOverloading obj = new MethodOverloading(); // obj creation
		obj.myMethod(10);

		obj.myMethod("hema");

		System.out.println("The addition is: " +obj.myMethod(10, 20));
		
	}

}
