package com.hr.tutorials.crack.algorithms;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/*
 * Inorder (Left, Root, Right) : Default Depth First Search
 * Preorder (Root, Left, Right) : List of vertices in the order they were first visited by DFS algorithm
 * Postorder (Left, Right, Root) : List of vertices in the order they were last visited by DFS algorithm
 */
public class DFS {

	public static void main(String[] args) {
		Graph g = new Graph(5);
		g.addEdge(1, 2);
		g.addEdge(1, 3);
		g.addEdge(2, 4);
		g.addEdge(2, 5);

		g.preOrderDFSIterative(1);
	}
	
	public static class Graph{
		int vertices;
		List<Integer>[] adjacencyList;
		
		@SuppressWarnings("unchecked")
		public Graph(int v){
			vertices = v+1;
			adjacencyList = new LinkedList[vertices];
			for(int i=0 ; i<vertices ; i++){
				adjacencyList[i] = new LinkedList<Integer>();
			}
		}
		
		public void addEdge(int u, int v){
			adjacencyList[u].add(v);
		}
		
		public void preOrderDFSIterative(int s){
			boolean[] visited = new boolean[vertices];
			LinkedList<Integer> list = new LinkedList<Integer>();
			list.push(s);
			while(!list.isEmpty()){
				int element = list.pop();
				System.out.print(element+" ");
				visited[element] = true;
				ListIterator<Integer> iterator = adjacencyList[element].listIterator();
				while(iterator.hasNext()){
					int node = iterator.next();
					if(!visited[node]){
						list.push(node);
					}
				}
			}
		}
	}

}
