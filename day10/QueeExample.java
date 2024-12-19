package com.day10;

import java.util.LinkedList;
import java.util.Queue;

public class QueeExample {
	public static void main(String[] args) {
		
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(10);
		queue.offer(20);
		queue.offer(30);
		queue.offer(40);
		
		System.out.println(queue);  //10 20 30 40
		
		queue.poll();
		
		System.out.println(queue);
		
		queue.remove(40);
		System.out.println(queue);
	}

}
