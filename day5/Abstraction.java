package com.day5;

abstract class MyAbstractClass {

	abstract void myAbstractMethod1(); // abstract method

	abstract void myAbstractMethod2();

	void myNormalMethod() { // normal method
		System.out.println("normal / concrete method ");
	}
}

class NormalClass extends MyAbstractClass {

	@Override
	void myAbstractMethod1() {
		System.out.println("My abstract method - 1");

	}

	@Override
	void myAbstractMethod2() {
		System.out.println("My abstract method - 2");

	}

}
 class Abstraction {

	public static void main(String[] args) {
		MyAbstractClass obj = new NormalClass(); // only we can create the reference not object
		obj.myAbstractMethod1() ;
		obj.myAbstractMethod2() ;

	}

}
