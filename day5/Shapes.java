package com.day5;
import java.util.Scanner ;


	//class shapes
	abstract class Shapes1 {

		// variable
		int length;
		int breadth;
		int side;
		int height;

		// constructor 1
		public Shapes1(int length, int breadth) {
			super();
			this.length = length;
			this.breadth = breadth;
		}

		// constructor 2
		public Shapes1(int side) {
			super();
			this.side = side;
		}

		// constructor 3
		public Shapes1(int length, int breadth, int height) {
			super();
			this.length = length;
			this.breadth = breadth;
			this.height = height;
		}

		// method
		abstract void area() ;
			

	}

	//class Rectangle
	class Rectangle extends Shapes1 {

		public Rectangle(int length, int breadth) {
			super(length, breadth);
		}

		void area() {
			int area = length * breadth;
			System.out.println("The area of rectangle :" + area);
		}

	}

	//class Square
	class Square extends Shapes1 {

		public Square(int side) {
			super(side);
		}

		void area() {
			int area = side * side;
			System.out.println("The area of square :" + area);
		}
	}

	//class triangle
	class Triangle extends Shapes1 {

		public Triangle(int length, int breadth, int height) {
			super(length, breadth, height);
		}

		void area() {
			int area = (length * breadth * height) / 2;
			System.out.println("The area of triangle :" + area);
		}
	}

	//main class
	public class Shapes {

		public static void main(String args[]) {
			
			int length ;
			int breadth ;
			int side ;
			int height ;
			
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the length value :");
			length = sc.nextInt();
			
			System.out.println("Enter the breadth value :");
			breadth = sc.nextInt();
			
			System.out.println("Enter the side value :");
			side = sc.nextInt();
			
			System.out.println("Enter the height value :");
			height = sc.nextInt();
			

			Shapes1 shapes = new Rectangle(length, breadth);
			shapes.area();

			System.out.println("-----------------------------------");

			Shapes1 square = new Square(side);
			square.area();

			System.out.println("-----------------------------------");

			Shapes1 triangle = new Triangle(length, breadth, height);
			triangle.area();
		}

	}

