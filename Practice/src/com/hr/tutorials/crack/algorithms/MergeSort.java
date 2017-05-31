package com.hr.tutorials.crack.algorithms;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int num[] = {4,3,2,1};
		int[] mergedArray = mergeSort(num);
		System.out.println(Arrays.toString(mergedArray));

	}
	
	public static int[] mergeSort(int[] array){
		if(array.length==1){
			return array;
		}
		int[] leftHalf = Arrays.copyOfRange(array, 0, (array.length/2));
		int[] rightHalf = Arrays.copyOfRange(array, array.length/2, array.length);

		leftHalf = mergeSort(leftHalf);
		rightHalf = mergeSort(rightHalf);
		System.out.println(Arrays.toString(leftHalf));
		System.out.println(Arrays.toString(rightHalf));
		System.out.println("Calling merge ");
		return merge(leftHalf, rightHalf);
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
