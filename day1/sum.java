package com.day1;

import java.lang.String;
import java.lang.System;

//command line argument
public class sum
{
	public static void main(String args[])
	{
		if(args.length == 2)
		{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int sum = a + b;
		System.out.println("argument total:" +sum);
		}
		else{
			System.out.println("Error ");
		}	
}
}