package com.day5;

//abstract class with constructor
abstract class Vehiclei1 {

	Vehiclei1() { // abstract class constructor can be called by super keyword
		System.out.println("Abstract class constructor");

	}

	// if u want call integer type constructor
	Vehiclei1(int a) {
		this();
		System.out.println("Abstract class integer constructor");

	}

	void nosOfEngine() {
		System.out.println("I have one engine");
	}

	abstract void nosOfWheels();

	abstract void brands();

}

class Cars1 extends Vehiclei1 {

	Cars1() { // integer type constructor
		super(2);
	}

	void brands() {

		System.out.println("my brand is honda ");
	}

	@Override
	void nosOfWheels() {
		System.out.println("I have two wheels");
	}

}

public class Interface {

	public static void main(String[] args) {

		Vehiclei1 vehicles;
		vehicles = new Cars1();

		vehicles.nosOfWheels();
		vehicles.nosOfEngine();
		vehicles.brands();

		System.out.println("------------------");

	}

}
