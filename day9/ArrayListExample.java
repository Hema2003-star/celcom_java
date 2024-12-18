package com.day9;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {

		// ArrayList<Integer> = new ArrayList(); //not recommended

		List<Integer> list = new ArrayList<>(); // dmd //in list they overridden tostring method

		list.add(new Integer(10));
		list.add(20);
		list.add(30);
		list.add(40);

		System.out.println(list);

		// .....................................//

		List<Object> list1 = new ArrayList<>(); // Object store different type of object

		list1.add(new Integer(30));
		list1.add(20);
		list1.add("java");
		list1.add("hema");

		System.out.println(list1);

		list1.add(1, 25); // add value in particular index
		System.out.println(list1);

		System.out.println(list1.get(1));

		list1.remove(0); // remove
		System.out.println(list1);

		list1.set(0, 10); // remove and update
		System.out.println(list1);

		System.out.println(list1.contains(30)); // false

		System.out.println(list1.lastIndexOf(25)); // -1

		System.out.println(list1.indexOf("java"));

		System.out.println(list1.size());

		System.out.println(list1.isEmpty());
		
	}

}
