package com.hr.data.structures.trees;

/**
 * 
 * @author sshamsi
 * Find lowest common ancestor of binary search tree
 */
public class LowestCommonAncestor {

	public static void main(String[] args) {
		
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
		
		Node result = lca(four,1,3);
		System.out.println("Lowest common ancestor is "+result.data);
	}
	
	public static class Node{
		int data;
		Node left;
		Node right;
		
		public Node(int data){
			this.data = data;
		}
	}
	
	public static Node lca(Node root,int v1,int v2)
    {
        if(v1<root.data && v2<root.data){
            return lca(root.left, v1, v2);
        }
        else if(v1>root.data && v2>root.data){
            return lca(root.right, v1, v2);
        }
        else{
            return root;
        }
        
    }

}
