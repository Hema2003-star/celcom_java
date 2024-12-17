package com.day8;

public class StringMethod3 {

	public static void main(String[] args) {

		String s1 = new String("java");

		String s2 = new String("java");

		System.out.println(s1 == s2); // false

		System.out.println(s1.equals(s2)); // true

		String s3 = "java"; // take memory from string pool inside heap
		String s4 = "java"; // take memory from string pool inside heap

		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());

		// exact memory location
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s4));

		System.out.println(s1 == s3); // false
		System.out.println(s1.equals(s3)); // true

	}
}
