package com.hr.tutorials.crack.algorithms;

public class CheckBST {
	
	public class Node {
        int data;
        Node left;
        Node right;
     }
	
	boolean checkBST(Node root) {
		  
        return checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    boolean checkBST(Node root, int min, int max){
        if(root==null){
            return true;
        }
        if(root.data<=min || root.data>=max){
            return false;
        }

        return (checkBST(root.left,min,root.data) &&
            checkBST(root.right,root.data,max));
    }
    
    public static void main(String args[]){
    
    }
    
    public Node createBST(){

    	Node five = new Node();
    	five.data=5;
    	
    	Node seven = new Node();
    	seven.data=7;
    	
    	Node six = new Node();
    	six.data=6;
    	six.left=five;
    	six.right=seven;
    	
    	Node one = new Node();
    	one.data=1;
    	
    	Node two = new Node();
    	two.data=2;
    	
    	Node four = new Node();
    	four.data=4;
    	four.left=one;
    	four.right=two;
    	
    	Node root = new Node();
    	root.data=3;
    	root.left=four;
    	//root.right=
    	
    	return root;
    }
    
}
