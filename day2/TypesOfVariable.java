package com.Day2;

public class TypesOfVariable {
	
	//variable 
	int b = 10 ; //Instance or object variable
	static int a = 20 ; //static or class variables
	
	public static void main(String[] args) {
		int c = 10; //Local variable
	
		TypesOfVariable obj = new TypesOfVariable();
		
		System.out.println(c);
		System.out.println("----------------------");
		
		System.out.println(obj.b);
		System.out.println("----------------------");
		
		System.out.println(TypesOfVariable.a);// it is highly recommended
		System.out.println(obj.b);
		System.out.println(a);

	}

}
