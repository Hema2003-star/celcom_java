package com.day5;

interface MyInterfaces { //interface
	
	void abstractMethod1() ;
		
}

interface MyInterfaces2  {
	void abstractMethod2() ;
}


class MyNormalClasss implements MyInterfaces , MyInterfaces2 {

	@Override
	public void abstractMethod1() {
		System.out.println("My abstract method - 1");
		
	}

	@Override
	public void abstractMethod2() {
		System.out.println("My abstract method - 2");
		
	}
	
}

public class Interface3 {

	public static void main(String[] args) {
	
		MyNormalClasss obj = new MyNormalClasss() ;
		obj.abstractMethod1() ;
		obj.abstractMethod2() ;

	}

}

