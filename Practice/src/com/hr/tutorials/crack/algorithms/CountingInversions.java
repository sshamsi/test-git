package com.hr.tutorials.crack.algorithms;

import java.util.Arrays;

public class CountingInversions {

	public static void main(String[] args) {
		int[] arr = {2,1,3,1,2};
		long count = 0;
		while(true){
			long result = countInversionsBubbleSort(arr);
			count +=result;
			if(result==0){
				break;
			}
		}
		System.out.println("Count is "+count);
		System.out.println(Arrays.toString(arr));

	}
	
	public static long countInversionsBubbleSort(int[] arr){
		long count=0;
		for(int i=0; i<arr.length-1 ; i++){
			if(arr[i]>arr[i+1]){
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
				count++;
			}
		}
		return count;
	}
	
	public static long countInversionsMergeSort(int[] arr){
		long count=0;
		for(int i=0; i<arr.length ; i++){
			
		}
		return count;
	}

}
