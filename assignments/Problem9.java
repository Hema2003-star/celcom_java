//Write a Java program to create a class called Vehicle with a method called drive(). 
//Create a subclass called Car that overrides the drive() method to print "Repairing a car".

package com.assignments;

//class 
class Vehicle {

	// method
	void drive() {

		System.out.println("car runs smoothly");

	}
}

class Car {

	// overridedmethod
	void drive() {

		System.out.println("Repairing a car");
	}
}

//main
public class Problem9 {
	public static void main(String[] args) {

		Car car = new Car();
		car.drive();

	}

}
