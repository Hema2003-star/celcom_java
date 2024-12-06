package com.day3;

import java.util.Scanner ;

//class shapes
class Shapes {

	// variable
	int length;
	int breadth;
	int side;
	int height;

	// constructor 1
	public Shapes(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	// constructor 2
	public Shapes(int side) {
		super();
		this.side = side;
	}

	// constructor 3
	public Shapes(int length, int breadth, int height) {
		super();
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}

	// method
	void area() {
		System.out.println("cannot define a area for shape");
	}

}

//class Rectangle
class Rectangle extends Shapes {

	public Rectangle(int length, int breadth) {
		super(length, breadth);
	}

	void area() {
		int area = length * breadth;
		System.out.println("The area of rectangle :" + area);
	}

}

//class Square
class Square extends Shapes {

	public Square(int side) {
		super(side);
	}

	void area() {
		int area = side * side;
		System.out.println("The area of square :" + area);
	}
}

//class triangle
class Triangle extends Shapes {

	public Triangle(int length, int breadth, int height) {
		super(length, breadth, height);
	}

	void area() {
		int area = (length * breadth * height) / 2;
		System.out.println("The area of square :" + area);
	}
}

//main class
public class AreaCalculation {

	public static void main(String args[]) {
		
		int length ;
		int breadth ;
		int side ;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length value :");
		length = sc.nextInt();
		
		System.out.println("Enter the breadth value :");
		breadth = sc.nextInt();
		
		System.out.println("Enter the side value :");
		side = sc.nextInt();
		

		Rectangle rectangle = new Rectangle(length, breadth);
		rectangle.area();

		System.out.println("-----------------------------------");

		Square square = new Square(10);
		square.area();

		System.out.println("-----------------------------------");

		Triangle triangle = new Triangle(10, 20, 30);
		triangle.area();
	}

}
