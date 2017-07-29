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
	public void checkPowerOf4(){
		int num = 1048576;
		String binaryFormat = Integer.toBinaryString(num);
		System.out.println(binaryFormat);
		char[] binaryArray = binaryFormat.toCharArray();

		// First character must be 1
		if(binaryArray[0]!='1'){
			System.out.println(num+" is not a power of 4");
			return;
		}
		// Remaining characters must be 0
		for(int i=1 ; i < binaryArray.length ; i++){
			if(binaryArray[i]!='0'){
				System.out.println(num+" is not a power of 4");
				return;
			}
		}
		// Remaining 0 characters must be even
		if((binaryArray.length-1)%2!=0){
			System.out.println(num+" is not a power of 4");
			return;
		}
		System.out.println(num+" is a power of 4");
	}
	
	@Test
	public void convertIntToBit(){
		for(int i=0 ; i<=8 ; i++){
			System.out.println(Integer.toBinaryString(i));
		}
	}
	
	@Test
	public void xor(){
		int a = 2;
		int b = 4;
		int c = 4;
		System.out.println(Integer.toBinaryString(a^b^c));
		System.out.println(a^b^c);
	}

}
