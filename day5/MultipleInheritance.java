package com.day5;

interface One {
	int a = 10; // public static final
}

interface Two {
	int a = 20;
}

interface Three extends One, Two {
	void sum();
}

class NorrmalClass implements Three {
	public void sum() {
		System.out.println(One.a + Two.a); //to avoid the ambiguity issue of interface call the interface.variable
	}
}

public class MultipleInheritance {
	
	public static void main(String[] args) {
		
	
	NorrmalClass objs = new NorrmalClass();
	objs.sum();
	}
}
