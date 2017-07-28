package com.daon.arrays;

import java.util.Scanner;

public class LeftRotation {

	/**
	 * 
	 * @param a (array to be shifted)
	 * @param n (size of the array a)
	 * @param k (no. of times the elements of the array to be left shifted)
	 * @return left shifted array
 	 * Solution: We create a new array named 'rotated' and copy the elements 
 	 * from array 'a' to array 'rotated' directly at the desired position.
 	 */
    public static int[] arrayLeftRotation(int[] a, int n, int k) {
    	 int[] rotated = new int[n];
         
         for(int i=0 ; i<n ;i++){
        	 // move k to the beginning of the array
        	 // once end of the array is reached 
             if(k==n){
                 k = 0;
             }
             rotated[i] = a[k++];
         } 
         
         return rotated;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        in.close();
        int[] output = new int[n];
        output = arrayLeftRotation(a, n, k);
        for(int i = 0; i < n; i++)
            System.out.print(output[i] + " ");
      
        System.out.println();
        
    }

}
