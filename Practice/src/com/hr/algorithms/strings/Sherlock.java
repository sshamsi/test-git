package com.hr.algorithms.strings;

import java.util.Arrays;

import org.junit.Test;

import org.junit.Assert;

public class Sherlock {

	
	@Test
	public void test1(){
		Assert.assertEquals("NO", isValid2("aabbcd"));
	}
	
	@Test
	public void test2(){
		Assert.assertEquals("YES", isValid2("abbcc"));
	}
	
	@Test
	public void test3(){
		Assert.assertEquals("YES", isValid2("aabbcc"));
	}
	
	@Test
	public void test4(){
		Assert.assertEquals("NO", isValid2("baacdd"));
	}
	
	@Test
	public void test5(){
		Assert.assertEquals("YES", isValid2("aabbccc"));
	}
	
	@Test
	public void test6(){
		Assert.assertEquals("NO", isValid2("aaabbc"));
	}
	
	@Test
	public void test7(){
		Assert.assertEquals("YES", isValid2("aaabbbc"));
	}
	
    static String isValid(String s){
        // Complete this function
      	int[] c = new int[26];
      	for(int i=0 ; i<s.length(); i++){
      		c[s.charAt(i) - 97]++ ;
      	}
      	
      	int uniqueCharacters=0;
      	for(int i=0 ; i<c.length; i++){
      		if(c[i]!=0){
      			uniqueCharacters++;
      		}
      	}
      	
      	int[] characterFrequency = new int[uniqueCharacters];
      	int j=0;
      	for(int i=0 ; i<c.length; i++){
      		if(c[i]!=0){
      			characterFrequency[j++] = c[i];
      		}
      	}
      	
      	Arrays.sort(characterFrequency);
      	System.out.println(Arrays.toString(characterFrequency));
      	
      	int k = characterFrequency[characterFrequency.length-1];
      	System.out.println("k is "+k);
      	int count = 0;
     	for(int i=characterFrequency.length-2 ; i>=0; i--){
     		System.out.println("characterFrequency[i] is "+characterFrequency[i]);
      		if(characterFrequency[i]!=k){
      			count++;
      		}
      	}
     	
     	if(count>1){
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
    
    static String isValid2(String s){
        // Complete this function
    	int[] c = new int[26];
    	for(int i=0 ; i<s.length(); i++){
    		c[s.charAt(i) - 97]++ ;
    	}
    	//System.out.println(Arrays.toString(c));
    	
    	int uniqueCharacters=0;
    	for(int i=0 ; i<c.length; i++){
    		if(c[i]!=0){
    			uniqueCharacters++;
    		}
    	}
    	
    	int[] characterFrequency = new int[uniqueCharacters];
    	int j=0;
    	for(int i=0 ; i<c.length; i++){
    		if(c[i]!=0){
    			characterFrequency[j++] = c[i];
    		}
    	}
    	System.out.println(Arrays.toString(characterFrequency));
    	
    	if(isFrequencyConstant(characterFrequency)){
    		return "YES";
    	}
    	
    	for(int i=0; i<characterFrequency.length ; i++){
    		int k = characterFrequency[i];
    		if(k==1){
    			k++;
    		}
    		else{
    			k--;	
    		}
    		j=0;
    		while(j<characterFrequency.length){
    			if(i==j){
    				j++;
    			}
    			else if(characterFrequency[j]!=k){
    				break;
    			}
    			else{
    				j++;
    			}
    			
    		}
    		if(j==characterFrequency.length){
    			return "YES";
    		}
    	}
    	
    	
        return "NO";
    }
    
    public static boolean isFrequencyConstant(int[] characterFrequency){
    	int frequency = characterFrequency[0];
    	for(int i=0 ; i<characterFrequency.length ;i++){
    		if(frequency!=characterFrequency[i]){
    			return false;
    		}
    	}
    	return true;
    }

}
