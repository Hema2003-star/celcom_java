package com.day10;

import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;

public class HashMapExample {

	

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();

		map.put(20, "java");
		map.put(30, "c");
		map.put(40, "PHP");
		map.put(null, null); // accept null

		System.out.println(map);

		map.put(10, "hema"); // it will replace the value

		System.out.println(map);

		map.remove(40);
		System.out.println(map); // it will remove the 40

		System.out.println(map.get(20)); // java
		System.out.println(map.containsKey(20)); // true
		System.out.println(map.containsValue("hema")); // true
		System.out.println(map.isEmpty()); // false
		System.out.println(map.size()); // 4 consider null also only value

		Set<Integer> keys = map.keySet();

		// way1
		for (Integer i : keys) {
			System.out.println(i + " " + map.get(i));
		}
		System.out.println("-------------------");

		//---------------------------------------//
		Iterator<Integer> it = keys.iterator();
		while (it.hasNext()) {
			Integer t = it.next();
			System.out.println(t + " " + map.get(t));
		}
		
		// way2
		 Set<Entry<Integer, String>> entries =map.entrySet();
		  System.out.println(entries);
		  
		  for(Entry<Integer, String> entry : entries) {
			  System.out.println(entry.getKey()+" --> "+entry.getValue());
		  }
		  
		  
		  Iterator<Entry<Integer, String>> it1 = entries.iterator();
		  while(it1.hasNext()) {
			  Entry<Integer, String> entry = it1.next();
			  System.out.println(entry.getKey()+" --> "+entry.getValue());
		  }

	}

}
