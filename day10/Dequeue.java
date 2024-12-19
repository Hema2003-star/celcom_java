package com.day10;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Dequeue {

	public static void main(String[] args) {

		Deque<Integer> queue = new LinkedList<>();
		queue.offer(10);
		queue.offer(20);
		queue.offer(30);
		queue.offer(40);

		queue.offerFirst(11);
		queue.offerLast(30);

		System.out.println(queue); // 10 20 30 40

		queue.pollFirst();

		queue.pollLast();

		System.out.println(queue);

		queue.remove(40);
		System.out.println(queue);
	}

}
