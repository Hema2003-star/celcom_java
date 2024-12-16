package com.day7;
import java.lang.String ;
import static java.lang.Integer.parseInt;
import static java.lang.Math.PI;

import static java.lang.System.out;

public class Statics {

	static int a = 10 ;  //static 
	
	public static void main(String[] args) {
		
		System.out.println(Statics.a);
		
		out.println(a);
		
		out.println(PI);    //PI it is a final variable  
		//we can access the PI value directly without classs name by import static java.lang.Math.PI; 
		
		int a = parseInt("123");
	}

}
