package com.day5;

interface VehiclePlan { // interface
	void engineNos();

	void wheelsNos();

	void brandName();

}

abstract class Vehiclese implements VehiclePlan { // abstract class

	public void engineNos() {
		System.out.println("i have one engine");
	}

}

class Bikese extends Vehiclese { // normal class

	@Override
	public void wheelsNos() {
		System.out.println("i have two wheels");

	}

	@Override
	public void brandName() {
		System.out.println("my brand is honda");

	}

}

public class Interface5 {

	public static void main(String[] args) {
		
		VehiclePlan vehicle = new Bikese();
		vehicle.engineNos();
		vehicle.wheelsNos();
		vehicle.brandName();

	}

}
