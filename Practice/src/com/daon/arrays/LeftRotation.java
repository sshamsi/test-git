package com.daon.arrays;

import java.util.Scanner;

public class LeftRotation {

    public static int[] arrayLeftRotation(int[] a, int n, int k) {
        int[] rotated = new int[n];
        int shift = n-k;
        for(int i=0; i<n; i++){
            int index = i+shift;
            if(index<n){
                rotated[index] = a[i];   
            }
            else{
                index = index - n;
                rotated[index] = a[i]; 
            }    
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
