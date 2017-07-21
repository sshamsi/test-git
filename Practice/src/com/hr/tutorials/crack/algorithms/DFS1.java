package com.hr.tutorials.crack.algorithms;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * 
 * @author sshamsi
 * DFS using stack
 */
public class DFS1 {

	public static void main(String[] args) {
		Graph g = new Graph(5);
		g.addEdge(1, 2);
		g.addEdge(1, 3);
		g.addEdge(2, 4);
		g.addEdge(2, 5);

		g.dfs(1);
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
		
		/*
		* let S be a stack
     	* S.push(v)
        * while S is not empty
        *  v = S.pop()
        *  if v is not labeled as discovered:
        *      label v as discovered
        *      for all edges from v to w in G.adjacentEdges(v) do 
        *          S.push(w)
		*/
		public void dfs(int s){
			boolean[] visited = new boolean[vertices];
			LinkedList<Integer> list = new LinkedList<Integer>();
			list.push(s);
			while(!list.isEmpty()){
				int element = list.pop();
				System.out.print(element+" ");
				/*
				 * Mark each element as visited as it is popped from stack
				 */
				visited[element] = true;
				ListIterator<Integer> iterator = adjacencyList[element].listIterator();
				while(iterator.hasNext()){
					int node = iterator.next();
					/*
					 * Push node into stack only if is not visited
					 */
					if(!visited[node]){
						list.push(node);
					}
				}
			}
		}
		

	}

}
