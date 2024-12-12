package com.day4;

class A {

	int multiply(int a, int b) {
		return a * b;
	}

	static int add(int a, int b) {
		return a + b;
	}

}

public class Instance {

	public static void main(String[] args) {

		A obj = new A();

		System.out.println("2 * 2 " + obj.multiply(2, 3));

		System.out.println("2 + 2 " + A.add(5, 3));
	}

}
