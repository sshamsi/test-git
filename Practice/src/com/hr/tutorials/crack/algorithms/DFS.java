package com.hr.tutorials.crack.algorithms;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/*
 * Inorder (Left, Root, Right) : 
 * Preorder (Root, Left, Right) : List of vertices in the order they were first visited by DFS algorithm
 * Postorder (Left, Right, Root) : List of vertices in the order they were last visited by DFS algorithm
 */
public class DFS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static class Graph{
		int vertices;
		List<Integer>[] adjacencyList;
		
		@SuppressWarnings("unchecked")
		public Graph(int v){
			vertices = v;
			adjacencyList = new LinkedList[v];
			for(int i=0 ; i<v ; i++){
				adjacencyList[i] = new LinkedList<Integer>();
			}
		}
		
		public void addEdge(int u, int v){
			adjacencyList[u].add(v);
		}
		
		public void preOrderDFS(int s){
			LinkedList<Integer> list = new LinkedList<Integer>();
			list.push(s);
			while(!list.isEmpty()){
				int element = list.pop();
				System.out.print(element+" ");
				ListIterator<Integer> iterator = adjacencyList[element].listIterator();
				while(iterator.hasNext()){
				}
			}
		}
	}

}
