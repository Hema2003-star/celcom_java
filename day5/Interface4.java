package com.day5;

interface MyInterfacess1 { // interface

	void abstractMethod1();

}

interface MyInterfacess2 extends MyInterfacess1 {
	void abstractMethod2();
}


class MyNormalClasss1 implements MyInterfacess2 { // implements

	@Override
	public void abstractMethod1() {
		System.out.println("My abstract method - 1");

	}

	@Override
	public void abstractMethod2() {
		System.out.println("My abstract method - 2");

	}

}

public class Interface4 {

	public static void main(String[] args) {

		MyInterfacess2 obj = new MyNormalClasss1();
		obj.abstractMethod1();
		obj.abstractMethod2();

	}

}
