package com.hr.tutorials.crack.algorithms;

/**
 * 
 * @author sshamsi
 *
 * Inorder (Left, Root, Right)
 * Preorder (Root, Left, Right) 
 * Postorder (Left, Right, Root) 
 *
 */
public class TreeTraversal {

	public static void main(String[] args) {
		
		/*
		 * Create nodes
		 */
		Node a = new Node("A");
		Node b = new Node("B");
		Node c = new Node("C");
		Node d = new Node("D");
		Node e = new Node("E");
		Node f = new Node("F");
		Node g = new Node("G");
		Node h = new Node("H");
		Node i = new Node("I");
		
		/*
		 * Create relationships
		 */
		f.left = b;
		b.right = d;
		b.left = a;
		d.left = c;
		d.right = e;
		f.right = g;
		g.right = i;
		i.left = h;
		
		/*
		 * Preorder tree
		 */
		System.out.print("PreOrder of tree is:");
		preOrder(f);
		System.out.println();
		
		/*
		 * Inorder tree
		 */
		System.out.print("InOrder of tree is:");
		inOrder(f);
		System.out.println();
		
		/*
		 * Postorder tree
		 */
		System.out.print("PostOrder of tree is:");
		postOrder(f);
		System.out.println();

	}
	
	public static void preOrder(Node root){
		if(root==null){
			return;
		}
		
		System.out.print(" "+root.name);
		
		preOrder(root.left);
		
		preOrder(root.right);
	}
	
	public static void inOrder(Node root){
		if(root==null){
			return;
		}
		
		inOrder(root.left);
		
		System.out.print(" "+root.name);
		
		inOrder(root.right);
	}
	
	public static void postOrder(Node root){
		
		if(root==null){
			return;
		}
		
		postOrder(root.left);
		
		postOrder(root.right);
		
		System.out.print(" "+root.name);
		
	}
	
	public static class Node{
		int id;
		String name;
		Node left;
		Node right;
		
		public Node(String name){
			this.name = name;
		}
	}

}
