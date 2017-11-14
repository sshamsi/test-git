package com.etrade.test;

import java.util.Arrays;

import org.junit.Test;

/**
 * 
 * @author Shazeb Shamsi
 * 
 */
public class Assignment1 {
	
	/*
	 * Returns highest number from the integer array.
	 * Throws IllegalArgumentException if array is null or empty.
	 */
	public int findHighest(int[] numbers){
		if(numbers==null){
			throw new IllegalArgumentException("numbers is null");
		}
		
		if(numbers.length<=0){
			throw new IllegalArgumentException("No elements found in numbers");
		}
		
		// Initialize max to lowest possible integer value
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<numbers.length ; i++){
			max = Math.max(max, numbers[i]);
		}
		
		return max;
	}

	/* Another method of finding highest number from integer array
	 * Guus, This method uses Java 1.8 Stream API I was referring to in our phone conversation 
	 * Returns highest number from the integer array.
	 * Throws IllegalArgumentException if array is null or empty.
	 */
	public int findHighestUsingStream(int[] numbers){
		if(numbers==null){
			throw new IllegalArgumentException("numbers is null");
		}
		
		if(numbers.length<=0){
			throw new IllegalArgumentException("No elements found in numbers");
		}
		
		return Arrays.stream(numbers).max().getAsInt();
	}
	
	@Test
	public void test1(){
		int numbers[] = {5, 4, 14, 7, 2, 18, 11};
		System.out.println(findHighest(numbers));
	}
	
	@Test
	public void test2(){
		int numbers[] = {5, 4, 14, 7, 2, -18, 11};
		System.out.println(findHighest(numbers));
	}
	
	@Test
	public void test3(){
		int numbers[] = {0};
		System.out.println(findHighest(numbers));
	}

	// Test for empty numbers array
	@Test(expected = IllegalArgumentException.class)
	public void test4(){
		int numbers[] = {};
		System.out.println(findHighest(numbers));
	}
	
	// Test for null numbers array
	@Test(expected = IllegalArgumentException.class)
	public void test5(){
		System.out.println(findHighest(null));
	}
	

}
