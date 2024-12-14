package com.day6;

public class HashClass {
	int a = 10; 
	public static void main(String[] args) {
		
		HashClass obj1 = new HashClass();
		HashClass obj2 = obj1;
		
		
		//object assignment
		obj1.a = 20 ;
		System.out.println(obj2.a);
		
		//obj1 = null ;
		
		//obj2 = null ;
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		
	}
}
