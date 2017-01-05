package com.practice.stacks;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        Deque<Integer> stack = new LinkedList<Integer>();
        int n = scan.nextInt();
        int max=0;
        for(int i=1 ; i<=n ; i++){
            int queryId = scan.nextInt();
            switch(queryId){
                case 1: stack.push(scan.nextInt());
                        break;
                
                case 2: stack.pop();
                        break;
                
                case 3: if(!stack.isEmpty()){
                			
                            Iterator<Integer> iter = stack.iterator();
                            while(iter.hasNext()){
                                int element = iter.next();
                                if(element>max){
                                    max = element;
                                }
                            }
                            System.out.println(max);
                        }
                        break;
            }
        }
        scan.close();
    }
}