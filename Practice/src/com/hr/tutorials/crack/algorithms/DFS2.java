package com.hr.tutorials.crack.algorithms;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * 
 * @author sshamsi
 * DFS using recursion
 */
public class DFS2 {
	
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
		boolean[] visited;
		
		@SuppressWarnings("unchecked")
		public Graph(int v){
			vertices = v+1;
			visited = new boolean[vertices];
			adjacencyList = new LinkedList[vertices];
			for(int i=0 ; i<vertices ; i++){
				adjacencyList[i] = new LinkedList<Integer>();
			}
		}
		
		public void addEdge(int u, int v){
			adjacencyList[u].add(v);
		}
		
		/*
		 * label s as discovered
		 * for all edges from s to t in G.adjacentEdges(v) do
4        * if vertex t is not labeled as discovered then
5        * recursively call dfs(t)
		 */
		public void dfs(int s){
			System.out.print(s+" ");
			visited[s] = true;
			Iterator<Integer> iter = adjacencyList[s].iterator();
			while(iter.hasNext()){
				int vertex = iter.next();
				if(!visited[vertex]){
					dfs(vertex);
				}
			}
		}
	}

}
