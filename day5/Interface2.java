package com.day5;


interface MyInterface { //interface
	
	void abstractMethod1() ;
	void abstractMethod2() ;	
}


class MyNormalClass implements MyInterface {

	@Override
	public void abstractMethod1() {
		System.out.println("My abstract method - 1");
		
	}

	@Override
	public void abstractMethod2() {
		System.out.println("My abstract method - 2");
		
	}
	
}

public class Interface2 {

	public static void main(String[] args) {
	
		MyInterface obj = new MyNormalClass() ;
		obj.abstractMethod1() ;
		obj.abstractMethod2() ;

	}

}
