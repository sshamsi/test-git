package com.hr.tutorials.crack.data.structures;

import java.util.PriorityQueue;

public class Heaps {

	public static void main(String[] args) {
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		queue.add(7);
		queue.add(5);
		queue.forEach(System.out::println);

	}

}
