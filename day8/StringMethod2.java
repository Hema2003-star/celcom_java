package com.day8;

public class StringMethod2 {
	public static void main(String[] args) {

		String s1 = "java";

		char ch[] = s1.toCharArray();

		for (char c : ch) { // to traverse a string 1
			System.out.println(c);

		}

		for (int i = 0; i < s1.length(); i++) { // to traverse a string 2
			System.out.println(s1.charAt(i));
		}
		
		String s2 = "Welcome to Java World";
		
		String temp[] = s2.split(" ");
		for(String s : temp) {
			System.out.println(s);
		}

	}

}
