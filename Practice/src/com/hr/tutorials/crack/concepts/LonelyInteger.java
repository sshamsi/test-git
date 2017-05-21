package com.hr.tutorials.crack.concepts;

import java.util.Scanner;

public class LonelyInteger {

	public static int lonelyInteger(int[] a){
		//return lonelyIntegerCountSolution(a);
		return lonelyIntegerBitSolution(a);
	}
	
	 public static int lonelyIntegerCountSolution(int[] a) {
	        int[] count = new int[101];
	        for(int i=0 ; i<a.length ; i++){
	            count[a[i]]++;
	        }
	        for(int j=0; j<count.length ; j++){
	            if(count[j]==1){
	                return j;
	            }
	        }
	        return 0;
	        
	 }
	 
	 public static int lonelyIntegerBitSolution(int[] a) {
		 	// Any number xor'd with itself will give zero.
		    // Any number xor'd with zero will give the number.
	        int value = 0;
	        for (int i : a) {
	            value ^= i;
	            System.out.println(value);
	        }
	        return value;
	 }

	    
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int a[] = new int[n];
	        for(int a_i=0; a_i < n; a_i++){
	            a[a_i] = in.nextInt();
	        }
	        in.close();
	        System.out.println(lonelyInteger(a));
	    }

}
