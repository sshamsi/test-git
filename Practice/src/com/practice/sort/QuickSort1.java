package com.practice.sort;

import java.util.Arrays;

import org.junit.Test;

public class QuickSort1 {
	
	@Test
	public void test1(){
		int[] elements = {4,5,3,7,2};
		// 3,5,4,7,2
		// 3,2,4,7,5
		// 2,3,4,7,5
		quickSort(elements, 0, elements.length-1);
		System.out.println(Arrays.toString(elements));
	}
	
	@Test
	public void test2(){
		int[] elements = {38,81,22,48,13,69,93,14,45,58,79,72};
		quickSort(elements, 0, elements.length-1);
		System.out.println(Arrays.toString(elements));
	}
	
	public void quickSort(int[] elements, int low, int high){
		
		if(low<high){
			int partitionIndex = partition(elements, low, high);
			quickSort(elements, low, partitionIndex-1);
			quickSort(elements, partitionIndex+1, high);
		}
		
	}
	
	/**
	 * Puts the pivot at the right position in the array.
	 * This must be done in linear time.
	 * @param elements
	 * @param pivot
	 * @return Returns the index of the new position of the pivot
	 */
	public int partition(int[] elements, int low, int high){
		
		int pivotIndex = (low+high)/2;

		// swap pivot with low
		int pivot = elements[pivotIndex];
		elements[pivotIndex] = elements[low];
		elements[low] = pivot;
		
		int i = low+1;
		int j = high;
		
		
		while(i<=j){
			if(elements[i]>pivot && elements[j]<pivot){
				int temp = elements[i];
				elements[i] = elements[j];
				elements[j] = temp;
				i++;
				j--;
			}
			else if(elements[j]>pivot){
				j--;
			}
			else if(elements[i]<pivot){
				i++;
			}
		}
		
		// swap j with low
		elements[low] = elements[j]; 
		elements[j] = pivot;
		
		return j;
	}

}
