//Write a Java program to create a class called "Circle" with a radius attribute. 
//You can access and modify this attribute. 
//Calculate the area and circumference of the circle.
//Circumference: C = 2πr
//Area: A = πr²

package com.assignments;

import java.util.Scanner;

class Circle {

	// variable
	private float radius;

	// constructor
	Circle(float radius) {
		this.radius = radius;

	}

	// getter and setter
	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	// method 1
	void areaOfCircle() {

		float area = (float) (Math.PI * (radius * radius));
		System.out.printf("The area of circle : %.2f", area);
		System.out.println("");

	}

	// method 2
	void perimeterOfCircle() {

		float perimeter = (float) (2 * Math.PI * radius);
		System.out.printf("The perimeter of circle : %.2f ", perimeter);
		System.out.println("");
		System.out.println("------------------------------");

	}
}

public class Problem4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the radius of the circle :");
		float radius = sc.nextFloat();

		Circle circle = new Circle(radius);
		circle.areaOfCircle();
		circle.perimeterOfCircle();

		circle.setRadius(radius);

		System.out.println("");
		System.out.println("After modifying the radius");
		System.out.println("");

		circle.areaOfCircle();
		circle.perimeterOfCircle();

	}

}
