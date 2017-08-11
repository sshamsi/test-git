package com.hr.data.structures.linked.list;

public class MergeSortedLinkList {

	class Node {
		int data;
		Node next;
	}

	public Node mergeLists(Node headA, Node headB) {
		// This is a "method-only" submission.
		// You only need to complete this method

		if (headA == null) {
			return headB;
		}

		if (headB == null) {
			return headA;
		}

		Node dummy = new Node();
		Node head = dummy;

		while (headA.next != null && headB.next != null) {
			if (headA.data < headB.data) {
				dummy.next = headA;
				headA = headA.next;
			} else {
				dummy.next = headB;
				headB = headB.next;
			}
			dummy = dummy.next;
		}
		
		if(headA!=null){
			dummy.next = headA;
		}
		
		if(headB!=null){
			dummy.next = headB;
		}

		return head.next;

	}

}
