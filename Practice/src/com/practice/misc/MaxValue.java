package com.practice.misc;

public class MaxValue {
	
	public static void main(String args[]){
		MaxValue maxValue = new MaxValue();
		int input[] = new int[]{5,-8,8};
		System.out.println("Max Value is "+maxValue.maxValue(input));
	}
	
	public int maxValue(int input[]){
		
		int maxValue = -1;
		
		if(input.length < 0){
			return maxValue;
		}
		
		for(int i=0; i<input.length; i++){
			if(input[i]>maxValue){
				maxValue = input[i];
			}
		}
		
		return maxValue;
	}
}
