package com.hr.data.structures.linked.list;

import org.junit.Test;

public class DetectCycle {
	
	@Test
	public void test1(){
		Node head = createLinkedList();
		if(hasCycle(head)){
			System.out.println("The linked list contains cycle");
		}
		else{
			System.out.println("The linked list does not contain a cycle");
		}
	}
	
	public class Node {
		public Node(int data){
			this.data = data;
		}
        int data;
        Node next;
    }

	/**
	 * Tortoise and Hare algorithm
	 * Let x be the distance from head node to the node where the cycle starts
	 * Let y be the distance from cycle start node to the node where Tortoise and Hare meet
	 * Let z be the distance from the meeting node to the start of the cycle
	 * When Tortoise and Hare meet, Tortoise traveled x + y distance, Hare traveled x + 2y + z distance
	 * Distance traveled by Hare is twice distance traveled by Tortoise  
	 * Hence, 2(x + y) = x + 2y + z
	 * The above equation leads to x = z   
	 * Conclusion: Distance from head to cycle start node is always equal to distance from meeting node to cycle start node
	 * @param head
	 * @return
	 */
	public boolean hasCycle(Node head) {

	    Node tortoise = head;
	    Node hare = head;
	    
	    while(hare!=null && hare.next!=null){
	        tortoise = tortoise.next;
	        hare = hare.next.next;
	        if(tortoise==hare){
	            return true;
	        }
	    }
	    return false;
	}
	
	private Node createLinkedList(){
		Node one = new Node(1);
		Node two = new Node(2);
		Node three = new Node(3);
		Node four = new Node(4);
		Node five = new Node(5);
		
		one.next = two;
		two.next = three;
		three.next = four;
		four.next = five;
		five.next = one;
		
		return one;
	}

}
