package com.day3;

//class parent
class vehicle {

	void noOfEngine() {
		System.out.println("i have one engine");
	}
}

//class child 1
class TwoWheeler extends vehicle {

	void noOfWheels() {
		System.out.println("i have two wheels");
	}

}


class ThreeWheeler extends vehicle {
					
	void noOfWheels() {									//hierarchy
		System.out.println("i have three wheels");
	}
}

class auto extends ThreeWheeler {
		void brandName() {							//multilevel	
		
			System.out.println("Brand name is : tata");
	}
	
}

//class child 2
class Bike extends TwoWheeler {

	void brandName() {							//multilevel
		
		System.out.println("Brand name is : Honda");
	}

}



//main class
public class SingleInheritance {

	public static void main(String args[]) {
		
		Bike duo = new Bike();
		duo.brandName() ;
		duo.noOfEngine();
		duo.noOfWheels();
		
		System.out.println("-----------------------------------");
		
		auto speed = new auto();
		speed.brandName() ;
		speed.noOfEngine();
		speed.noOfWheels();
		
		

	}

}
