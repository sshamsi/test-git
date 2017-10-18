package com.hr.algorithms.strings;

import org.junit.Assert;
import org.junit.Test;


public class RemoveDuplicateCharacters {
	
	@Test
	public void test1(){
		Assert.assertEquals("shazebmi", removeDuplicateCharacters("shazebshamsi"));
	}
	
	@Test
	public void test2(){
		Assert.assertEquals("shazeb", removeDuplicateCharacters("shazeb"));
	}
	
	@Test
	public void test3(){
		Assert.assertEquals("a", removeDuplicateCharacters("aaaaaaaaa"));
	}
	
	public String removeDuplicateCharacters(String input){
		
		char[] c = new char[26];
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<input.length(); i++){
			if(c[input.charAt(i) - 97]==0){
				sb.append(input.charAt(i));
				c[input.charAt(i) - 97]++;
			}	
		}
		
		return sb.toString();
	}

}
