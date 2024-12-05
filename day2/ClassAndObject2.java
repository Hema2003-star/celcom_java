package com.Day2;

//Class 
class Mobile {

	// Variables
	int mob_Id;
	String mob_Brand;
	float mob_Price;

	// constructor
	Mobile(int mob_Id, String mob_Brand, float mob_Price) {

		this.mob_Id = mob_Id;
		this.mob_Brand = mob_Brand;
		this.mob_Price = mob_Price;
	}

	// method
	void display() {
		System.out.println("Mobile mobId : " + mob_Id);
		System.out.println("Mobile mobBrand : " + mob_Brand);
		System.out.println("Mobile mobPrice : " + mob_Price);
		System.out.println("---------------------------");
	}
}

//main class
public class ClassAndObject2 {

	public static void main(String[] args) {
		
		Mobile m1 = new Mobile(101, "nokia", 10000);
		m1.display();

		Mobile m2 = new Mobile(102, "redmi", 20000);
		m2.display();

	}

}
