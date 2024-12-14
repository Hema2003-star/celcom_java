package com.day6;
import java.io.FileNotFoundException; 
import java.io.FileReader;

class Exception2 {
	void myMethod() throws FileNotFoundException {  //business logic
		//Checked Exception
				FileReader fr  = new FileReader("hema.txt") ;    

	}
	
	void myMethod1() {   //exception handler method   // this method should handle the error of myMethod 
		try {
			myMethod() ;
		}
		catch(FileNotFoundException e) {
			myMethod1();
		}
	}

}
public class TypesException {
	
	public static void main(String[] args)  {
				
		Exception2 obj = new Exception2() ;
		obj.myMethod1();
				

	}

}
