package com.day4;

class Vehicle1 {
	final int a= 10;
	Vehicle1() {
		System.out.println("hi");
	}
	
	void method1() {
		System.out.println("hellooo" +a);
	}
}

class Bike extends Vehicle1 // here the final class cannot be inherited
{
	//Bike b = new Bike();

	Bike() {

		System.out.println("bike");
	}

	void method() {
		System.out.println("hello");
	}
}

public class FinalClass {
	private FinalClass() {
		System.out.println("hi");
	}

	public static void main(String[] args) {

		FinalClass obj = new FinalClass();
		Vehicle1 v = new Bike();
		v.method1();

	}

}
