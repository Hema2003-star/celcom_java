package com.day5;

import java.util.Scanner;

abstract class Vehicleis {

	void nosOfEngine(String engine) {
		System.out.println("i have " + engine + " engine");
	}

	abstract void nosOfWheels(String wheel);

	abstract void brands(String brand);

}

class Cars extends Vehicleis {

	void brands(String brand) {

		System.out.println("my brand is : " + brand);
	}

	@Override
	void nosOfWheels(String wheel) {
		System.out.println("i have " + wheel + " wheels");
	}

}
//
//class Auto extends Vehicleis {
//
//	void brands() {
//
//		System.out.println("my brand is Tata");
//	}
//
//	@Override
//	void nosOfWheels() {
//		System.out.println("i have three wheels");
//	}
//
//}

public class Abstraction2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Vehicleis vehicle;
		vehicle = new Cars();
		
		System.out.println("Entering the car details");
		
		System.out.println("Enter the no of wheels :");
		String wheels = sc.next();
		System.out.println("Enter the brand name :");
		String brand = sc.next();
		System.out.println("Enter how many engines :");
		String engine = sc.next();

		vehicle.nosOfWheels(wheels);
		vehicle.nosOfEngine(engine);
		vehicle.brands(brand);

		System.out.println("------------------");

//		
//		vehicle = new Auto();
//		vehicle.nosOfWheels();
//		vehicle.nosOfEngine();
//		vehicle.brands();

	}

}
