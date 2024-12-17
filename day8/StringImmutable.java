package com.day8;

public class StringImmutable {
	public static void main(String[] args) {
		
		String s1= new String("java");
		
		s1.concat(" world");  // it is not assigning the like java world
		// because we are not assiging , string is immutable
		
		System.out.println(s1);
		
		s1 = s1.concat(" world"); 
		
		System.out.println(s1);
		
//		String s2 = "java";		
//		s2.concat(" world");		
//		System.out.println(s2);
		
		
		
		
		
		
		
	}
}
