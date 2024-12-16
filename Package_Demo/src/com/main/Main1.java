package com.main;
import com.pack1.MyClass1;
import com.pack2.MyClass2;

public class Main1  {

	public static void main(String[] args) {
		MyClass1 obj1 = new MyClass1() ;
		MyClass2 obj2 = new MyClass2() ;
		
		obj1.myMethod() ;
		obj2.abstractMethod();
		
	}
}
