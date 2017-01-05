package com.practice.bitwise;

import org.junit.Test;

public class BitwiseTest {
	
	@Test
	public void checkPowerOf2_A(){
		int num = 4;
		System.out.println(Integer.toBinaryString(num));
		System.out.println(Integer.toBinaryString(num-1));
		System.out.println(num&num-1);
		System.out.println((num&num-1)==0);
	}
	
	@Test
	public void checkPowerOf2_B(){
		int num = 8;
		System.out.println(Integer.toBinaryString(num));
		System.out.println(Integer.toBinaryString(-num));
		System.out.println((num&-num)==num);
	}	
	
	@Test
	public void checkPowerOf2_C(){
		int input = 6;
		int num = input;
		boolean isPowerof2 = false;
		while(num%2==0){
			if(num==2){
				System.out.println(input+" is a power of 2");
				isPowerof2 = true;
			}
			num = num/2 ;
		}
		if(!isPowerof2){
			System.out.println(input+" is not a power of 2");
		}
	}
	
	@Test
	public void convertIntToBit(){
		for(int i=0 ; i<=8 ; i++){
			System.out.println(Integer.toBinaryString(i));
		}
	}

}
