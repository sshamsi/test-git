package com.hr.algorithms.recursion;

import org.junit.Test;

public class PowerSum {
	
	@Test
	public void test1(){
		int result = pof(10, 2, 1);
		System.out.println(result);
		
	}
	
	
	public int pof(int x, int n, int i){
		
		double sum=0;
		for(int j=i+1 ; j<x ; j++){
			sum = Math.pow(i,n) + Math.pow(j, n);
			if(x-sum==0){
				
			}
		}
		
		return 0;
	}
	
	public int pof(int x, int n){
		int ways=0;
		
		for(int i=1; i<x; i++){
			for(int j=i+1; j<x ; j++){
				int sum = (int) Math.pow(i, n);
			}
		}
		
		
		
		/*int sum=0;
		for(int i=1 ; i<10 ;i++){
			if(x-sum==0){
				
			}
			sum += (int) Math.pow(i, n);
		}*/
		
		return 0;
	}

}
