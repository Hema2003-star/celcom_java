//overridden method can except at runtime , jvm will find the overridden with the help of obj

package com.day4;

//class 1
class Vehicle {
	void noOfEngine() {
		System.out.println("i have one engine");
	}

	void noOfWheels() {
		System.out.println("can not define here");
	}

	static void noOfBreak() {
		int a = 20;
		System.out.println("can not define here" + a);
	}

}

//class 2
class TwoWheeler extends Vehicle {
	void noOfWheels() {
		System.out.println("i have two wheels");
	}

	static void noOfBreak() {
		int a = 10;
		System.out.println("i have break of :" + a);
	}
}

public class MethodOverriding {

	public static void main(String[] args) {

		Vehicle obj = new TwoWheeler();
		// TwoWheeler obj = new TwoWheeler();
		obj.noOfWheels();
		obj.noOfEngine();
		obj.noOfBreak();

	}

}
