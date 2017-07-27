package com.hr.tutorials.crack.concepts;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fibonacciSeries(10);

	}
	
	public static void fibonacciSeries(int count){
		
		int n1 = 0;
		int n2 = 1;
		int n3;
		
		System.out.print(n1+" "+n2);
		
		for(int i=2; i<count ; i++){
			n3 = n2 + n1;
			System.out.print(" "+n3);
			n1 = n2;
			n2 = n3;
			
		}
	}
	
}
