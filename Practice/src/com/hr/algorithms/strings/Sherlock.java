package com.hr.algorithms.strings;

import java.util.Arrays;

import org.junit.Test;

import org.junit.Assert;

public class Sherlock {

	
	@Test
	public void test1(){
		Assert.assertEquals("NO", isValid1("aabbcd"));
	}
	
	@Test
	public void test2(){
		Assert.assertEquals("YES", isValid1("abbcc"));
	}
	
	@Test
	public void test3(){
		Assert.assertEquals("YES", isValid1("aabbcc"));
	}
	
	@Test
	public void test4(){
		Assert.assertEquals("NO", isValid1("baacdd"));
	}
	
	@Test
	public void test5(){
		Assert.assertEquals("YES", isValid1("aabbccc"));
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
    
    static String isValid1(String s){
        // Complete this function
    	int[] c = new int[26];
    	for(int i=0 ; i<s.length(); i++){
    		c[s.charAt(i) - 97]++ ;
    	}
    	System.out.println(Arrays.toString(c));
    	
        int firstNonZero=0;
        boolean first=false;
        int secondNonZero=0;
        
    	for(int i=0 ; i<s.length(); i++){
    		if(c[i]!=0){
    			if(!first){
    				firstNonZero = c[i];
    				first = true;
    			}
    			else if (c[i]!=firstNonZero){
    				secondNonZero = c[i];
    				break;
    			}
    		}
    	}
    	
    	System.out.println("firstNonZero "+firstNonZero);
    	System.out.println("secondNonZero "+secondNonZero);
    	
    	if(firstNonZero==0 || secondNonZero==0){
    		return "YES";
    	}
    	
    	int firstNonZeroCount=0;
    	int secondNonZeroCount=0;
    	
    	for(int i=0 ; i<s.length(); i++){
			if(c[i]==firstNonZero){
				firstNonZeroCount++;
			}
			else if (c[i]==secondNonZero){
				secondNonZeroCount++;
			}
    	}
    	
    	System.out.println("firstNonZeroCount "+firstNonZeroCount);
    	System.out.println("secondNonZeroCount "+secondNonZeroCount);
    	
    	if(firstNonZeroCount-secondNonZeroCount==1 || secondNonZeroCount-firstNonZeroCount==1){
    		return "YES";
    	}
    	else{
    		return "NO";
    	}
    	
    	
    	
    }

}
