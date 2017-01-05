package com.hacker.rank.queue;

import java.util.Scanner;

public class AmazonListMax {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
        int n = stdin.nextInt();
        int m = stdin.nextInt();
        //System.out.println(n);
        //System.out.println(m);
        int[] list = new int[n];
        for(int i=0; i<m ; i++){
        	int a = stdin.nextInt();
        	int b = stdin.nextInt();
        	int k = stdin.nextInt();
        	list[a-1] = list[a-1] + k;
        	list[b-1] = list[b-1] + k;
        }
        stdin.close();
        for(int l : list){
        	System.out.println(l);
        }
        

	}

}
