package com.day6;

public class CloneClass implements Cloneable { // for security purpose 
	int a = 10 ;
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		CloneClass obj1 = new CloneClass () ;
		CloneClass obj2 = (CloneClass) obj1.clone() ;
		
		 //clone method is checked exception so we have to handle it
		
		
		
		obj1.a = 20 ;
		
		System.out.println(obj2.a);
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());

		

	}

}
