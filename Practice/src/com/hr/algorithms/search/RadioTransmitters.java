package com.hr.algorithms.search;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.junit.Test;

public class RadioTransmitters {
	
	@Test
	public void test1(){
		int range=2;
		int[] houses = {7,2,4,6,5,9,12,11};
		findMinimumTransmitters(houses, range);
	}
	
	@Test
	public void test2(){
		int range=1;
		int[] houses = {5,4,3,2,1};
		findMinimumTransmitters(houses, range);
	}
	
	public void findMinimumTransmitters(int[] houses, int range){
		Set<Integer> set = IntStream.of(houses).boxed().collect(Collectors.toSet());
		Set<Integer> transmitterHouses = new HashSet<Integer>();
		
		int startIndex = Arrays.stream(houses).min().getAsInt();
		int endIndex = Arrays.stream(houses).max().getAsInt() + 1;
		
		for(int i=startIndex; i<endIndex; i++){
			if(set.contains(i)){
				for(int j=i+range ; j>=i ; j--){
					if(set.contains(j)){
						transmitterHouses.add(j);
						i=j+range;
						break;
					}
				}
			}
		}
		
		transmitterHouses.forEach(System.out::println);
		
		System.out.println("transmitterHouses size "+transmitterHouses.size());
	}

}
