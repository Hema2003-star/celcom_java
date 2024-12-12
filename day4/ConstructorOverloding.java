package com.day4;

public class ConstructorOverloding {

	// constructor overloading
	
	ConstructorOverloding(int a) { // constructor 1
		this(10, 20);
		System.out.println("hi i'm with one integer argument");
		System.out.println("The value we got is :" + a);
		System.out.println("-------------------------");
	}

	ConstructorOverloding(int a, int b) { // constructor 2
		this("hema"); // calling constructor object
		System.out.println("hi i'm with two integer argument");
		System.out.println("The addition is :" + (a + b));
		System.out.println("-------------------------");

	}

	ConstructorOverloding(String a) { // constructor 3
		System.out.println("hi i'm with one string argument , the person :" + a);
		System.out.println("-------------------------");

	}

	public static void main(String[] args) {

		ConstructorOverloding obj1 = new ConstructorOverloding(10);

		// ConstructorOverloding obj2 = new ConstructorOverloding(10, 20);

	}

}
