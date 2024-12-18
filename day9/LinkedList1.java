package com.day9;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.List;

public class LinkedList1 {
		
		public static void main(String[] args) {
			
			List<Integer> list =  new LinkedList<>();
			
			list.add(50);
			list.add(10);
			list.add(20);
			list.add(60);
			list.add(33);
			
			
			System.out.println(list);
			
			//traverse the elements
			
			//way1
			for(int i = 0 ; i < list.size(); i++) {
				System.out.println(list.get(i));
			}
			System.out.println();
			
			//way2
			for(Object i : list ) {
				System.out.println(i);
			}
			System.out.println();
			
			//way3
			Iterator<Integer> it = list.iterator();
			while(it.hasNext()) {
				//Integer t = it.next();
				if(it.next() % 2 == 1) {
					it.remove();				
				}
				
			}
			System.out.println(list);
			
			
			
			
		}

	}


