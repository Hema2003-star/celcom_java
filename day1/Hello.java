package com.day1;

import java.lang.String;
import java.lang.System;

//command line argument
public class Hello{
	public static void main(String args[])
	{
		System.out.println("argument total:" +args.length);
		System.out.println("argument 1:" +args[0]);
		System.out.println("argument 2:" +args[1]);
	}
}