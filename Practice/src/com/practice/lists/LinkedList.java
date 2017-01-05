package com.practice.lists;

public class LinkedList {
	
	private Node head;
	
	public static void main(String args[]){
		demostrateStack();
	}
	
	public static void demostrateStack(){
		LinkedList list = new LinkedList();
		list.push(new Integer(1));
		list.push(new Integer(2));
		list.push(new Integer(3));
		list.pop();
		list.print();
	}
	
	public void insertInFront(Object data){
		Node node = new Node(data);
		node.setNext(head);
		head = node;
	}
	
	public Node getHead(){
			return head;
	}
	
	public void push(Object data){
		insertInFront(data);
	}
	
	public void pop(){
		if(head != null){
			head = head.getNext();
		}
	}
	
	public void print(){
		if(head==null){
			System.out.println("List is empty");
		}
		else{
			System.out.print(head.getData());
			Node node = head; 
			while(node.getNext()!=null){
				node = node.getNext();
				System.out.print(", "+node.getData());
			}
		}
		
	}

}
