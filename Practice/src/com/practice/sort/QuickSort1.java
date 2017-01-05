package com.practice.sort;

import java.util.Arrays;

public class QuickSort1 {
	
	public static void main(String args[]){
		int[] numbers = new int[]{4,5,2,1,3};
		//int[] numbers = new int[]{2,1};
		sort(numbers);
		System.out.println(Arrays.toString(numbers));
	}
	
	public static void sort(int numbers[]){
		
		if(numbers.length<2){
			return;
		}
		
		//int pivot = numbers.length/2;
		//System.out.println("pivot is "+pivot);
		for(int i=0, j=numbers.length-1; i<j ; i++,j--){
			if (numbers[i] > numbers[j]){
				int temp = numbers[i];
				numbers[i] = numbers[j];
				numbers[j] = temp;
			}
		}
		sort(Arrays.copyOfRange(numbers, 0, numbers.length/2));
		sort(Arrays.copyOfRange(numbers, numbers.length/2, numbers.length));
	}
}
