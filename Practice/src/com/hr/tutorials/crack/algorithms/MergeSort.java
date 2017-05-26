package com.hr.tutorials.crack.algorithms;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		//int num[] = {5,4,3,2,1,10,9,8,7,6};
		int num[] = {4,3,2,1};
		mergeSort(num, 0, num.length-1);
		System.out.println(Arrays.toString(num));

	}
	
	public static void mergeSort(int[] arr, int left, int right){
		
		if(left<right){
			int middle = (left + right)/2;
			mergeSort(arr, left, middle);
			mergeSort(arr, middle+1, right);
			merge(arr, left, middle, right);
		}
		
	}
	
	public static void merge(int[] arr, int left, int middle, int right){
		int[] arr1 = new int[middle - left + 1];
		for(int i=0; i< arr1.length ; i++){
			arr1[i] = arr[left + i];
		}
		int[] arr2 = new int[right-middle];
		for(int j=0; j < arr2.length ; j++){
			arr2[j] = arr[left + middle + j];
		}
		merge(arr1, arr2);
	}
	
	public static int[] merge(int[] arr1, int[] arr2){
		System.out.println("merge(int[],int[])"+Arrays.toString(arr1));
		System.out.println("merge(int[],int[])"+Arrays.toString(arr2));
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
