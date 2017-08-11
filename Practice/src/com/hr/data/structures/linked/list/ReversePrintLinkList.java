package com.hr.data.structures.linked.list;

import org.junit.Test;

public class ReversePrintLinkList {
	
	@Test
	public void test1(){
		Node head = createLinkedList();
		reversePrint(head);
	}
	
	public void reversePrint(Node head){
		
		if(head.next!=null){
			reversePrint(head.next);
		}
		System.out.println(head.data);
		
	}
	
	public class Node {
		public Node(int data){
			this.data = data;
		}
        int data;
        Node next;
    }
	
	private Node createLinkedList(){
		Node one = new Node(1);
		Node two = new Node(2);
		Node three = new Node(3);
		
		one.next = two;
		two.next = three;
		
		return one;
	}

}
