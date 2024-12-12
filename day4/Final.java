package com.day4;

public class Final {
	final static int speed = 10;
	
	void display() {
		System.out.println("The speed is :" +speed);
	}
	
	public static void main(String[] args) {
		
		final int speed =20;
		Final obj = new Final();
		obj.display();
		System.out.println("The value " +speed);
	}

}
