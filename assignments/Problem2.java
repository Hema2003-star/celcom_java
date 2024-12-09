//Write a Java program to create a class called "Dog" with a name and breed attribute. 
//Create two instances of the "Dog" class, set their attributes using the constructor and modify the attributes using the setter methods and print the updated values.

package com.assignments;

class Dog {

	// variable
	private String dName;
	private String dBreed;

	public Dog(String dName, String dBreed) {
		super();
		this.dName = dName;
		this.dBreed = dBreed;
	}

	// getter and setter method
	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	public String getdBreed() {
		return dBreed;
	}

	public void setdBreed(String dBreed) {
		this.dBreed = dBreed;
	}

	void display() {
		System.out.print("doggy name :" + dName + "       ");
		System.out.println("doggy breed :" + dBreed);
		System.out.println(" ");
	}

}

public class Problem2 {

	public static void main(String args[]) {

		Dog dog1 = new Dog("Rocky", "Dachshund");
		dog1.display();
		Dog dog2 = new Dog("kiddo", "Cavalier King Charles Spaniel");
		dog2.display();

		dog1.setdName("maggie");
		dog1.setdBreed("Cane Corso");
		
		System.out.println(" ");
		System.out.println("-------After modifying------");
		System.out.println(" ");
		System.out.print("doggy name : " + dog1.getdName() + "           ");
		System.out.println("doggy breed : " + dog1.getdBreed());

		dog2.setdName("harper");
		dog2.setdBreed("Shih Tzu");

		System.out.println(" ");
		System.out.print("doggy name : " + dog2.getdName() + "           ");
		System.out.println("doggy breed : " + dog2.getdBreed());

	}

}
