package com.hr.tutorials.crack.algorithms;

import java.util.Scanner;

public class BubbleSort {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        in.close();
        
        int swaps = 0;
        for(int i=0; i<a.length ; i++)
            for(int j=i+1 ; j<a.length ; j++){
            //System.out.println(i+","+j);
            if(a[i] > a[j]){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                swaps++;
            }
        }
        System.out.println("Array is sorted in "+swaps+" swaps.");
        System.out.println("First Element: "+a[0]);
        System.out.println("Last Element: "+a[a.length-1]);
        
    }

}
