package com.hr.data.structures.trees;

import org.junit.Assert;
import org.junit.Test;



public class MaxDepth {
	
	@Test
	public void test1(){
		/*
		 * Create nodes
		 */
		Node one = new Node(1);
		Node two = new Node(2);
		Node three = new Node(3);
		Node four = new Node(4);
		Node six = new Node(6);
		Node seven = new Node(7);
		
		/*
		 * Create relationships
		 */
		four.left = two;
		four.right = seven;
		two.left = one;
		two.right = three;
		seven.left = six;
		
		Assert.assertEquals(3, getDepth(four));
	}
	
	@Test
	public void test2(){
		/*
		 * Create nodes
		 */
		Node one = new Node(1);
		Node two = new Node(2);
		Node three = new Node(3);
		Node four = new Node(4);
		Node five = new Node(5);
		Node six = new Node(6);
		Node seven = new Node(7);
		
		/*
		 * Create relationships
		 */
		one.left = three;
		one.right = two;
		three.left = four;
		four.left = five;
		four.right = six;
		five.left = seven;
		
		Assert.assertEquals(5, getDepth(one));
	}
	
	public int getDepth(Node node){
		if(node==null){
			return 0;
		}
		else{
			int left = getDepth(node.left) + 1;
			int right = getDepth(node.right) + 1;
			if(left>right){
				return left;
			}
			else{
				return right;
			}
		}
	}
	
	public static class Node{
		int data;
		Node left;
		Node right;
		
		public Node(int data){
			this.data = data;
		}
	}

}
