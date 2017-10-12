package com.hr.algorithms.strings;

import java.util.Arrays;

import org.junit.Test;

import org.junit.Assert;

public class Sherlock {

	
	@Test
	public void test1(){
		Assert.assertEquals("NO", isValid("aabbcd"));
	}
	
	@Test
	public void test2(){
		Assert.assertEquals("YES", isValid("abbcc"));
	}
	
	@Test
	public void test3(){
		Assert.assertEquals("YES", isValid("aabbcc"));
	}
	
	@Test
	public void test4(){
		Assert.assertEquals("NO", isValid("baacdd"));
	}
	
	@Test
	public void test5(){
		Assert.assertEquals("YES", isValid("aabbccc"));
	}
	
    static String isValid(String s){
        // Complete this function
    	int[] c = new int[26];
    	for(int i=0 ; i<s.length(); i++){
    		c[s.charAt(i) - 97]++ ;
    	}
    	System.out.println(Arrays.toString(c));
    	
    	int max=0;
    	for(int i=0 ; i<c.length; i++){
    		max = Math.max(max, c[i]);
    	}
    	
    	System.out.println(max);
    	
    	for(int i=0 ; i<c.length; i++){
    		if(c[i]==max){
    			c[i] = 0;
    		}
    	}
    	
    	System.out.println(Arrays.toString(c));
    	
    	int countNonZero=0;
    	for(int i=0 ; i<c.length; i++){
    		if(c[i]!=0){
    			countNonZero++;
    		}
    	}
    	
    	if(countNonZero>1){
    		return "NO";
    	}
    	else{
    		return "YES";
    	}
    	
    }

}
