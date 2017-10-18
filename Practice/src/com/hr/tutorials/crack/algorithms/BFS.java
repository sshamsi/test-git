package com.hr.tutorials.crack.algorithms;

import java.util.Iterator;
import java.util.LinkedList;

public class BFS {

	public static void main(String[] args) {
		Graph g = new Graph(4);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 3);
		g.addEdge(2, 3);
		
		g.BFS(0);
	}
	
	public static class Graph{
		
		private int noOfNodes;
		LinkedList<Integer>[] nodes;
		
		@SuppressWarnings("unchecked")
		Graph(int n){
			noOfNodes = n;
			nodes = new LinkedList[noOfNodes];
			for(int i=0; i<n ; i++){
				nodes[i] = new LinkedList<Integer>();
			}
		}
		
		/*
		 * Add an edge to the graph
		 */
		public void addEdge(int u, int v){
			nodes[u].add(v);
		}
		
		/*
		 * Traverse the nodes from source
		 * Time complexity is O(V + E) since in worst case every vertex and edge will be explored in worst case
		 * Space complexity is O(V) 
		 */
		public void BFS(int source){
			
			boolean[] visited = new boolean[noOfNodes];
			
			LinkedList<Integer> queue = new LinkedList<Integer>();
			queue.add(source);
			visited[source] = true;
			
			while(!queue.isEmpty()){
				// 
				int node = queue.remove();
				System.out.print(node+" ");
				LinkedList<Integer> adjacents = nodes[node];
				Iterator<Integer> i = adjacents.iterator();
				while(i.hasNext()){
					int element = i.next();
					if(!visited[element]){
						queue.add(element);
						visited[element] = true;
					}
				}
			}
		}
	}

}
