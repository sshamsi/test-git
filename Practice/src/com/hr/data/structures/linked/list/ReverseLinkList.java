package com.hr.data.structures.linked.list;

import java.util.ArrayDeque;
import java.util.Deque;

import org.junit.Test;

public class ReverseLinkList {
	
	@Test
	public void test1(){
		Node root = reverseUsingStack(createLinkedList());
		while(root!=null){
			System.out.println(root.data);
			root = root.next;
		}
	}
	
	@Test
	public void test2(){
		Node root = reverse(createLinkedList());
		while(root!=null){
			System.out.println(root.data);
			root = root.next;
		}
	}
	
	public class Node {
		public Node(int data){
			this.data = data;
		}
        int data;
        Node next;
    }
	
	public Node reverse(Node root){
		
		Node prev = null;
		Node current = root;
		Node next = null;
		
		while(current!=null){
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		root = prev;
		
		return root;
	}
	
	public Node reverseUsingStack(Node root){
		if(root==null){
			return null;
		}
		
		// Create a stack
		Deque<Integer> stack = new ArrayDeque<Integer>();
		
		// Push all nodes of linked list into stack
		while(root!=null){
			stack.push(root.data);
			root = root.next;
		}
		
		root = null;
		Node reversedRoot = null;
		while(!stack.isEmpty()){
			if(root==null){
				root = new Node(stack.pop());
				reversedRoot = root;
			}
			else{
				root.next = new Node(stack.pop());
				root = root.next;
			}
		}
		
		return reversedRoot;
		
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
