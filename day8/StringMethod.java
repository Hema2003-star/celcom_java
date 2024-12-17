package com.day8;

public class StringMethod {

	public static void main(String[] args) {

		String s1 = "java";

		System.out.println(s1.length()); // 4

		System.out.println(s1.charAt(2)); // v

		System.out.println(s1.concat("world")); // java world

		System.out.println(s1.equals("java")); // false

		System.out.println(s1.equalsIgnoreCase("java")); // true

		System.out.println(s1.indexOf('a')); // 1 return first occurence

		System.out.println(s1.lastIndexOf('a')); // 3

		System.out.println(s1.indexOf('b')); // -1 invalid index

		System.out.println(s1.startsWith("Ja")); // flase

		System.out.println(s1.endsWith("va")); // true

		System.out.println(s1.replace('a', 'i')); // jivi

		System.out.println(s1.toUpperCase()); // JAVA

		System.out.println(s1.toLowerCase()); // java
		
		String s2 = "Java World";
		
		System.out.println(s2.substring(3, 7)); //a World
		
		System.out.println(s2.substring(3));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
