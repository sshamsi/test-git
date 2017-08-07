package com.hr.algorithms.sort;

import java.util.Arrays;

public class InsertionSort1 {

	public static void main(String[] args) {
		int[] array = {2,4,6,8,3};
		insertIntoSorted(array);

	}
	
    public static void insertIntoSorted(int[] ar) {
        // Fill up this function  
        
        int element = ar[ar.length-1];
        boolean inserted=false;
        
        for(int i=ar.length-2; i>=0; i--){
            if(!inserted){
                if(ar[i]>element){
                    ar[i+1] = ar[i]; 
                }
                else{
                    ar[i+1] = element;
                    inserted = true;
                }
                Arrays.stream(ar).forEach(item -> System.out.print(item+" "));
                System.out.println();
            }
        }
        
        if(!inserted && ar[0]==ar[1]){
            ar[0] = element;
            Arrays.stream(ar).forEach(item -> System.out.print(item+" "));
        }
    }

}
