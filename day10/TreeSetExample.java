package com.day10;

import java.util.LinkedHashSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
		
			public static void main(String[] args) {

				Set<Integer> set = new TreeSet<>(Collections.reverseOrder());
				
				
				//ascending order
				set.add(10);
				set.add(20);
				set.add(40);
				set.add(20);
				//set.add(null);  // no null for set because it does not take null 
			

				System.out.println(set);

				System.out.println(set.size());
				System.out.println(set.contains(10));
				System.out.println(set.isEmpty());
				System.out.println(set.equals(10));
				// System.out.println(set.remove(20));
				// set.clear();

				// for each
				for (Integer i : set) {
					System.out.println(i);
				}

				System.out.println("-----------------");
				// iterator
				Iterator<Integer> e = set.iterator();
				while (e.hasNext()) {
					System.out.println(e.next());
					
				}
				
				
				
				

			}

		}

