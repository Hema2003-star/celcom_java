package com.day6;

public class GarbageClass {
	static int count = 0 ;
	
	GarbageClass () {
		count++ ;
		System.out.println(count);
	}
	
	@Override
	protected void finalize() throws Throwable {  // by default it is protected
		count -- ;
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		
		GarbageClass obj1 = new GarbageClass () ;
		GarbageClass obj2 = new GarbageClass () ;
		
		obj1 = null ;    // deference the object and call the garbage collection
		System.gc();  //  garbage collection is from heap   // calling the finalize method
		
		obj2 = null ;
		Runtime.getRuntime().gc();
		
	}

}
