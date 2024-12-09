// Write a Java program to create a class called Animal with a method called makeSound().
//Create a subclass called Cat that overrides the makeSound() method to bark.

package com.assignments;

//super class
class Animal {

	void makeSound() {

		System.out.println("sounds : bark");

	}
}

//subclass
class Cat extends Animal {

	void makeSound() { // overrided method

		System.out.println("sounds : meow");
	}
}

//main class
public class Problem8 {

	public static void main(String[] args) {

		Cat cat = new Cat();
		cat.makeSound();

	}

}
