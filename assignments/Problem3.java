//Write a Java program to create a class called "Rectangle" with width and height attributes. 
//Calculate the area and perimeter of the rectangle.

package com.assignments;

import java.util.Scanner;

class Rectangle {

	// variables
	float width;
	float height;

	public Rectangle(float width, float height) {
		super();
		this.width = width;
		this.height = height;
	}

	void calculate() {
		float area = width * height;
		float perimeter = 2 * (height + width);

		System.out.println("The area of square :" + area);
		System.out.println("The perimeter of square :" + perimeter);
	}

}

public class Problem3 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the width of the rectangle :");
		float width = sc.nextFloat();

		System.out.println("Enter the height of the rectangle :");
		float height = sc.nextFloat();

		Rectangle rectangle = new Rectangle(width, height);

		rectangle.calculate();

	}

}
