package com.hacker.rank.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class ComparatorTest {
	
	public static void main(String[] args) {
	     Comparator<String> comparator = new StringLengthComparator();
	        PriorityQueue<String> queue = 
	            new PriorityQueue<String>(10, comparator);
	        queue.add("very long indeed");
	        queue.add("short");
	        queue.add("medium");
	        System.out.println("queue size is "+queue.size());
	        while (queue.size() != 0)
	        {
	            System.out.println(queue.remove());
	        }
	}

}
