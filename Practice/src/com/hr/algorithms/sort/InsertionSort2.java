package com.hr.algorithms.sort;

public class InsertionSort2 {

	public static void main(String[] args) {
		int[] array = {1,4,3,5,6,2};
	    insertionSortPart2(array);    

	}
	
	public static void insertionSortPart2(int[] ar) {
		// Fill up the code for the required logic here
		// Manipulate the array as required
		// The code for Input/Output is already provided

		for (int i = 1; i < ar.length; i++) {
			int element = ar[i];
			boolean inserted = false;
			for (int j = i - 1; j >= 0; j--) {
				if (!inserted) {
					if (ar[j] > element) {
						ar[j + 1] = ar[j];
					} else {
						ar[j + 1] = element;
						inserted = true;
					}
				}
			}
			if (!inserted && ar[0] == ar[1]) {
				ar[0] = element;
			}
			printArray(ar);
		}

	}
	
	private static void printArray(int[] ar) {
	      for(int n: ar){
	         System.out.print(n+" ");
	      }
	        System.out.println("");
	   }

}
