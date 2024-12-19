package com.day10;

import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityClass {
	public static void main(String[] args) {
		

				Queue<Integer> pqueue = new PriorityQueue<>(Collections.reverseOrder());
				pqueue.offer(50);
				pqueue.offer(20);
				pqueue.offer(5);
				pqueue.offer(40);
				pqueue.offer(70);
				pqueue.offer(5);

				System.out.println(pqueue); 
				pqueue.poll();	
				
				
				System.out.println(pqueue);
			}
		
	}

