package com.day8;

public class String1 {

	public static void main(String[] args) {

		// three way to create string
		String s1 = "java"; // 1

		String s2 = new String("hema"); // 2

		char ch[] = { 'h', 'i' };
		String s3 = new String(ch); // 3

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}

}
