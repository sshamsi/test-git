package com.practice.misc;

public class AverageUsingApacheCommonMath {

	public static void main(String[] args) {
		
		System.out.println(average(new double[]{1,2,3,4,100}));
		System.out.println(average(null));

	}
	
	public static double average(double[] numbers){
		double average = 0;
		for(double number: numbers){
			average = average + number/numbers.length;
		}
		return average;
	}
	
}
