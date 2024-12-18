package com.day9;

import java.util.Vector;
import java.util.Vector;

public class Vector1 {
	public static void main(String[] args) {
		
		Vector<Integer> vec = new Vector<>(3,2); //3 is initial capacity, 2 is incrementing factor
		
		System.out.println(vec.size());//0
		System.out.println(vec.capacity()); //3
		
		vec.add(20);
		vec.add(30);
		vec.add(40);
		
		System.out.println(vec.size()); //3
		System.out.println(vec.capacity()); //3
		
		vec.add(50);
		
		System.out.println(vec.size()); //3
		System.out.println(vec.capacity()); //5
		
	}
}
