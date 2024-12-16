package com.day7;

public class InnerClass1 {
	
	interface Inner4 {
		void display();
	}
	class Inner1 {
		Inner1() {  // we can have constructor in inner class
			System.out.println("constructor");
		}
		void display() {
			System.out.println("non-static inner class");
		}

	}

	static class Inner2 {
		void display() {
			System.out.println("static inner class");
		}
	}

	public static void main(String[] args) {

		InnerClass1 obj = new InnerClass1();
		Inner1 obj2 = obj.new Inner1(); // to call the inner class method we need to create obj for super class
										// reference
		obj2.display();

		Inner2 obj3 = new InnerClass1.Inner2();
		obj3.display();

		// Inner2.display(); // for static class and static method we can directly
		// access

		// local inner class
		class Inner3 {
			void display() {
				System.out.println("local inner  class");
			}
		}
		Inner3 obj4 = new Inner3(); // local inner class obj
		obj4.display();

		// annoymous inner class (a inner class without name)
		Inner4 obj5 = new Inner4 () {
				public void display() {
					System.out.println("annoymouss");
				}
				
		};
		obj5.display();
		
		
	}
}
