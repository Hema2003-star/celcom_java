package com.Day2;

//class
class Method2 {
	
	//static method
	void m1() {
		System.out.println("hi , this is non-static method ");
	}
	
	//non -static method
	static void m2() {
		System.out.println("hi , this is static method ");
	}

}

public class Method1 {
	
	public static void main(String[] args) {
		
		Method2 m = new Method2();
		
		//non static method
		m.m1();
		
		//static method
		Method2.m2();
		
		

	}

}
