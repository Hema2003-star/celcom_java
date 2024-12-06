package com.day3;

//constructor invocation order
//class A
class A {

	A() {
		System.out.println("i'm A class constructor");
	}
}

//class B
class B extends A {

	B() {
		System.out.println("i'm B class constructor");
	}

	B(int num) {
		this("hema");
		System.out.println("integer");
	}

	B(String name) {
		System.out.println("string");
	}

}

//main class
public class Constructor {

	public static void main(String args[]) {

		B b = new B(10);

	}

}
