package com.day4;

class Vehicles {

	void VehicleFunctionality() {
		System.out.println("i have one engine");
	}

}

class Bikes extends Vehicles {

	Wheel wheel = null;

	Bikes(Wheel wheel) {
		this.wheel = wheel;
	}

	void bikeFunctionalities() {
		wheel.wheelFunctionalities();
	}
}

class Wheel {
	void wheelFunctionalities() {
		System.out.println("i'm wheel");
	}
}

public class Relationship {

	public static void main(String[] args) {
		Wheel wheel = new Wheel();

		Bikes bike = new Bikes(wheel);
		
		bike.bikeFunctionalities();
		bike.VehicleFunctionality();

	}

}
