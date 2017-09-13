package com.hr.tutorials.crack.concepts;

import org.junit.Assert;
import org.junit.Test;


public class SquareRoot {
	
	@Test
	public void test1(){
		Assert.assertEquals((int)Math.sqrt(4), findSquareRoot(4));
	}
	
	@Test
	public void test2(){
		Assert.assertEquals((int)Math.sqrt(16), findSquareRoot(16));
	}
	
	@Test
	public void test3(){
		Assert.assertEquals((int)Math.sqrt(10), findSquareRoot(10));
	}
	
	@Test
	public void test4(){
		System.out.println(Math.sqrt(10));
	}
	
	public int findSquareRoot(int n){
		
		int m = n/2;
		while(m*m>n){
			m = m/2;
			System.out.println(m);
		}
		
		return m;
	}

}
