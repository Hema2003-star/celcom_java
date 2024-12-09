// Write a Java program to create a class called Shape with a method called getArea(). 
//Create a subclass called Rectangle that overrides the getArea() method to calculate the area of a rectangle.

package com.assignments;

import java.util.Scanner;

class Shape {

	float width;
	float height;

	public Shape(float width, float height) {
		this.width = width;
		this.height = height;

	}

	// method
	void getArea() {
	}
}

class Rectangles extends Shape {

	public Rectangles(float width, float height) {
		super(width, height);
	}

	// overrided method
	void getArea() {
		float area = (width * height);
		System.out.println("The area of a rectangle :" + area);
	}
}

//main
public class Problem10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Area of Rectangle");

		System.out.println("Enter the width :");
		float width = sc.nextInt();

		System.out.println("Enter the height :");
		float height = sc.nextInt();

		Rectangles rectangle = new Rectangles(width, height);
		rectangle.getArea();

	}

}
