package com.day8;

public class StringBufferss {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("java");
		sb.append(" world");

		System.out.println(sb);

		StringBuffer sb1 = new StringBuffer();
		System.out.println(sb1.capacity());

		// palindrome
		StringBuffer sb2 = new StringBuffer("madam");
		StringBuffer sb3 = new StringBuffer(sb2.reverse().toString());
		
		if (sb2.toString().equals(sb3.toString())) {
			System.out.println("palin");

		} else {
			System.out.println("not palin");
		}
		//---------------------------------------------------//
		String s1 = "hema";
		String s2 = new StringBuffer(s1).reverse().toString();
		if (s1.equals(s2)) {
			System.out.println("palin");

		} else {
			System.out.println("not palin");
		}

	}
}
