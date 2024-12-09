//1. Write a Java program to create a class called "Person" with a name and age attribute. 
//Create two instances of the "Person" class, set their attributes using the constructor, and print their name and age
package com.assignments;

//class
class Person {

	// variable
	String pName;
	int pAge;

	Person(String pName, int pAge) {
		this.pName = pName;
		this.pAge = pAge;
	}

	// method
	void display() {
		System.out.println("The name of the person is :" + pName);
		System.out.println("The name of the person is :" + pAge);
		System.out.println("-----------------------------------");

	}
}

//main
public class Problem1 {

	public static void main(String args[]) {

		Person person1 = new Person("hema", 21);
		person1.display();

		Person person2 = new Person("joe", 22);
		person2.display();

	}

}
