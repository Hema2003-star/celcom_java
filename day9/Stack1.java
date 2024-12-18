package com.day9;

import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		
		stack.push (10);
		stack.push (20);
		stack.push (30);
		stack.push (40);
		
		System.out.println(stack);
		
		stack.pop();  //remove the last element
		
		
		System.out.println(stack);
		
		System.out.println(stack.peek());  //show the top element
	}
}
