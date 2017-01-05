package com.practice.lists;

public class Node {
	private Object data;
	private Node next;
	
	public void setNext(Node next) {
		this.next = next;
	}

	public Node(Object data){
		this.data = data;
	}
	
	public Node getNext(){
		return next;
	}
	
	public Object getData(){
		return data;
	}	
	
}
