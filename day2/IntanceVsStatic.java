package com.Day2;

public class IntanceVsStatic {

	// variable
	int a = 10;        // instance or object variable
	static int b = 20; // static or class variable

	public static void main(String[] args) {
		IntanceVsStatic obj1 = new IntanceVsStatic();
		IntanceVsStatic obj2 = new IntanceVsStatic();
		
		//before reinitialization
		System.out.println("object variable of obj1: " + obj1.a);
		System.out.println("object variable of obj2: " + obj2.a);
		
		System.out.println("---------------");

		System.out.println("static variable of obj1: " + obj1.b);
		System.out.println("static variable of obj2: " + obj2.b);
		
		

		obj1.a = 20; // only in obj 1 will change
		obj1.b = 30; // both obj will change
		
		//after reinitialization
		System.out.println("After reintialize");
		System.out.println("object variable of obj1: " + obj1.a);
		System.out.println("object variable of obj2: " + obj2.a);
		
		System.out.println("---------------");

		System.out.println("static variable of obj1: " + obj1.b);
		System.out.println("static variable of obj2: " + obj2.b);
	}

}
