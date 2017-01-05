package com.practice.sort;

public class Bubble {
	
	public static void main(String args[]){
		int[] integers = new int[]{5,4,3,2,1};
		sort(integers);
	}
	
	public static void sort(int[] integers){
		printArray(integers);
		int temp;
		for(int i=0; i<integers.length ; i++){
			for(int j=i+1 ; j<integers.length ; j++){
				if(integers[i]>integers[j]){
					temp = integers[j];
					integers[j] = integers[i];
					integers[i] = temp;
				}
				printArray(integers);
			}
		}
	}
	
	public static void printArray(int[] integers){
		for(int i=0; i<integers.length; i++){
			System.out.print(integers[i]+" ");
		}
		System.out.println();
	}
	
}
