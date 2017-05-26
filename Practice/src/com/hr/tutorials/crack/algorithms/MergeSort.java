package com.hr.tutorials.crack.algorithms;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int num[] = {5,4,3,2,1,10,9,8,7,6};
		int arr1[] = {6,7,8,9,10};
		int arr2[] = {1,2,3,4,5};
		merge(arr1, arr2);

	}
	
	public void mergeSort(int[] num){
		
		if(num.length>2){
			int middle = num.length/2;
			//mergeSort(0,middle);
		}
	}
	
	public static int[] merge(int[] arr1, int[] arr2){
		int[] mergedArray = new int[arr1.length+arr2.length];
		
		int i=0,j=0,k=0;
		
		while(i < arr1.length && j<arr2.length){
			if(arr1[i] < arr2[j]){
				mergedArray[k++]= arr1[i++];
			}
			else{
				mergedArray[k++]= arr2[j++];
			}
		}
		
		while(i<arr1.length){
			mergedArray[k++] = arr1[i++];
		}
		
		while(j<arr2.length){
			mergedArray[k++] = arr2[j++];
		}
		
		return mergedArray;
		
	}

}
