package com.practice.bitwise;

import org.junit.Test;

import org.junit.Assert;

public class IntegerToBinary {
	
	@Test
	public void test1(){
		System.out.println(convert(25));
		System.out.println(Integer.toBinaryString(25));
		Assert.assertTrue(Integer.toBinaryString(25).equals(convert(25)));
	}
	
	public String convert(int n){
		StringBuilder sb = new StringBuilder();
		
		while(n>0){
			sb.append(n%2);
			n = n/2;
		}
		return sb.reverse().toString();
	}

}
